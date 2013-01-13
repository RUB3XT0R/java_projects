
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.Curso;


public class CursoDao extends Dao{
    
    
    public boolean addCurso(Curso c) {
        try {
            executeCommand(
                    "INSERT INTO curso set "
                    + "Nome=?,"
                    + "cargaHora=?,"
                    + "investimento=?",
                    c.getNome(), c.getCargaHora(), c.getInvestimento());
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    public boolean upCurso(Curso c) {
        try {
            executeCommand("UPDATE curso set "
                    + "Nome=?,"
                    + "cargaHora=?,"
                    + "investimento=? where id=?",
                    c.getNome(), c.getCargaHora(), c.getInvestimento(),c.getId());
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    public boolean delCurso(int id) {
        try {
            executeCommand("delete from curso where id=?",id);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    public boolean contains(String nome) {
        try {
            return contain("curso","nome",nome);
        } catch (SQLException ex) {return true;}
    }
    public boolean contains(int idCurso) {
        try {
            return contain("curso","id",idCurso);
        } catch (SQLException ex) {return true;}
    }
    public Curso getCurso(int id) {
        try {
            ResultSet rs = executeQuery("select * from curso where id=?",id);
            Curso curso = rs.next()? populateCurso(rs) : null;
            rs.close();
            return curso;
        } catch (SQLException e) {return null;}
    }
    public Curso getCurso(String nome) {
        try {
            ResultSet rs = executeQuery("select * from curso where nome=?",nome);
            Curso curso = rs.next()? populateCurso(rs) : null;
            rs.close();
            return curso;
        } catch (SQLException e) {return null;}
    }
    public List<Curso> getCursos() {
        try {
            ResultSet rs = executeQuery("SELECT * FROM curso order by nome");
            List<Curso> cursos = new LinkedList<Curso>(); 
            while(rs.next()) cursos.add(populateCurso(rs));
            rs.close();
            return cursos;
        } catch (SQLException e) {
            System.out.println(e);
            return null;}
    }
    public Curso populateCurso(ResultSet rs) throws SQLException{
        Curso cursos = new Curso();
        cursos.setId(rs.getInt("id"));
        cursos.setNome(rs.getString("nome"));
        cursos.setCargaHora(rs.getInt("cargaHora"));
        cursos.setInvestimento(rs.getFloat("investimento"));
        return cursos;
    }
    
    
    
}
