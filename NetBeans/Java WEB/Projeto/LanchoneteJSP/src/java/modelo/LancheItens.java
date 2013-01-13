

package modelo;



public class LancheItens {

    private int id;
    private Lanche lanche;
    private Ingrediente ingrediente;
    private int qtde;
    private double total;

    public LancheItens() {
    }

    public LancheItens(int id) {
        this.id = id;
    }

    public LancheItens(Lanche lanche, Ingrediente ingrediente, int qtde) {
        this.lanche = lanche;
        this.ingrediente = ingrediente;
        this.qtde = qtde;
    }
    

    public LancheItens(int id, Lanche lanche, Ingrediente ingrediente, int qtde) {
        this.id = id;
        this.lanche = lanche;
        this.ingrediente = ingrediente;
        this.qtde = qtde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public void setTotal(){
        total =qtde*ingrediente.getPreco();
    }
    public double  getTotal() {
        return qtde*ingrediente.getPreco();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LancheItens other = (LancheItens) obj;
        if (this.ingrediente != other.ingrediente && (this.ingrediente == null || !this.ingrediente.equals(other.ingrediente))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.ingrediente != null ? this.ingrediente.hashCode() : 0);
        return hash;
    }


    @Override
    public String toString() {
        return ingrediente.toString();
    }


}
