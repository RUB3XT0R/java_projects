package dao;

import com.mysql.jdbc.Connection;
import java.sql.*;

class ConnectionFactory {

   protected static Connection getConnection() {
      try {
         Class.forName("com.mysql.jdbc.Driver");
         return (Connection) DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/projetojsp", "root", "cdf2525"); 
      }catch (ClassNotFoundException ex) {return null;} 
       catch (SQLException s) {return null;}
   }
}
