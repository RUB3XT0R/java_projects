
package modelo;

public class Category {
    private String Name;
    private double value;

    public Category(String Name, double value) {
        this.Name = Name;
        this.value = value;
    }

    public Category() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Name + " - " + value ;
    }
    public int compareTo(Category c){
        return this.Name.compareTo(c.getName());
    }


}
