package model;

import java.util.Objects;

public class Curso {
    
    private int cod_Curso;
    private String nome;

    public Curso() {
    }

    public Curso(int cod_Curso) {
        this.cod_Curso = cod_Curso;
    }

    public Curso(String nome) {
        this.nome = nome;
    }
    
    public Curso(int cod_Curso, String nome) {
        this.cod_Curso = cod_Curso;
        this.nome = nome;
    }

    public int getCod_Curso() {
        return cod_Curso;
    }

    public void setCod_Curso(int cod_Curso) {
        this.cod_Curso = cod_Curso;
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
        if (this.cod_Curso != other.cod_Curso) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.cod_Curso;
        hash = 59 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
