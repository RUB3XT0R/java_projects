
package modelo;

import java.util.List;

public class Maquina {
    private int id;
    private String nome;
    private String ip;
    private String dNSPrincipal;
    private String dNSAlternativo;
    private String status;
    private Boolean internet;
    private String descricao;
    private String unidade;
    private List<Usuario> usuarios;
    private List<Programa> programas;

    public String getdNSAlternativo() {
        return dNSAlternativo;
    }

    public void setdNSAlternativo(String dNSAlternativo) {
        this.dNSAlternativo = dNSAlternativo;
    }

    public String getdNSPrincipal() {
        return dNSPrincipal;
    }

    public void setdNSPrincipal(String dNSPrincipal) {
        this.dNSPrincipal = dNSPrincipal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getInternet() {
        return internet;
    }

    public void setInternet(Boolean internet) {
        this.internet = internet;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Programa> getProgramas() {
        return programas;
    }

    public void setProgramas(List<Programa> programas) {
        this.programas = programas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
}
