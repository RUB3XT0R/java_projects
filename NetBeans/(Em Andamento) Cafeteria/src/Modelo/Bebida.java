
package Modelo;

import Controle.factoryTableModel.SwingColumn;


public class Bebida {
    
    @SwingColumn(description="Id")
    private int id;
    @SwingColumn(description="Descrição")
    private String descricao;
    @SwingColumn(description="Preço")
    private float preco;
    @SwingColumn(description="Qtde(ML)")
    private float qtde;

    public Bebida() {
    }

    public Bebida(int id) {
        this.id = id;
    }

    public Bebida(String descricao, float preco, float qtde) {
        this.descricao = descricao;
        this.preco = preco;
        this.qtde = qtde;
    }

    public Bebida(int id, String descricao, float preco, float qtde) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.qtde = qtde;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bebida other = (Bebida) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public String toString() {
        return descricao;
    }

    
    
}
