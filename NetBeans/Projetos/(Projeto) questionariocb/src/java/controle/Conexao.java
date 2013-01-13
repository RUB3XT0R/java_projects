

package controle;

import com.mysql.jdbc.Connection;
import java.sql.*;

public class Conexao {

    public static Connection getConn(){
       try{
            Class.forName("com.mysql.jdbc.Driver");
            //return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projetojsp", "root", "cdf2525");
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
