package controle;

import java.sql.*;


public class Conectar {
    public static Connection getConexao(){
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            return (Connection) DriverManager.getConnection("jdbc:odbc:Database31", "", "");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            return null;
        } catch (SQLException s) {
            System.out.println(s);
            return null;
        }
    }
}
