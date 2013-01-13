/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia.mycompletewebapp.control;

import devmedia.mycompletewebapp.dao.Product;
import devmedia.mycompletewebapp.dao.ProductDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dyego
 */
public class ProductControl {

    private ProductDAO dao;

    public ProductControl() {
        try {
            dao = new ProductDAO();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public List<Product> getListOfProducts() throws SQLException {
        return dao.getListOfProducts();
    }

    public boolean addProduct(Product product) throws SQLException {
        return dao.addProduct(product);

    }
    public boolean updateProduct(Product product) throws SQLException {
        return dao.updateProduct(product);

    }
    public boolean removeProduct(Product product) throws SQLException {
        return dao.removeProduct(product.getName());
    }

    public Product getProduct(String name) throws SQLException{
        return dao.getProduct(name);
    }

}
