
package controle.Dao;

import java.sql.*;

public abstract class Dao {

    public Connection getConnection(){
        return Conectar.getConexao();
    }

    public Statement getStatement() throws SQLException{
        return getConnection().createStatement();
    }
    
    public PreparedStatement getStatement(String statement) throws SQLException{
        return getConnection().prepareStatement(statement);
    }

    public ResultSet executeQuery(String query, Object ... params) throws SQLException{
        PreparedStatement ps = getStatement(query);
        for(int i = 0; i< params.length; i++)
            ps.setObject(i+1, params[i]);
        return ps.executeQuery();
    }

    public int executeCommand(String query, Object... params) throws SQLException{
        PreparedStatement ps = getStatement(query);
        for(int i = 0; i< params.length; i++)
            ps.setObject(i+1, params[i]);
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }

    public Integer getNextId(String tableName) throws SQLException{
        ResultSet rs = executeQuery("select max(id) from "+tableName);
        rs.next();
        Object o = rs.getObject(1);
        Integer toreturn = (o==null)? 1 : ((Integer)o)+1;
        rs.close();
        return toreturn;
    }
}
