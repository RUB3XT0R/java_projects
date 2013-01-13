/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class MyProducts {
    private final List<Product> products;

    public MyProducts() {
      products = new LinkedList<Product>();
      products.add(new Product(1,"Product 1",10d));
      products.add(new Product(2,"Product 2",20d));
      products.add(new Product(3,"Product 3",30d));
      products.add(new Product(4,"Product 4",40d));
      products.add(new Product(5,"Product 5",50d));
    }

    public List<Product> getProducts() {
        return products;
    }

    



}
