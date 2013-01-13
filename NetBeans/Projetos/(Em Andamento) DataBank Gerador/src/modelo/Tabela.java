
package modelo;

import java.util.LinkedList;
import java.util.List;

public class Tabela {

    private String nome;
    private Campo chaveprimaria;
    private List<Campo> campos = new LinkedList<Campo>();

    public Tabela() {
    }

    public Tabela(String nome, Campo chaveprimaria) {
        this.nome = nome;
        this.chaveprimaria = chaveprimaria;
    }

    public List<Campo> getCampos() {
        return campos;
    }

    public void setCampos(List<Campo> campos) {
        this.campos = campos;
    }

    public Campo getChaveprimaria() {
        return chaveprimaria;
    }

    public void setChaveprimaria(Campo chaveprimaria) {
        this.chaveprimaria = chaveprimaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tabela other = (Tabela) obj;
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return nome;
    }

}
