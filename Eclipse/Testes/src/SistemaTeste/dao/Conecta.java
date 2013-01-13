
package dao;

import com.mysql.jdbc.Connection;
import java.sql.*;

public class Conecta {

    protected static Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ittraining", "root", "cdf2525");
            return (Connection) DriverManager.getConnection("jdbc:mysql://mysql.engcompfsa.com.br/engcompfsa02", "engcompfsa02", "z4djFX25Ke6Q");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            return null;
        } catch (SQLException s) {
            System.out.println(s);
            return null;
        }
    }
    
}
