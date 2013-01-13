package modelo;

import controle.SwingColumn;
import java.util.Date;

public class Aluno {

    @SwingColumn(description="Ra")
    private int ra;
    @SwingColumn(description="Nome")
    private String nome;
    private String datanasc;
    private int ano;
    @SwingColumn(description="Curso")
    private String curso;
    private String periodo;
    private String turma;

    public Aluno() {
    }

    public Aluno(int ra) {
        this.ra = ra;
    }
    

    public Aluno(int ra, String nome, String datanasc, int ano, String curso, String periodo, String turma) {
        this.ra = ra;
        this.nome = nome;
        this.datanasc = datanasc;
        this.ano = ano;
        this.curso = curso;
        this.periodo = periodo;
        this.turma = turma;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.ra != other.ra) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.ra;
        return hash;
    }

    
    @Override
    public String toString() {
        return ra + ", " + nome;
    }

    


}
