package dao;

import com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

   private static Connection conn;
   private PreparedStatement ps;
   private ResultSet rs;

   public Dao() {
      try { conn = Dao.getConnection();
      } catch (SQLException ex) {ex.printStackTrace();}
   }

   private static Connection getConnection() throws SQLException {
      if ( conn == null ) conn = ConnectionFactory.getConnection();
      return conn;
   }
 
   private PreparedStatement getStatement(String statement) throws SQLException{
        try {
            return conn.prepareStatement(statement);
        } catch (MySQLNonTransientConnectionException ex) {
             conn = ConnectionFactory.getConnection();
             return conn.prepareStatement(statement);
        }
   }

   private void makeStatement(String query, Object... params) throws SQLException {
      ps = getStatement(query);
      for (int i = 0; i < params.length; i++) {
         ps.setObject(i + 1, params[i]);
      }
   }

   protected final void executeCommand(String query, Object... params) throws SQLException {
      makeStatement(query, params);
      ps.executeUpdate();
      close();
   }

   protected void close() throws SQLException {
        ps.close();
        conn.close();
    }
   protected final ResultSet executeQuery(String query, Object... params) throws SQLException {
      makeStatement(query, params);
      rs = ps.executeQuery();
      return rs;
   }

   protected final boolean contain(String tableName,String field, Object value) throws SQLException{
        rs = executeQuery( "select * from "+tableName+" where "+field+"=?",value);
        boolean result = rs.next();
        rs.close();
        return result;
    }

   protected final boolean contain(String tableName, Tupla... tuplas) throws SQLException {
      String query = "select * from " + tableName + " where ";
      int length = tuplas.length;
      Object[] values = new Object[length];
      for (int i = 0; i < length; i++) {
         query += tuplas[i].field + "=?";
         values[i] = tuplas[i].value;
         if (i < length - 1) query += " and ";
      }
      rs = executeQuery(query, values);
      boolean result = rs.next();
      rs.close();
      return result;
   }

   protected final int getIDFromLastInsert(String table,String key) {
      try {
         int ultimoId = -1;
         rs = executeQuery("select max("+key+") as idMax from " + table);
         if (rs.next()) ultimoId = rs.getInt("idMax");
         rs.close();
         return ultimoId;
      } catch (SQLException ex) {
         return -1;
      }
   }

   public final int getNextId(String tableName) throws SQLException {
      rs = executeQuery("select max(id) from " + tableName);
      rs.next();
      Object o = rs.getObject(1);
      Integer toreturn = (o == null) ? 1 : ((Integer) o) + 1;
      rs.close();
      return toreturn;
   }

   public class Tupla {
      private String field;
      private Object value;
      public Tupla(String field, Object value) {
         this.field = field;
         this.value = value;
      }
   }
}
