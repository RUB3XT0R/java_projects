
package modelo;

import java.util.List;


public class Curso {
    private int id;
    private String nome;
    private int cargaHora;
    private float investimento;
    private List<Instrutor> instrutores;
    private List<Interessado> interresados;
    private List<Curriculo> curriculo;

    public int getCargaHora() {
        return cargaHora;
    }

    public void setCargaHora(int cargaHora) {
        this.cargaHora = cargaHora;
    }

    public List<Curriculo> getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(List<Curriculo> curriculo) {
        this.curriculo = curriculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(List<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    public List<Interessado> getInterresados() {
        return interresados;
    }

    public void setInterresados(List<Interessado> interresados) {
        this.interresados = interresados;
    }

    public float getInvestimento() {
        return investimento;
    }

    public void setInvestimento(float investimento) {
        this.investimento = investimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
