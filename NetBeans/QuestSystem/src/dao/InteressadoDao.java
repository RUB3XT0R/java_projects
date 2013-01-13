package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Curso;
import model.Interessado;

public class InteressadoDao extends Dao{
   
   

   public boolean adiciona(Interessado interessado, boolean addComCursos) {
      try {
         char semcurso = ( addComCursos ? 'n' : 'y' );
         executeCommand("insert into interessados set nome=?, email=?, telefoneR=?, telefoneC=?, celular=?, semcurso='"+semcurso+"'",
                 interessado.getNome(),interessado.getEmail(),interessado.getTelefoneR(),interessado.getTelefoneC(),
                 interessado.getCelular());
          System.out.println("insert into interessados set nome=?, email=?, telefoneR=?, telefoneC=?, celular=?, semcurso='"+semcurso+"'");
         int id = getIDFromLastInsert("interessados","cod_Interessado");
         if(addComCursos) for(Curso c : interessado.getCursos()) addCurso(c, id);
      } catch (SQLException e) {
          e.printStackTrace();
         return false;
      }
      return true;
   }
   public void addCurso(Curso c, int idInteressado) throws SQLException{
       executeCommand("insert into interessados_cursos set cod_Curso=?, cod_Interessado=?",c.getCod_Curso(),idInteressado);
   }

   public boolean altera(Interessado interessado) {
      try {
          char semcurso = (interessado.getCursos().isEmpty() ? 'y' : 'n' );
         executeCommand("update interessados set nome=?, telefoneR=?, telefoneC=?, celular=?, semcurso='"+semcurso+"' "
                 + "where cod_Interessado=?", 
                 interessado.getNome(),interessado.getTelefoneR(),interessado.getTelefoneC(),
                 interessado.getCelular(),interessado.getCod_Interessado());
      } catch (SQLException e) {
          e.printStackTrace();
         return false;
      }
      return true;
   }
   public boolean alteraEmail(Interessado interessado) {
      try {
          char semcurso = (interessado.getCursos().isEmpty() ? 'y' : 'n' );
         executeCommand("update interessados set email=? where cod_Interessado=?", 
                 interessado.getEmail(),interessado.getCod_Interessado());
      } catch (SQLException e) {
          e.printStackTrace();
         return false;
      }
      return true;
   }
   
   public void delCurso(Curso c, int idInteressado) throws SQLException{
       executeCommand("delete from interessados_cursos where cod_Curso=? and cod_Interessado=?",
               c.getCod_Curso(),idInteressado);
   }
   public void delCurso(Curso c) throws SQLException{
       executeCommand("delete from interessados_cursos where cod_Curso=?",c.getCod_Curso());
   }

   public boolean remove(Interessado interessado){ return remove(interessado.getCod_Interessado());}
   public boolean remove(int id) {
      try {
         executeCommand("delete from interessados_cursos where cod_Interessado=?",id);
         executeCommand("delete from interessados where cod_Interessado=?",id);
      } catch (SQLException e) {
         return false;
      }
      return true;
   }
   
   public List<Interessado> getLista() throws SQLException {
        List<Interessado> interessados = new ArrayList<>();
        try (ResultSet rs = executeQuery("select * from interessados")) {
            while (rs.next())  interessados.add(populateInteressado(rs,true));
        }    
        close();
        return interessados;
   }
   
   public List<Interessado> getListaPorNome(String nome) throws SQLException {
        List<Interessado> interessados = new ArrayList<>();
        try (ResultSet rs = executeQuery("select * from interessados where nome like ?","%"+nome+"%")) {
            while (rs.next())  interessados.add(populateInteressado(rs,true));
        }
        close();
        return interessados;
   }
   public List<Interessado> getListaPorEmail(String email) throws SQLException {
        List<Interessado> interessados = new ArrayList<>();
        try (ResultSet rs = executeQuery("select * from interessados where email like ?","%"+email+"%")) {
            while (rs.next())  interessados.add(populateInteressado(rs,true));
        }
        close();
        return interessados;
   }
    public List<Interessado> getListaSemCurso() throws SQLException {
        List<Interessado> interessados = new ArrayList<>();
        try (ResultSet rs = executeQuery("select * from interessados where semcurso='y'")) {
            while (rs.next())  interessados.add(populateInteressado(rs,true));
        }
        close();
        return interessados;
   }
   public List<Interessado> getLista(String curso) throws SQLException {
        List<Interessado> interessados = new ArrayList<>();
        try (ResultSet rs = executeQuery(
                "select cod_Interessado,interessados.nome,email,telefoneR,telefoneC,celular "
                + "from interessados "
                + "join interessados_cursos  using (cod_Interessado) "
                + "join cursos using (cod_Curso) "
                + "where cursos.nome=?",curso)) {
            while (rs.next())  interessados.add(populateInteressado(rs,true));
        }
        close();
        return interessados;
   }
   public List<Interessado> getLista(Curso curso) throws SQLException {
        List<Interessado> interessados = new ArrayList<>();
        try (ResultSet rs = executeQuery("select cod_Interessado,interessados.nome,email,telefoneR,telefoneC,celular "
                + "from interessados "
                + "join interessados_cursos  using (cod_Interessado) "
                + "join cursos using (cod_Curso) "
                + "where cursos.cod_Curso=?",curso.getCod_Curso())) {
            while (rs.next())  interessados.add(populateInteressado(rs,true));
        }
        close();
        return interessados;
   }
    public List<Interessado> getLista(List<Curso> cursos) throws SQLException {
        List<Interessado> interessados = new ArrayList<>();
        String sql= "select cod_Interessado,interessados.nome,email,telefoneR,telefoneC,celular "
                + "from interessados "
                + "join interessados_cursos  using (cod_Interessado) "
                + "join cursos using (cod_Curso) "
                + "where cursos.cod_Curso in (";
        for(Curso c : cursos) sql+=""+c.getCod_Curso();
       sql+=")";
        
        try (ResultSet rs = executeQuery(sql)) {
            while (rs.next())  interessados.add(populateInteressado(rs,true));
        }
        close();
        return interessados;
   }
   
   public Interessado get(int cod_Interessado) throws SQLException {
        Interessado interessado;
        try (ResultSet rs = executeQuery("select * from interessados where cod_Interessado=?",cod_Interessado)) {
            interessado = rs.next()? populateInteressado(rs,true) : new Interessado();
        }
        close();
        return interessado;
   }
   
   private CursoDao dao = new CursoDao();
   private Interessado p;
   public Interessado populateInteressado(ResultSet rs,boolean comCursos) throws SQLException {
      p = new Interessado();
      p.setCod_Interessado(rs.getInt("cod_Interessado"));
      p.setNome(rs.getString("nome"));
      p.setEmail(rs.getString("email"));
      p.setTelefoneR(rs.getString("telefoneR"));
      p.setTelefoneC(rs.getString("telefoneC"));
      p.setCelular(rs.getString("celular"));
      if(comCursos)  p.setCursos( dao.getCursos(p) );
      return p;
   }

   
   
    

}
