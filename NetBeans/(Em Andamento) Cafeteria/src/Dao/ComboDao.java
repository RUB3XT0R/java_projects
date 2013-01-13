

package Dao;

import Modelo.Combo;
import Modelo.ComboItens;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ComboDao extends Dao{

    public ComboDao(){}

    public int insertCombo(Combo combo,boolean addComItens) throws SQLException{
        combo.setId(getNextId("combos"));

        if(addComItens)
            for (ComboItens item : combo.getLanches()) insertComboItem(item);

        executeCommand(
                "insert into combos (id,descricao,preco)"
                + "values(?,?,?)",
                combo.getId(),combo.getDescricao(),combo.getPreco()
        );
        return combo.getId();
    }

    public int insertComboItem(ComboItens item) throws SQLException {
        item.setId((getNextId("combos_lanches")));
        executeCommand(
                "insert into combos_lanches (id,id_combo,id_lanche,qtde) values (?,?,?,?)",
                item.getId(), item.getCombo().getId(), item.getLanche().getId(), item.getQtde()
        );
        return item.getId();
    }

    public void updateCombo(Combo combo, boolean atualizaComItens) throws SQLException{
        if(atualizaComItens)
            for (ComboItens item : combo.getLanches()) updateComboItem(item);

        executeCommand(
                "update combos set descricao=?,preco=? where id=?",
                combo.getDescricao(),combo.getPreco(),combo.getId()
        );
    }

    public void updateComboItem(ComboItens item) throws SQLException {
        executeCommand(
                "update combos_lanches set id_combo=?,id_lanche=?,qtde=? where id=?",
                item.getCombo().getId(),item.getLanche().getId(),item.getQtde(),item.getId()
         );
    }

    public float getTotalDoCombo(Combo combo) {
        float TotalDoCombo = 0f;
        for (ComboItens item : combo.getLanches()) {
            TotalDoCombo += item.getLanche().getPreco() * item.getQtde();
        }
        return TotalDoCombo;
    }

    public void removeCombo(int id) throws SQLException {
        executeCommand("delete from combos_lanches where id=?", id);
        executeCommand("delete from combos where id=?", id);
    }

    public void removeComboItem(int id) throws SQLException {
        executeCommand("delete from combos_lanches where id=?", id);
    }

    public Combo getCombo(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from combos where id=?",id);
        Combo combo = (rs.next())?  populateCombo(rs, true) : null;
        rs.close();
        return combo;
    }

    public List<Combo> getAllCombos() throws SQLException{
        ResultSet rs = executeQuery("Select * from combos");
        List<Combo> toreturn =new LinkedList<Combo>();
        while(rs.next()){
            toreturn.add(populateCombo(rs,true));
        }
        rs.close();
        return toreturn;
    }

    public List<Combo> getCombos(String str) throws SQLException{
        ResultSet rs = executeQuery("Select * from combos where descricao like ?","%"+str+"%");
        List<Combo> toreturn =new LinkedList<Combo>();
        while(rs.next()){
            toreturn.add(populateCombo(rs,true));
        }
        rs.close();
        return toreturn;
    }

    public Combo populateCombo(ResultSet rs, boolean populateComItens) throws SQLException {
        Combo combo = new Combo();
        combo.setId(rs.getInt("id"));
        combo.setDescricao(rs.getString("descricao"));
        combo.setPreco(rs.getFloat("preco"));
        if(populateComItens)
            combo.setLanches(getComboItens(combo));
        return combo;
    }

    public ComboItens getComboItem(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from combos_lanches where id=?",id);
        ComboItens item = (rs.next())?  populateComboLanche(rs) : null;
        rs.close();
        return item;
    }

    public List<ComboItens> getComboItens(Combo l) throws SQLException{
        List<ComboItens> toreturn = new LinkedList<ComboItens>();
        ResultSet rs = executeQuery("select * from combos_lanches where id_combo=?",l.getId());
        while(rs.next()) toreturn.add(populateComboLanche(rs,l));
        rs.close();
        return toreturn;
    }

    public ComboItens populateComboLanche(ResultSet rs, Combo... combo) throws SQLException {
        ComboItens item = new ComboItens();
        LancheDao lanche = new LancheDao();
        item.setId(rs.getInt("id"));
        item.setQtde(rs.getInt("qtde"));
        item.setLanche(lanche.getLanche(rs.getInt("id_lanche")));
        item.setCombo( (combo!=null && combo.length >0) ?  combo[0] : getCombo(rs.getInt("id_combo")) );
        return item;
    }

    public int getNextKey() throws SQLException{
        return getNextId("combos");
    }
}
