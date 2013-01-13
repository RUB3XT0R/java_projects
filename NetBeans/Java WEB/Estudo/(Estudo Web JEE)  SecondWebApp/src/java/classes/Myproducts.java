package classes;


import java.util.LinkedList;
import java.util.List;


public class Myproducts {

    private List<Product> products;

    public Myproducts(){
        products = new LinkedList<Product>();
        products.add(new Product(1,"Produto 1",10d));
        products.add(new Product(2,"Produto 2",20d));
        products.add(new Product(3,"Produto 3",30d));
        products.add(new Product(4,"Produto 4",40d));
        products.add(new Product(5,"Produto 5",50d));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


}
