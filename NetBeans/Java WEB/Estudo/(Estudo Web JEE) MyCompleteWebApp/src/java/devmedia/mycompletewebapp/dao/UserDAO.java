/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia.mycompletewebapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author dyego
 */
public class UserDAO extends DBConnection{

    private final Connection cx;

    public UserDAO() throws ClassNotFoundException, SQLException {
        this.cx = getMyDBConnection();
    }
    public UserDAO(Connection cx){
        this.cx=cx;
    }

    public User getUser(String name) throws SQLException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = cx.prepareStatement("SELECT * FROM users WHERE name = ?");
            pst.setString(1, name);
            rs = pst.executeQuery();
            if (rs.next()) {
                User usr =  getUserFromSQL(rs);
                return usr;
            }
        } finally {
            pst.close();
            rs.close();
        }
        return null;
    }

    public boolean isValidUserAndPassword(String username,String password) throws SQLException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = cx.prepareStatement("SELECT * FROM users WHERE login = ? AND password = ?");
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }

        } finally {
            pst.close();
            rs.close();
        }
        return false;

    }

    private User getUserFromSQL(ResultSet rs) throws SQLException {
        User returned = new User();
        returned.setAddress(rs.getString("address"));
        returned.setLogin(rs.getString("login"));
        returned.setName(rs.getString("name"));
        returned.setPassword(rs.getString("password"));
        return returned;
    }

    public List<User> getListOfUsers() throws SQLException {
        List<User> returned = new LinkedList<User>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = cx.prepareStatement("SELECT * FROM users");
            rs = pst.executeQuery();
            if (rs.next()) {
                returned.add(getUserFromSQL(rs));
            }
            return returned;
        } finally {
            pst.close();
            rs.close();
        }
    }

}
