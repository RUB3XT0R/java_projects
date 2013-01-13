package dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dao {

    private Connection getConnection(){
        return Conecta.conectar();
    }

    private Statement getStatement() throws SQLException{
        return getConnection().createStatement();
    }
    
    private PreparedStatement getStatement(String statement) throws SQLException{
        return getConnection().prepareStatement(statement);
    }

    protected final  ResultSet executeQuery(String query, Object ... params) throws SQLException{
        PreparedStatement ps = getStatement(query);
        for(int i = 0; i< params.length; i++)
            ps.setObject(i+1, params[i]);
        return ps.executeQuery();
    }

    protected final int executeCommand(String query, Object... params) throws SQLException{
        PreparedStatement ps = getStatement(query);
        for(int i = 0; i< params.length; i++)
            ps.setObject(i+1, params[i]);
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }

    public final boolean contain(String tableName,String field, Object value) throws SQLException{
        ResultSet rs = executeQuery("select * from "+tableName+" where "+field+"=?",value);
        return rs.next() ? true : false;
    }
    
    public final int getIDFromLastInsert(){
        try {
            int ultimoId = -1;
            ResultSet rs;
            rs = executeQuery("SELECT LAST_INSERT_ID()");
            if (rs.next()) ultimoId = rs.getInt(1);
            rs.close();
            return ultimoId;
        } catch (SQLException ex) {
            return -1;
        }
    }
    
}
