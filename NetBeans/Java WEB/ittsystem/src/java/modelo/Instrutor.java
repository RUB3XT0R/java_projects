
package modelo;

import java.util.LinkedList;
import java.util.List;

public class Instrutor {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String email;
    private String email2;
    private String telefone;
    private String telefone2;
    private String carro_modelo;
    private String carro_placa;
    private String carro_cor;
    private String carro_marca;
    
    private List<CursoInstrutor> cursosQueLeciona;

    public Instrutor(){
        new LinkedList<CursoInstrutor>();
    }
    
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

    public String getCarro_cor() {
        return carro_cor;
    }

    public void setCarro_cor(String carro_cor) {
        this.carro_cor = carro_cor;
    }

    public String getCarro_marca() {
        return carro_marca;
    }

    public void setCarro_marca(String carro_marca) {
        this.carro_marca = carro_marca;
    }

    public String getCarro_modelo() {
        return carro_modelo;
    }

    public void setCarro_modelo(String carro_modelo) {
        this.carro_modelo = carro_modelo;
    }

    public String getCarro_placa() {
        return carro_placa;
    }

    public void setCarro_placa(String carro_placa) {
        this.carro_placa = carro_placa;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }
 
    
}
