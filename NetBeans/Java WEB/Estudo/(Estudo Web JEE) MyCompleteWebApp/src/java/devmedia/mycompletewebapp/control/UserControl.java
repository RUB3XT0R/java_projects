/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia.mycompletewebapp.control;

import devmedia.mycompletewebapp.dao.User;
import devmedia.mycompletewebapp.dao.UserDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dyego
 */
public class UserControl {

    private UserDAO dao;
    
    public UserControl() {
        try {
            dao = new UserDAO();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isValidUserAndPassword(String username,String password) throws SQLException {
        return dao.isValidUserAndPassword(username, password);
    }

    public List<User> getListOfUsers() throws SQLException {
        return dao.getListOfUsers();
    }

    public User getUser(String username) throws SQLException{
        return dao.getUser(username);
    }
}
