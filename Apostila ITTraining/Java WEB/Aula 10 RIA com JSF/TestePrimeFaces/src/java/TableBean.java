import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.event.ActionEvent;

@Named
@RequestScoped
public class TableBean{

    private List<String> animais = new ArrayList<String>();

    public List<String> getAnimais() {
        animais.add("Girafa");
        animais.add("Pato");
        animais.add("Leopardo");
        animais.add("Elefante");
        animais.add("Zebra");
        animais.add("Girafa");
        animais.add("Pato");
        animais.add("Leopardo");
        animais.add("Elefante");
        animais.add("Zebra");
        animais.add("Girafa");
        animais.add("Pato");
        animais.add("Leopardo");
        animais.add("Elefante");
        animais.add("Zebra");
        return animais;
    }
    public void setAnimais(List<String> animais) {
        this.animais = animais;
    }

    private String nome;
    private String descricao;
    private String telefone;
    private String cpf;
    private String observacao;
    private Date dataCadastro;
    private String senha;

    public void testar(){
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Testado com sucesso!"));
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Date getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}

 