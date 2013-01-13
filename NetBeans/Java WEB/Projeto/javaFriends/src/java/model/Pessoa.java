

package model;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="jf_pessoa")
public class Pessoa implements Serializable{

    
    private long id;
    private String nome;
    private String usuario;
    private String senha;
    private int idade;

    private List<Pessoa> convidantes;
    private List<Pessoa> convidados;
    private List<Mensagem> mensagensRecebidas;
    private List<Mensagem> mensagensEnviadas;

    public Pessoa() {
    }

    public List<Pessoa> getConvidados() {
        return convidados;
    }

    public void setConvidados(List<Pessoa> convidados) {
        this.convidados = convidados;
    }

    public List<Pessoa> getConvidantes() {
        return convidantes;
    }

    public void setConvidantes(List<Pessoa> convidantes) {
        this.convidantes = convidantes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Mensagem> getMensagensEnviadas() {
        return mensagensEnviadas;
    }

    public void setMensagensEnviadas(List<Mensagem> mensagensEnviadas) {
        this.mensagensEnviadas = mensagensEnviadas;
    }

    public List<Mensagem> getMensagensRecebidas() {
        return mensagensRecebidas;
    }

    public void setMensagensRecebidas(List<Mensagem> mensagensRecebidas) {
        this.mensagensRecebidas = mensagensRecebidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }



}
