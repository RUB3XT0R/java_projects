package modelo;

import controle.SwingColumn;

public class Funcionario {

    @SwingColumn(description="Código")
    private int codigo;
    @SwingColumn(description="Nome")
    private String nome;
    private String dataNasc;
    private String cpf;
    private double salarioHora;
    private String dataAdmins;
    @SwingColumn(description="Cargo")
    private String cargo;

    public Funcionario() {
    }

    public Funcionario(int codigo) {
        this.codigo = codigo;
    }

    public Funcionario(int codigo, String nome, String dataNasc, String cpf, double salarioHora, String dataAdmins, String cargo) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.salarioHora = salarioHora;
        this.dataAdmins = dataAdmins;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataAdmins() {
        return dataAdmins;
    }

    public void setDataAdmins(String dataAdmins) {
        this.dataAdmins = dataAdmins;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codigo;
        return hash;
    }

    @Override
    public String toString() {
        return nome;
    }
}
