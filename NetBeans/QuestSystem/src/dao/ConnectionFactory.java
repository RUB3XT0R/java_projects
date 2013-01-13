package dao;

import com.mysql.jdbc.Connection;
import java.sql.*;

class ConnectionFactory {

   protected static Connection getConnection() {
      try {
         Class.forName("com.mysql.jdbc.Driver");
         return (Connection) DriverManager.getConnection(//"jdbc:mysql://localhost:3306/questtraining", "root", "cdf2525"); 
          "jdbc:mysql://mysql01.questtraining.hospedagemdesites.ws:3306/questtraining", "questtraining", "mysql13"); 
      }catch ( ClassNotFoundException | SQLException ex) {ex.printStackTrace();return null;}
   }
}
