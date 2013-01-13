

package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.*;


public class AmbulanciaDao extends Dao {

    private FuncionarioDao fdao = new FuncionarioDao();

     public void inserirAmbulancia(Ambulancia a) throws SQLException{
        executeCommand(
                "insert into ambulancias "
                + "(numero,placa)"
                + "values(?,?)",
                a.getNumero(),a.getPlaca()
        );
    }
     public int inserirAtribuicaoMotorista(AtribuicaoMotorista a) throws SQLException{
        executeCommand(
                "insert into atribuicao_motorista"
                + "(inicio,fim,id_funcionario,numero_amb)"
                + "values(?,?,?,?)",
                a.getInicio(),a.getFim(),a.getFuncionario().getId(),a.getAmbulancia().getNumero()
        );
        ResultSet rs = executeQuery("select id from atribuicao_motorista where inicio=? and fim=? and id_funcionario=? and numero_amb=?",a.getInicio(),a.getFim(),a.getFuncionario().getId(),a.getAmbulancia().getNumero());
        while(rs.next())  a.setId(rs.getInt("id"));

        return a.getId();
    }
    public void updateAtribuicaoMotorista(AtribuicaoMotorista a) throws SQLException{
        executeCommand(
                "update atribuicao_motorista"
                + "set inicio=?,fim=?,id_funcionario=?,numero_amb=? where id=?",
                a.getInicio(),a.getFim(),a.getFuncionario().getId(),a.getAmbulancia().getNumero(),a.getId()
        );
    }

    public void removeAmbulancia(int numero) throws SQLException {
        executeCommand("delete from ambulancias where numero=?", numero);
        executeCommand("delete from atribuicao_motorista where numero_amb=?",numero);
    }

    public void removeAtribuicaoMotorista(int id) throws SQLException {
        executeCommand("delete from atribuicao_motorista where id=?", id);
    }

    public Ambulancia getAmbulancia(int numero) throws SQLException{
        ResultSet rs = executeQuery("select * from ambulancias where numero=?", numero);
        Ambulancia a= (rs.next())?  populateAmbulancia(rs) : null;
        rs.close();
        return a;
    }

    public List<Ambulancia> getAllAmbulancias() throws SQLException{
        ResultSet rs = executeQuery("Select * from ambulancias");
        List<Ambulancia> as =new LinkedList<Ambulancia>();
        while(rs.next()){
            as.add(populateAmbulancia(rs));
        }
        rs.close();
        return as;
    }

     public AtribuicaoMotorista getAtribuicaoMotorista(int numero) throws SQLException{
        ResultSet rs = executeQuery("select * from atribuicao_motorista where id=?", numero);
        AtribuicaoMotorista a= (rs.next())?  populateAtribuicaoMotorista(rs) : null;
        rs.close();
        return a;
    }

    public List<AtribuicaoMotorista> getAllAtribuicaoMotoristas() throws SQLException{
        ResultSet rs = executeQuery("Select * from atribuicao_motorista");
        List<AtribuicaoMotorista> as =new LinkedList<AtribuicaoMotorista>();
        while(rs.next()){
            as.add(populateAtribuicaoMotorista(rs));
        }
        rs.close();
        return as;
    }
    
    public Ambulancia populateAmbulancia(ResultSet rs) throws SQLException {
        Ambulancia a = new Ambulancia();
        a.setNumero(rs.getInt("numero"));
        a.setPlaca("placa");
        return a;
    }

    public AtribuicaoMotorista populateAtribuicaoMotorista(ResultSet rs) throws SQLException {
        AtribuicaoMotorista a = new AtribuicaoMotorista();
        a.setFim(rs.getDate("fim"));
        a.setInicio(rs.getDate("inicio"));
        a.setId(rs.getInt("id"));
        a.setFuncionario(fdao.getFuncionario(rs.getInt("id_funcionario")));
        a.setAmbulancia(getAmbulancia(rs.getInt("numero_amb")));
        return a;
    }
}
