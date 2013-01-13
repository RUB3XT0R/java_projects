
package model;
import java.util.LinkedList;
import javax.persistence.*;

@Entity
@Table(name="invoice_itens")
public class InvoiceItem implements java.io.Serializable {
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name="invoice")
    private Invoice invoice;

    //muitos item dessa classe estaum uma invoice, muitos para um
    @ManyToOne
    @JoinColumn(name="product")
    private Product product;

    @Column
    private Integer amount;




    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InvoiceItem other = (InvoiceItem) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    
}
