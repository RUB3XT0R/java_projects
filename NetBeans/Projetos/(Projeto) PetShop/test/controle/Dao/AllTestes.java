/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controle.Dao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Lucas Biason
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({UsuarioDaoTest.class,ProdutoDaoTest.class,ClienteDaoTest.class,AnimalDaoTest.class,AgendaDaoTest.class,VendasDaoTest.class})
public class AllTestes {

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