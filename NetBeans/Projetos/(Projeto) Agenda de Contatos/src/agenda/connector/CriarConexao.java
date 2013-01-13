
package agenda.connector;

import java.sql.*;

public class CriarConexao {

    public static Connection getConexao() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/agendadb", "root", "cdf2525");
            //return DriverManager.getConnection("jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb)};DBQ=Agenda.mdb;","","");
            //return DriverManager.getConnection("jdbc:odbc:Agenda;","","");
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }
}
