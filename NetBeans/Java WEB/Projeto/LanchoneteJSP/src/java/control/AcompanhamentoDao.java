
package control;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.Acompanhamento;
public class AcompanhamentoDao extends Dao{
    
    public  boolean insert(Acompanhamento  a){
        try {
        executeCommand(
                "insert into acompanhamento (descricao,preco,qtde)"
                + "values(?,?,?)",
                a.getDescricao(),a.getPreco(),a.getQtde()
        );
        return true;
        } catch (SQLException ex) {
           return false;
        }
    }

    public boolean remove(int id){
        try {
        executeCommand("delete from acompanhamento where id=?",id);
        return true;
        } catch (SQLException ex) {
           return false;
        }
    }

    public boolean update(Acompanhamento  a){
        try {
        executeCommand(
                "update acompanhamento set descricao=?,preco=?,qtde=? where id=?",
                a.getDescricao(),a.getPreco(),a.getQtde(),a.getId()
        );
        return true;
        } catch (SQLException ex) {
           return false;
        }
    }
    
    public boolean contain(String descricao,int qtde){
        try {
            ResultSet rs = executeQuery("select * from acompanhamento where descricao=? and qtde=?",descricao,qtde);
            boolean result = rs.next();
            rs.close();
            return result;
        } catch (SQLException ex) {
            return true;
        }
    }
    
    
    public Acompanhamento getAcompanhamento(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from acompanhamento where id=?",id);
        return  (rs.next())? populateAcompanhamento(rs) : null;
    }

    public List<Acompanhamento> getAcompanhamentos() throws SQLException{
        ResultSet rs = executeQuery("select * from acompanhamento");
        return selectList(rs);
    }

   
    public List<Acompanhamento> getAcompanhamentos(String nome) throws SQLException{
        ResultSet rs = executeQuery("select * from acompanhamento where descricao like ?","%"+nome+"%");
        return selectList(rs);
    }

    private List<Acompanhamento> selectList(ResultSet rs) throws SQLException{
        List<Acompanhamento> toreturn = new LinkedList<Acompanhamento>();
        while (rs.next())
            toreturn.add(populateAcompanhamento(rs));
        rs.close();
        return toreturn;
    }

    public static Acompanhamento populateAcompanhamento(ResultSet rs) throws SQLException {
        Acompanhamento toreturn = new Acompanhamento();
        toreturn.setId(rs.getInt("id"));
        toreturn.setDescricao(rs.getString("descricao"));
        toreturn.setPreco(rs.getFloat("preco"));
        toreturn.setQtde(rs.getInt("qtde"));
        return toreturn;
    }
    
}
