package modelo;

import controle.ferramentas.SwingColumn;

public class Funcionario {

    @SwingColumn(description="Id")
    private int id;
    private long cpf;
    @SwingColumn(description="Nome")
    private String nome;
    @SwingColumn(description="Telefone")
    private String telefone;
    private String email;
    private String endereco;
    private String cidade;
    private String estado;
    @SwingColumn(description="Cargo")
    private String cargo;
    private Float faturamentoM;
    private String foto;
    @SwingColumn(description="Salário")
    private Float salario;
    private String idade;

    public Funcionario() {
    }

    public Funcionario(int id) {
        this.id = id;
    }

    public Funcionario(int id, long cpf, String nome, String telefone, String email, String endereco, String cidade, String estado, String cargo, Float faturamentoM, String foto, Float salario, String idade) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cargo = cargo;
        this.faturamentoM = faturamentoM;
        this.foto = foto;
        this.salario = salario;
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Float getFaturamentoM() {
        return faturamentoM;
    }

    public void setFaturamentoM(Float faturamentoM) {
        this.faturamentoM = faturamentoM;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
        return hash;
    }

    

    @Override
    public String toString() {
        return nome;
    }



}
