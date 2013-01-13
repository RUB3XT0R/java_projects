package dao;

import java.sql.*;

public class Dao {

   private Connection conn;
   private PreparedStatement ps;
   private ResultSet rs;

   Dao() {
      try {conn = getConnection();} catch (SQLException ex) {ex.printStackTrace();}
   }

   private Connection getConnection() throws SQLException {
      if (null == conn || conn.isClosed()) 
         conn = ConnectionFactory.getConnection();
      return conn;
   }

   private Statement getStatement() throws SQLException{
      return getConnection().createStatement();
   }
   private PreparedStatement getStatement(String statement) throws SQLException {
      return getConnection().prepareStatement(statement);
   }

   private void makeStatement(String query, Object... params) throws SQLException {
      ps = getStatement(query);
      for (int i = 0; i < params.length; i++) {
         ps.setObject(i + 1, params[i]);
      }
   }

   protected final int executeCommand(String query, Object... params) throws SQLException {
      makeStatement(query, params);
      int result = ps.executeUpdate();
      ps.close();
      return result;
   }

   protected final ResultSet executeQuery(String query, Object... params) throws SQLException {
      makeStatement(query, params);
      rs = ps.executeQuery();
      return rs;
   }

   protected final boolean contain(String tableName,String field, Object value) throws SQLException{
        rs = executeQuery(
                "select * from "+tableName+" where "+field+"=?",value);
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
