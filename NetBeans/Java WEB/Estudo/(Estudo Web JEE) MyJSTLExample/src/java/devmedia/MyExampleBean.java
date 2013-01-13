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
public class MyExampleBean {

    public List<User> getName() {
        List<User> returned = new LinkedList<User>();
        returned.add(new User("User One",22));
        returned.add(new User("User Two",42));
        returned.add(new User("User Three",52));
        return returned;
    }
}
