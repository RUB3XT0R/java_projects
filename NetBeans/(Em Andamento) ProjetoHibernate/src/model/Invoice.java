
package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="invoice")
public class Invoice implements java.io.Serializable{
    @Id
    private Integer id;

    @Column (name="dateOfSale")
    @Temporal(TemporalType.DATE)
    private Date dateOfSale;

    @OneToOne(cascade=CascadeType.ALL,optional=false)
    @JoinColumn(name="vendor")
    private User vendor;

    //uma invoice tem muitos itens, intaum, OneToMany..um para muitos.
    @OneToMany(mappedBy="invoice",cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    private List<InvoiceItem> product;


    public void addItem(InvoiceItem i){
        if(product == null) product = new LinkedList<InvoiceItem>();
        //determinar e fazer com q o invoiceitem i sabia q ele pertence a esse invoice
        i.setInvoice(this);
        //adicionar o invoiceitem a esse invoice
        product.add(i);
    }

    public List<InvoiceItem> getItens() {
        return product;
    }

    public void setItens(List<InvoiceItem> itens) {
        this.product = itens;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getVendor() {
        return vendor;
    }

    public void setVendor(User vendor) {
        this.vendor = vendor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Invoice other = (Invoice) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }


}
