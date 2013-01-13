/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia.mycompletewebapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ProductDAO extends DBConnection {

    private final Connection cx;

    public ProductDAO() throws ClassNotFoundException, SQLException {
        this.cx = getMyDBConnection();
    }

    public ProductDAO(Connection cx){
        this.cx=cx;
    }

    public List<Product> getListOfProducts() throws SQLException {
        List<Product> returned = new LinkedList<Product>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = cx.prepareStatement("SELECT * FROM products");
            rs = pst.executeQuery();
            if (rs.next()) {
                returned.add(getProductFromSQL(rs));
            }
        } finally {
            pst.close();
            rs.close();
        }

        return returned;
    }

    public Product getProduct(String nome) throws SQLException {
        Product returned = new Product();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = cx.prepareStatement("SELECT * FROM products where name=?");
            pst.setString(1,nome);
            rs = pst.executeQuery();
            returned = getProductFromSQL(rs);
        } finally {
            pst.close();
            rs.close();
        }
        return returned;
    }

    public boolean addProduct(Product product) throws SQLException {
        PreparedStatement pst = null;
        try {
            pst = cx.prepareStatement("INSERT INTO products values (?,?,?)");
            pst.setString(1, product.getName());
            pst.setFloat(2, product.getPrice());
            pst.setInt(3, product.getStock());
            return pst.execute();
        } finally {
            pst.close();
        }
    }


    public boolean updateProduct(Product product) throws SQLException {
        PreparedStatement pst = null;
        try {
            pst = cx.prepareStatement("UPDATE products SET name = ?, price = ?, stock  = ? WHERE name = ?");
            pst.setString(1, product.getName());
            pst.setFloat(2, product.getPrice());
            pst.setInt(3, product.getStock());
            pst.setString(4, product.getName());
            return pst.execute();

        } finally {
            pst.close();
        }
    }

    public boolean removeProduct(String name) throws SQLException {
        PreparedStatement pst = null;
        try {
            pst = cx.prepareStatement("DELETE FROM products WHERE name = ?");
            pst.setString(1, name);
            return pst.execute();
        } finally {
            pst.close();
        }

    }

    private Product getProductFromSQL(ResultSet rs) throws SQLException {
        Product returned = new Product();
        returned.setName(rs.getString("name"));
        returned.setPrice(rs.getFloat("price"));
        returned.setStock(rs.getInt("stock"));
        return returned;
    }

}
