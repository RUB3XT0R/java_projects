/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controle.Dao;

import java.sql.ResultSet;
import java.util.List;
import modelo.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas Biason
 */
public class ClienteDaoTest {
private static Integer idOfCustomer = 0;
    public ClienteDaoTest() {
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

   @Test
    public void testGetCliente() throws Exception {
        System.out.println("getCustomer");
        ClienteDao instance = new ClienteDao();
        assertNull(instance.getCliente(idOfCustomer));
    }

    @Test
    public void testAddCliente() throws Exception {
        System.out.println("addCustomer");
       Cliente ctm = new Cliente();
        ctm.setNome("Dyego Customer Test");
        ctm.setIdade(27);
        ctm.setEndereco("address 1");
        ctm.setTelefone("333333333");
        ClienteDao instance = new ClienteDao();
        idOfCustomer = instance.addCliente(ctm);
        assertTrue(idOfCustomer > 0);
    }

    @Test
    public void testUpdateCliente() throws Exception {
        System.out.println("updateCustomer");
        ClienteDao instance = new ClienteDao();
        Cliente ctm = instance.getCliente(idOfCustomer);
        ctm.setNome("Dyego Now !");
        instance.updateCliente(ctm);
        ctm = instance.getCliente(idOfCustomer);
        assertEquals(ctm.getNome(),"Dyego Now !");
    }

    @Test
    public void testGetAllClienteByNome() throws Exception {
        System.out.println("getCustomersByName");
        String name = "Dyego";
        ClienteDao instance = new ClienteDao();
        List result = instance.getAllClienteByNome(name);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testRemoveCliente() throws Exception {
        System.out.println("removeCustomer");
        ClienteDao instance = new ClienteDao();
        instance.removeCliente(idOfCustomer);
        assertNull(instance.getCliente(idOfCustomer));
    }

}