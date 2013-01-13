/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controle.Dao;

import java.util.Calendar;
import modelo.Produto;
import modelo.Usuario;
import java.sql.ResultSet;
import java.util.List;
import modelo.Venda;
import modelo.VendaItem;
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
public class VendasDaoTest {
    private static Integer idOfSell = 0;
    private static Integer idOfSellItem1 = 0;
    private static Integer idOfUser = 0;
    private static Integer idOfProduct = 0;
    public VendasDaoTest() {
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
    public void testAddSell() throws Exception {
        System.out.println("addSell");
        Usuario usr =  new Usuario();
        usr.setNome("lucas");
        usr.setLogin("macacoss");
        usr.setPassword("jabuticaba");
        UsuarioDao instanceUser = new UsuarioDao();
        idOfUser = instanceUser.addUsuario(usr);


        Produto prod = new Produto();
        prod.setNome("Product Test");
        prod.setPreco(10f);
        prod.setEstoque(20);
        ProdutoDao instanceProduct = new ProdutoDao();
        idOfProduct = instanceProduct.addProduto(prod);

        Venda sl = new Venda();
        sl.setVendedor(usr);
        sl.setDataDaVenda(new java.sql.Date(Calendar.getInstance().getTime().getTime()));

        VendaItem si = new VendaItem();
        si.setQnt(10);
        si.setVendas(sl);
        si.setProduto(prod);

        sl.getItens().add(si);

        VendasDao instance = new VendasDao();
        idOfSell = instance.addVenda(sl, true);
        assertTrue(idOfSell > 0);
    }

    @Test
    public void testGetSell() throws Exception {
        System.out.println("getSell");
        VendasDao instance = new VendasDao();
        Venda result = instance.getVenda(idOfSell);
        assertEquals(result.getId(), idOfSell);
        idOfSellItem1 = result.getItens().get(0).getId();
    }

    @Test
    public void testGetSellItem() throws Exception {
        System.out.println("getSellItem");
        VendasDao instance = new VendasDao();
        VendaItem result = instance.getVendaItem(idOfSellItem1);
        assertEquals(idOfSellItem1, result.getId());
    }

    @Test
    public void testGetSellItens() throws Exception {
        System.out.println("getSellItens");
        VendasDao instance = new VendasDao();
        List result = instance.getVendaItens(instance.getVenda(idOfSell));
        assertTrue(result.size() > 0);
    }


    @Test
    public void testUpdateSell() throws Exception {
        System.out.println("updateSell");
        VendasDao instance = new VendasDao();
        Venda sl = instance.getVenda(idOfSell);
        sl.getItens().get(0).setQnt(222);
        instance.updateVenda(sl, true);
        Venda sl2 = instance.getVenda(idOfSell);
        // because the calc of itens is automatic. The value is EQUALS !!!!!
        assertTrue(sl.getTotal() != sl2.getTotal());
        assertTrue(sl2.getTotal() == (222*sl.getItens().get(0).getProduto().getPreco()));

    }

    @Test
    public void testUpdateSellItem() throws Exception {
        System.out.println("updateSellItem");
        VendasDao instance = new VendasDao();
        VendaItem sli = instance.getVendaItem(idOfSellItem1);
        sli.setQnt(1);
        instance.updateVendaItem(sli);
        VendaItem sli2 = instance.getVendaItem(idOfSellItem1);
        assertEquals(sli.getQnt(), sli2.getQnt());
    }


    @Test
    public void testRemoveSellItem() throws Exception {
        System.out.println("removeSellItem");
        VendasDao instance = new VendasDao();
        instance.removeVendaItem(idOfSellItem1);
        assertNull(instance.getVendaItem(idOfSellItem1));
    }

    @Test
    public void testRemoveSell() throws Exception {
        System.out.println("removeSell");
        UsuarioDao instanceUser = new UsuarioDao();
        ProdutoDao instanceProduct = new ProdutoDao();
        VendasDao instance = new VendasDao();

        instance.removeVenda(idOfSell);
        instanceProduct.removeProduto(idOfProduct);
        instanceUser.removeUsuario(idOfUser);
        assertNull(instance.getVenda(idOfSell));
    }
}