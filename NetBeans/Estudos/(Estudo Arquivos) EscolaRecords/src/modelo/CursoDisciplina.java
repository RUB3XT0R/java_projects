package modelo;

import controle.SwingColumn;

public class CursoDisciplina {

    @SwingColumn(description = "Código")
    private int codigo;
    @SwingColumn(description = "Disciplina")
    private Disciplina disciplina;
    @SwingColumn(description = "Professor")
    private Funcionario professor;
    private Curso curso;

    public CursoDisciplina() {
    }

    public CursoDisciplina(int codigo) {
        this.codigo = codigo;
    }

    public CursoDisciplina(Disciplina disciplina, Funcionario professor, int codigo) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.codigo = codigo;
    }

    public CursoDisciplina(int codigo, Disciplina disciplina, Funcionario professor, Curso curso) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Funcionario getProfessor() {
        return professor;
    }

    public void setProfessor(Funcionario professor) {
        this.professor = professor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CursoDisciplina other = (CursoDisciplina) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.codigo;
        return hash;
    }

    @Override
    public String toString() {
        return disciplina.toString();
    }
}
