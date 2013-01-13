
package modelo;

import java.util.List;

public class Instrutor {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private List<CursoInstrutor> cursosQueLeciona;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<CursoInstrutor> getCursosQueLeciona() {
        return cursosQueLeciona;
    }

    public void setCursosQueLeciona(List<CursoInstrutor> cursosQueLeciona) {
        this.cursosQueLeciona = cursosQueLeciona;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 
    
}
