/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia.mycompletewebapp;

import devmedia.mycompletewebapp.control.ProductControlTest;
import devmedia.mycompletewebapp.control.UserControlTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author dyego
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({UserControlTest.class,ProductControlTest.class})
public class TheCompleteTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}