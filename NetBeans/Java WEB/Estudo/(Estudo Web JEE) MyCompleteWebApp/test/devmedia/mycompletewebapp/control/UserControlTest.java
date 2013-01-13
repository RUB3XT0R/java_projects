/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia.mycompletewebapp.control;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dyego
 */
public class UserControlTest {

    public UserControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of isValidUserAndPassword method, of class UserControl.
     */
    @Test
    public void testIsValidUserAndPassword() throws Exception {
        System.out.println("isValidUserAndPassword");
        String username = "";
        String password = "";
        UserControl instance = new UserControl();
        boolean expResult = false;
        boolean result = instance.isValidUserAndPassword(username, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListOfUsers method, of class UserControl.
     */
    @Test
    public void testGetListOfUsers() throws Exception {
        System.out.println("getListOfUsers");
        UserControl instance = new UserControl();
        List expResult = null;
        List result = instance.getListOfUsers();
        assertEquals(expResult, result);
    }

}