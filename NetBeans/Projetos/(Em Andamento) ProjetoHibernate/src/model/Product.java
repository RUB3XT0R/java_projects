
package model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product implements java.io.Serializable {

    @Column(name="name")
    private String name;
    
    @Id
    private Integer id;

    @OneToOne(cascade=CascadeType.ALL,optional=false)
    @JoinColumn(name="owner")
    private User owner;

    @Column(name="stoke")
    private Integer stoke;

    @OneToMany(mappedBy="product")
    private List<InvoiceItem> invoiceItens;

    public List<InvoiceItem> getInvoiceItens() {
        return invoiceItens;
    }

    public void setInvoiceItens(List<InvoiceItem> invoiceItens) {
        this.invoiceItens = invoiceItens;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Integer getStoke() {
        return stoke;
    }

    public void setStoke(Integer stoke) {
        this.stoke = stoke;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }




}
