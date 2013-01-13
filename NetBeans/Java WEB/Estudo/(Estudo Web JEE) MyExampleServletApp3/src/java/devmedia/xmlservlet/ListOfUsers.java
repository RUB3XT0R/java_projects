/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia.xmlservlet;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@XmlRootElement(name="users")
public class ListOfUsers implements Serializable{

    @XmlElementWrapper
    private List<User> users;

    public ListOfUsers(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    

}
