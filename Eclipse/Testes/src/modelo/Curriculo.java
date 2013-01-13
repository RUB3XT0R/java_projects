
package modelo;

import java.util.List;

public class Curriculo {
    private int id;
    private String cpf;
    private String nome;
    private String telResidencial;
    private String telComercial;
    private String celular;
    private String email;
    private Boolean empregado;
    private String empresa;
    private String conhecimentos;
    private String formacao;
    private List<CursoCurriculo> cursosInterresados;

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getConhecimentos() {
        return conhecimentos;
    }

    public void setConhecimentos(String conhecimentos) {
        this.conhecimentos = conhecimentos;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<CursoCurriculo> getCursosInterresados() {
        return cursosInterresados;
    }

    public void setCursosInterresados(List<CursoCurriculo> cursosInterresados) {
        this.cursosInterresados = cursosInterresados;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Boolean empregado) {
        this.empregado = empregado;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
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

    public String getTelComercial() {
        return telComercial;
    }

    public void setTelComercial(String telComercial) {
        this.telComercial = telComercial;
    }

    public String getTelResidencial() {
        return telResidencial;
    }

    public void setTelResidencial(String telResidencial) {
        this.telResidencial = telResidencial;
    }
    
    
}
