/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia.mycompletewebapp.control;

import devmedia.mycompletewebapp.dao.Product;
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
public class ProductControlTest {

    public ProductControlTest() {
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
     * Test of getListOfProducts method, of class ProductControl.
     */
    @Test
    public void testGetListOfProducts() throws Exception {
        System.out.println("getListOfProducts");
        ProductControl instance = new ProductControl();
        List expResult = null;
        List result = instance.getListOfProducts();
        assertEquals(expResult, result);
    }

    /**
     * Test of addProduct method, of class ProductControl.
     */
    @Test
    public void testAddProduct() throws Exception {
        System.out.println("addProduct");
        Product product = null;
        ProductControl instance = new ProductControl();
        boolean expResult = false;
        boolean result = instance.addProduct(product);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateProduct method, of class ProductControl.
     */
    @Test
    public void testUpdateProduct() throws Exception {
        System.out.println("updateProduct");
        Product product = null;
        ProductControl instance = new ProductControl();
        boolean expResult = false;
        boolean result = instance.updateProduct(product);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeProduct method, of class ProductControl.
     */
    @Test
    public void testRemoveProduct() throws Exception {
        System.out.println("removeProduct");
        Product product = null;
        ProductControl instance = new ProductControl();
        boolean expResult = false;
        boolean result = instance.removeProduct(product);
        assertEquals(expResult, result);
    }

}