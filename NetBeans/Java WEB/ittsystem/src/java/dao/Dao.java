package dao;

import java.sql.*;

public class Dao {

    private Connection conn;  //padrão Singleton   
    public Dao(){ conn=getConnection(); }
    private Connection getConnection(){
        if (null == conn) conn= Conecta.conectar();
        return conn;
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
        ResultSet rs = ps.executeQuery();
        return rs;
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
        boolean result = rs.next();
        rs.close();
        return result;
    }
    
    public final int getIDFromLastInsert(String table){
        try {
            int ultimoId = -1;
            ResultSet rs = executeQuery("select max(id) as idMax from "+table);
            if (rs.next()) ultimoId = rs.getInt("idMax");
            rs.close();
            return ultimoId;
        } catch (SQLException ex) {
            return -1;
        }
    }
    
    public final int getNextId(String tableName) throws SQLException{
        ResultSet rs = executeQuery("select max(id) from "+tableName);
        rs.next();
        Object o = rs.getObject(1);
        Integer toreturn = (o==null)? 1 : ((Integer)o)+1;
        rs.close();
        return toreturn;
    }

}
