/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controle.Dao;

import java.sql.ResultSet;
import modelo.Usuario;
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
public class UsuarioDaoTest {

    public static Integer idofuser=1;
    public UsuarioDaoTest() {
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
    public void testAddUsuario() throws Exception {
        System.out.println("addUsuario");
        Usuario usr =  new Usuario();
        usr.setNome("lucas");
        usr.setLogin("macacoss");
        usr.setPassword("jabuticaba");
        UsuarioDao instance = new UsuarioDao();
        idofuser = instance.addUsuario(usr);
        Usuario result = instance.getUsuario(idofuser);
        assertEquals(idofuser, result.getId());
    }
    
    @Test
    public void testGetuser() throws Exception {
        System.out.println("getuser");
        int id = idofuser;
        UsuarioDao instance = new UsuarioDao();
        Integer expResult =  idofuser;
        Usuario result = instance.getUsuario(id);
        assertEquals(expResult, result.getId());
    }
    @Test
    public void testUpdateUser() throws Exception {
        System.out.println("updateUser");
        UsuarioDao instance = new UsuarioDao();
        Usuario usr =  instance.getUsuario(idofuser);
        usr.setNome("lucas biason");
        instance.updateUsuario(usr);
    }
    @Test
    public void testRemoveUsuario() throws Exception {
        System.out.println("removeUsuario");
        int idUsuario = idofuser;
        UsuarioDao instance = new UsuarioDao();
        instance.removeUsuario(idUsuario);
    }

    

}