package modelo;

import controle.SwingColumn;

public class Disciplina {
    @SwingColumn(description="Codigo")
    private int codigo;
    @SwingColumn(description="Disciplina")
    private String disciplina;
    @SwingColumn(description="CargaHoraria")
    private int cargahoraria;

    public Disciplina() {
    }

    public Disciplina(int codigo) {
        this.codigo = codigo;
    }

    public Disciplina (int codigo, String disciplina, int cargahoraria) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.cargahoraria = cargahoraria;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disciplina other = (Disciplina) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.codigo;
        return hash;
    }

    @Override
    public String toString() {
        return disciplina;
    }


}
