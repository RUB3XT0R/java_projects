package dao;


import java.sql.*;

class ConnectionFactory {

   protected static Connection getConnection() {
      try {
         Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
         return (Connection) DriverManager.getConnection(
                 "jdbc:microsoft:sqlserver://dbsq0006.whservidor.com:1433","ittraining1","meleca02"); 
      }catch (ClassNotFoundException ex) {return null;} 
       catch (SQLException s) {return null;}
   }
}
