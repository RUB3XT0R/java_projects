
package modelo;

import controle.ferramentas.SwingColumn;
import java.util.LinkedList;
import java.util.List;

public class Fornecedor {
    private long id;
    @SwingColumn(description="Cnpj")
    private String cnpj;
    @SwingColumn(description="Nome")
    private String nome;
    private String email;
    private String endereco;
    @SwingColumn(description="Telefone")
    private String telefone;

    private List<Produto> produtos = new LinkedList<Produto>();

    public Fornecedor() {
    }

    public Fornecedor(long id) {
        this.id = id;
    }

    public Fornecedor(long id, String cnpj, String nome, String email, String endereco, String telefone) {
        this.id = id;
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

     public void addProduto(Produto p){
        produtos.add(p);
    }

    public void removeProduto(Produto p){
        produtos.remove(p);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }



}
