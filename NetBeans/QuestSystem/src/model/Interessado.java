package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Interessado {

    private int cod_Interessado;
    private String nome, email, telefoneR, telefoneC,celular;
    private List<Curso> cursos = new ArrayList<>();

    public Interessado() {
    }

    public Interessado(int cod_Interessado) {
        this.cod_Interessado = cod_Interessado;
    }

    public int getCod_Interessado() {
        return cod_Interessado;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCod_Interessado(int cod_Interessado) {
        this.cod_Interessado = cod_Interessado;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefoneC() {
        return telefoneC;
    }

    public void setTelefoneC(String telefoneC) {
        this.telefoneC = telefoneC;
    }

    public String getTelefoneR() {
        return telefoneR;
    }

    public void setTelefoneR(String telefoneR) {
        this.telefoneR = telefoneR;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Interessado other = (Interessado) obj;
        if (this.cod_Interessado != other.cod_Interessado) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.cod_Interessado;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public String toString() {
        return nome;
    }
}
