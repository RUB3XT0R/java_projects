
package modelo;

import java.sql.Date;
import java.util.List;

public class Venda {
    
    private int id;
    private Date data;
    private Float total;
    
    private Funcionario vendedor;
    
    private List<VendaItem> itens;

	public Venda() {
		super();
	}

	public Venda(int id) {
		super();
		this.id = id;
	}

	public Venda(Date data, Float total, Funcionario vendedor,
			List<VendaItem> itens) {
		super();
		this.data = data;
		this.total = total;
		this.vendedor = vendedor;
		this.itens = itens;
	}

	public Venda(int id, Date data, Float total, Funcionario vendedor,
			List<VendaItem> itens) {
		super();
		this.id = id;
		this.data = data;
		this.total = total;
		this.vendedor = vendedor;
		this.itens = itens;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	public Funcionario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Funcionario vendedor) {
		this.vendedor = vendedor;
	}

	public List<VendaItem> getItens() {
		return itens;
	}

	public void setItens(List<VendaItem> itens) {
		this.itens = itens;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
    
    
}
