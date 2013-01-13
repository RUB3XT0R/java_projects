/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controle.Dao;

import java.sql.ResultSet;
import java.util.List;
import modelo.Produto;
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
public class ProdutoDaoTest {

    private static Integer idOfProduct = 0;

    public ProdutoDaoTest() {
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
    public void testGetProduct() throws Exception {
        System.out.println("getProduct");
        int idProduct = idOfProduct;
        ProdutoDao instance = new ProdutoDao();
        Produto expResult = null;
        Produto result = instance.getProduto(idProduct);
        assertEquals(expResult, result);
    }

    @Test
    public void testAddProduct() throws Exception {
        System.out.println("addProduct");
        Produto prod = new Produto();
        prod.setNome("Product Test");
        prod.setPreco(10f);
        prod.setEstoque(20);
        ProdutoDao instance = new ProdutoDao();
        idOfProduct = instance.addProduto(prod);
        assertTrue(idOfProduct > 0);
    }


    @Test
    public void testUpdateProduct() throws Exception {
        System.out.println("updateProduct");
        ProdutoDao instance = new ProdutoDao();
        Produto prod = instance.getProduto(idOfProduct);
        prod.setNome("Product Test 2");
        instance.updateProduto(prod);
        prod = instance.getProduto(idOfProduct);
        assertEquals(prod.getNome(),"Product Test 2");
    }


    @Test
    public void testGetAllProducts() throws Exception {
        System.out.println("getAllProducts");
        ProdutoDao instance = new ProdutoDao();
        List result = instance.getAllProdutos();
        assertTrue(result.size() > 0);
    }

    @Test
    public void testRemoveProduct() throws Exception {
        System.out.println("removeProduct");
        ProdutoDao instance = new ProdutoDao();
        instance.removeProduto(idOfProduct);
        assertNull(instance.getProduto(idOfProduct));
    }
}