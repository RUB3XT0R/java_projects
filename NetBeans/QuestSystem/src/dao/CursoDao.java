package dao;

import dao.Dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Curso;
import model.Interessado;

public class CursoDao extends Dao{
   

   public boolean adiciona(Curso curso) {
      try {
         executeCommand("insert into cursos set nome=?",curso.getNome());
      } catch (SQLException e) { return false; }
      return true;
   }

   public boolean altera(Curso curso) {
      try {
         executeCommand("update cursos set nome=? where cod_Curso=?", curso.getNome(), curso.getCod_Curso());
      } catch (SQLException e) { return false; }
      return true;
   }

   public boolean remove(Curso curso){ return remove(curso.getCod_Curso());}
   public boolean remove(int id) {
      try {
         executeCommand("delete from interessados_cursos where cod_Curso=?",id);
         executeCommand("delete from cursos where cod_Curso=?",id);
         new InteressadoDao().delCurso(new Curso(id));
      } catch (SQLException e) { return false; }
      return true;
   }
   
   public List<Curso> getLista() throws SQLException {
        List<Curso> cursos = new ArrayList<>();
        try (ResultSet rs = executeQuery("select * from cursos")) {
            if(rs.next()) do { cursos.add(populate(rs)); } while (rs.next());
        }
        close();
        return cursos;
   }
   
   public Curso get(int cod_Curso) throws SQLException {
        Curso curso;
        try (ResultSet rs = executeQuery("select * from cursos where cod_Curso=?",cod_Curso)) {
            curso = rs.next()? populate(rs) : new Curso();
        }
        close();
        return curso;
   }
   
   private Curso p;
   public Curso populate(ResultSet rs) throws SQLException {
      p = new Curso();
      p.setCod_Curso(rs.getInt("cod_Curso"));
      p.setNome(rs.getString("nome"));
      return p;
   }
   
   
    public List<Curso> getCursos(Interessado p) {
        List<Curso> toreturn = new LinkedList<>();
        try ( ResultSet rs = executeQuery( "select cod_Curso,cursos.nome from cursos "
                + "join interessados_cursos  using (cod_Curso) "
                + "join interessados using (cod_Interessado)"
                + "where cod_Interessado=?",
                p.getCod_Interessado())){
            if(rs.next()) do{ toreturn.add( populate(rs) );  }while(rs.next()); 
        }catch (SQLException ex) { ex.printStackTrace(); }
        return toreturn;
    }
}
