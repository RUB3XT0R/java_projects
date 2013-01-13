
package modelo;

import java.util.LinkedList;
import java.util.List;

public class Interessado {
    
    private int id;
    private String nome;
    private String telefoneComercial;
    private String telefoneResidencial;
    private String celular;
    private String email;
    private boolean unidadeABC;
    private boolean unidadeUP;
    private String periodo;
    
    private List<Curso> cursosDeInteresse;

    public Interessado() {
        cursosDeInteresse = new LinkedList<Curso>();
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<Curso> getCursosDeInteresse() {
        return cursosDeInteresse;
    }

    public void setCursosDeInteresse(List<Curso> cursosDeInteresse) {
        this.cursosDeInteresse = cursosDeInteresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public boolean isUnidadeABC() {
        return unidadeABC;
    }

    public void setUnidadeABC(boolean unidadeABC) {
        this.unidadeABC = unidadeABC;
    }

    public boolean isUnidadeUP() {
        return unidadeUP;
    }

    public void setUnidadeUP(boolean unidadeUP) {
        this.unidadeUP = unidadeUP;
    }
    
}
