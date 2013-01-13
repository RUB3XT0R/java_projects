/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package devmedia;

/**
 *
 * @author Administrador
 */
public class Product {

    private int id;
    private String name;
    private Double cost;

    public Product() {
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(int id, String name, Double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }


    
}
