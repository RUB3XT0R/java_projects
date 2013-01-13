
package modelo;

import java.io.Serializable;
import javax.persistence.*;

@Entity(name="cliente")
public class Cliente implements Serializable {
    
    @Id
    @Column(name="cpf")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long cpf;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="rg")
    private String rg;
    
    @Column(name="idade")
    private int idade;
    
    @Column(name="telefone")
    private String telefone;
    
    @Column(name="email")
    private String email;
    
    @Column(name="endereco")
    private String endereco;
    
    @Column(name="cidade")
    private String cidade;
    
    @Column(name="estado")
    private String estado;

    public Cliente() {
    }

    public Cliente(long cpf) {
        this.cpf = cpf;
    }

    public Cliente(String nome, String rg, int idade, String telefone, String email, String endereco, String cidade, String estado) {
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Cliente(long cpf, String nome, String rg, int idade, String telefone, String email, String endereco, String cidade, String estado) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.cpf != other.cpf) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (int) (this.cpf ^ (this.cpf >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return nome;
    }

    
}
