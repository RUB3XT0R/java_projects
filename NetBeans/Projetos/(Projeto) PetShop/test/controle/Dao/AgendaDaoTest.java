/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controle.Dao;

import controle.tipos.AgendaTipo;
import java.util.Calendar;
import controle.tipos.AnimalTipo;
import modelo.Animal;
import modelo.Cliente;
import java.sql.ResultSet;
import java.util.List;
import modelo.Agenda;
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
public class AgendaDaoTest {
    private static Integer idOfSchedule = 0;
    private static Integer idOfCustomer = 0;
    private static Integer idOfAnimal = 0;
    public AgendaDaoTest() {
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
    public void testAddSchedule() throws Exception {
        System.out.println("addSchedule");

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
        AnimalDao instanceAnimal = new AnimalDao();
        idOfAnimal = instanceAnimal.addAnimal(an);
        assertTrue(idOfAnimal > 0);
        an.setId(idOfAnimal);

        Agenda sd = new Agenda();
        sd.setDate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        sd.setTotal(10f);
        sd.setTipo(AgendaTipo.banho);
        sd.setAnimal(an);

        AgendaDao instance = new AgendaDao();
        idOfSchedule = instance.addAgenda(sd);
        assertTrue(idOfSchedule >0);
    }


    @Test
    public void testUpdateSchedule() throws Exception {
        System.out.println("updateSchedule");
        AgendaDao instance = new AgendaDao();
        Agenda sd = instance.getAgenda(idOfSchedule);
        sd.setTotal(15f);
        instance.updateAgenda(sd);
        Agenda sd2 = instance.getAgenda(idOfSchedule);
        assertTrue(sd.getTotal() == sd2.getTotal());
    }

    @Test
    public void testGetSchedule() throws Exception {
        System.out.println("getSchedule");
        AgendaDao instance = new AgendaDao();
        Agenda result = instance.getAgenda(idOfSchedule);
        assertEquals(idOfSchedule,result.getId());
    }


    @Test
    public void testGetSchedules() throws Exception {
        System.out.println("getSchedules");
        AgendaDao instance = new AgendaDao();
        List result = instance.getAgendas();
        assertTrue(result.size() > 0);
    }

    @Test
    public void testRemoveSchedule() throws Exception {
        System.out.println("removeSchedule");
        AgendaDao instance = new AgendaDao();
        ClienteDao instanceCustomer = new ClienteDao();
        AnimalDao instanceAnimal = new AnimalDao();

        instance.removeAgenda(idOfSchedule);
        instanceAnimal.removeAnimal(idOfAnimal);
        instanceCustomer.removeCliente(idOfCustomer);
    }

    @Test
    public void testGetScheduleAfterRemove() throws Exception {
        System.out.println("testGetScheduleAfterRemove");
        AgendaDao instance = new AgendaDao();
        Agenda result = instance.getAgenda(idOfSchedule);
        assertNull(result);
    }
}