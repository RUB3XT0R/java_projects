/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class MyUserControl {

    private List<User> users;


    public MyUserControl() {
        users = new LinkedList<User>();
        users.add(new User(1,"Dyego Souza","Address 1"));
        users.add(new User(2,"Mark","Address 2"));
        users.add(new User(3,"Poul","Address 3"));
        users.add(new User(4,"Marie","Address 4"));

    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUserById(int idUser) {
        return users.get(idUser-1);
    }

    


}
