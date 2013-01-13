package modelo;

import controle.SwingColumn;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    @SwingColumn(description = "Código")
    private int codigo;
    @SwingColumn(description = "Nome")
    private String nome;
    private List<CursoDisciplina> disciplinas = new LinkedList<CursoDisciplina>();

    public Curso() {
    }

    public Curso(int codigo) {
        this.codigo = codigo;
    }

    public Curso(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<CursoDisciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<CursoDisciplina> disciplinas) {
        this.disciplinas = disciplinas;
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
        final Curso other = (Curso) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.codigo;
        return hash;
    }

    @Override
    public String toString() {
        return nome;
    }
}
