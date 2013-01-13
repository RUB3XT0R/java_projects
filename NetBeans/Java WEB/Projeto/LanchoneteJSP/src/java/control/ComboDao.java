

package control;

import modelo.Combo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ComboDao extends Dao{

    public ComboDao(){}

    public boolean insertCombo(Combo c,float total){
        try {
            executeCommand("insert into combos set "
                    + "descricao=?, "
                    + "preco=?, "
                    + "lanche_id=?, "
                    + "bebidas_id=?, "
                    + "acompanhamento_id=?, "
                    + "qtde_lanche=?, "
                    + "qtde_bebida=?, "
                    + "qtde_acompanhamento=? ",
                    c.getDescricao(),total,c.getLanche().getId(),
                    c.getBebida().getId(),c.getAcompanhamento().getId(),
                    c.getQtde_lanche(),c.getQtde_bebida(),c.getQtde_acompanhamento());
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean updateCombo(Combo c,float total){
        try {
            executeCommand("update combos set "
                    + "descricao=?, "
                    + "preco=?, "
                    + "lanche_id=?, "
                    + "bebidas_id=?, "
                    + "acompanhamento_id=?, "
                    + "qtde_lanche=?, "
                    + "qtde_bebida=?, "
                    + "qtde_acompanhamento=? where id=?",
                    c.getDescricao(),total,c.getLanche().getId(),
                    c.getBebida().getId(),c.getAcompanhamento().getId(),
                    c.getQtde_lanche(),c.getQtde_lanche(),c.getQtde_acompanhamento(),
                    c.getId());
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }


    public boolean removeCombo(int id){
        try {
            executeCommand("delete from combos where id=?", id);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }


    public Combo getCombo(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from combos where id=?",id);
        Combo combo = (rs.next())?  populateCombo(rs) : null;
        rs.close();
        return combo;
    }

    public List<Combo> getAllCombos() throws SQLException{
        ResultSet rs = executeQuery("Select * from combos");
        List<Combo> toreturn =new LinkedList<Combo>();
        while(rs.next()){
            toreturn.add(populateCombo(rs));
        }
        rs.close();
        return toreturn;
    }

    public List<Combo> getCombos(String str) throws SQLException{
        ResultSet rs = executeQuery("Select * from combos where descricao like ?","%"+str+"%");
        List<Combo> toreturn =new LinkedList<Combo>();
        while(rs.next()){
            toreturn.add(populateCombo(rs));
        }
        rs.close();
        return toreturn;
    }

    public Combo populateCombo(ResultSet rs) throws SQLException {
        Combo combo = new Combo();
        combo.setId(rs.getInt("id"));
        combo.setDescricao(rs.getString("descricao"));
        combo.setPreco(rs.getFloat("preco"));
        combo.setLanche(new LancheDao().getLanche(rs.getInt("lanche_id")));
        combo.setBebida(new BebidaDao().getBebida(rs.getInt("bebidas_id")));
        combo.setAcompanhamento(new AcompanhamentoDao().getAcompanhamento(rs.getInt("Acompanhamento_id")));
        combo.setQtde_acompanhamento(rs.getInt("qtde_acompanhamento"));
        combo.setQtde_bebida(rs.getInt("qtde_bebida"));
        combo.setQtde_lanche(rs.getInt("qtde_lanche"));
        return combo;
    }

    public boolean contain(String nome ){
        try {
            return contain("combos","descricao",nome);
        } catch (SQLException ex) {
            return true;
        }
    }

}
