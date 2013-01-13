/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controle.Dao;

import controle.tipos.AnimalTipo;
import modelo.Cliente;
import java.sql.ResultSet;
import java.util.List;
import modelo.Animal;
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
public class AnimalDaoTest {

    private static Integer idOfAnimal = 0;
    private static Integer idOfCustomer = 0;

    public AnimalDaoTest() {
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
    public void testAddAnimal() throws Exception {
        System.out.println("addAnimal");


        Cliente ctm = new Cliente();
        ctm.setNome("Dyego Customer Test");
        ctm.setIdade(27);
        ctm.setEndereco("address 1");
        ctm.setTelefone("333333333");
        ClienteDao instanceCustomer = new ClienteDao();
        ctm.setId(instanceCustomer.addCliente(ctm));
        idOfCustomer = ctm.getId();

        Animal an = new Animal();
        an.setIdade(5);
        an.setRaca("unkow");
        an.setNome("Totoh");
        an.setTipo(AnimalTipo.dog);
        an.setDono(ctm);
        AnimalDao instance = new AnimalDao();
        idOfAnimal = instance.addAnimal(an);
        assertTrue(idOfAnimal > 0);
    }

    @Test
    public void testGetAnimal() throws Exception {
        System.out.println("getAnimal");
        AnimalDao instance = new AnimalDao();
        Animal result = instance.getAnimal(idOfAnimal);
        assertEquals(idOfAnimal, result.getId());
    }

    @Test
    public void testUpdateAnimal() throws Exception {
        System.out.println("updateAnimal");
        AnimalDao instance = new AnimalDao();
        Animal an = instance.getAnimal(idOfAnimal);
        an.setNome("The new Name Of Pet");
        instance.updateAnimal(an);
        Animal anReturned = instance.getAnimal(idOfAnimal);
        assertEquals(anReturned.getNome(), "The new Name Of Pet");
    }


    @Test
    public void testGetAnimalByName() throws Exception {
        System.out.println("getAnimalByName");
        String name = "The new Name Of Pet";
        AnimalDao instance = new AnimalDao();
        List result = instance.getAllAnimaisbyNome(name);
        assertTrue(result.size() == 1);
    }


    @Test
    public void testRemoveAnimal() throws Exception {
        System.out.println("removeAnimal");
        AnimalDao instance = new AnimalDao();
        ClienteDao instanceCustomer = new ClienteDao();
        instance.removeAnimal(idOfAnimal);
        instanceCustomer.removeCliente(idOfCustomer);
    }

    @Test
    public void testGetAnimalAfterRemove() throws Exception {
        System.out.println("getAnimalAfterRemove");
        AnimalDao instance = new AnimalDao();
        Animal result = instance.getAnimal(idOfAnimal);
        assertNull(result);
    }

}