
package controle;

import java.util.*;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;
import modelo.Livro;

@Named
@javax.enterprise.context.RequestScoped
public class TesteBean {
 
    private boolean confirma;
    private String tipoPessoa;
    private List<String> cores;
    private List<String> coresSelecionadasCheckbox;
    private List<String> coresSelecionadasManyMenu;
    private String corSelecionadaOneMenu;
    private Date data;
    
    private String carro;
    private String[] carros = {
       "Honda Accord","Toyota 4Runner","NissanZ350"};
    
    private List<Livro> livros;
    
    public TesteBean() {
        livros = new ArrayList<Livro>();
        livros.add(new Livro("JSF For Dummies","JSF",25.0f));
        livros.add(new Livro("Struts For Dummies","Struts",22.95f));
        
        cores = new ArrayList<String>();
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Preto");
        cores.add("Vermelho");
    }

  private int idade;
  public int getIdade(){return idade;}
  public void setIdade(int idade){
   FacesContext ctx = FacesContext.getCurrentInstance();
   if(idade>=18)
      ctx.addMessage(null,new FacesMessage("Usuário maior de idade"));
   else
      ctx.addMessage(null,
              new FacesMessage(FacesMessage.SEVERITY_ERROR,
                      "Usuário menor de idade",""));
  }

  
  
   public Date getData() {
      return data;
   }

   public void setData(Date data) {
      this.data = data;
   }
    
   
  
   public List<Livro> getLivros() {
      return livros;
   }

   public void setLivros(List<Livro> livros) {
      this.livros = livros;
   }

    
   public String[] getCarros() {
      return carros;
   }

   public void setCarros(String[] carros) {
      this.carros = carros;
   }
     
    //Gerar getters e setters

   public boolean isConfirma() {
      return confirma;
   }

   public void setConfirma(boolean confirma) {
      this.confirma = confirma;
   }

   public String getCorSelecionadaOneMenu() {
      return corSelecionadaOneMenu;
   }

   public void setCorSelecionadaOneMenu(String corSelecionadaOneMenu) {
      this.corSelecionadaOneMenu = corSelecionadaOneMenu;
   }

   public List<String> getCores() {
      return cores;
   }

   public void setCores(List<String> cores) {
      this.cores = cores;
   }

   public List<String> getCoresSelecionadasCheckbox() {
      return coresSelecionadasCheckbox;
   }

   public void setCoresSelecionadasCheckbox(List<String> coresSelecionadasCheckbox) {
      this.coresSelecionadasCheckbox = coresSelecionadasCheckbox;
   }

   public List<String> getCoresSelecionadasManyMenu() {
      return coresSelecionadasManyMenu;
   }

   public void setCoresSelecionadasManyMenu(List<String> coresSelecionadasManyMenu) {
      this.coresSelecionadasManyMenu = coresSelecionadasManyMenu;
   }

   public String getTipoPessoa() {
      return tipoPessoa;
   }

   public void setTipoPessoa(String tipoPessoa) {
      this.tipoPessoa = tipoPessoa;
   }

   public String getCarro() {
      return carro;
   }

   public void setCarro(String carro) {
      this.carro = carro;
   }
   
   
}