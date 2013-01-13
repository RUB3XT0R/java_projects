
package Dao;

import com.mysql.jdbc.Connection;
import java.sql.*;

public class Conecta {

    protected static Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafeteria", "root", "cdf2525");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            return null;
        } catch (SQLException s) {
            System.out.println(s);
            return null;
        }
    }
    
}
