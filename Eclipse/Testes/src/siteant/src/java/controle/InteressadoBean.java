/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;
import modelo.Curso;
import modelo.Interessado;

@Named
@SessionScoped
public class InteressadoBean implements  Serializable{
   
   private InteressadoControl controle = new InteressadoControl();
   private Interessado interessado = new Interessado();
   private DataModel<Interessado>  interessados;
   private int curso;
   
   public void novo(){
      interessado = new Interessado();
   }
   public void selecionar(){
      interessado = interessados.getRowData();
   }
   public void addCurso(){
      Curso c = new CursoControl().get(curso);
      interessado.getCursos().add(c);
      c.getInteressados().add(interessado);
   }
   public void delCurso(Curso c){
      interessado.getCursos().remove(c);
      c.getInteressados().remove(interessado);
   }
   public String inserir(){
      return (controle.salvar(interessado))? "interessados" : "falhou";
   }
   public String alterar(){
      return (controle.alterar(interessado))? "interessados" : "falhou";
   }
   public String remover(){
      return (controle.excluir(interessado))? "interessados" : "falhou";
   }
   public Interessado getInteressado() {
      return interessado;
   }

   public void setInteressado(Interessado interessado) {
      this.interessado = interessado;
   }

   public DataModel<Interessado> getInteressados() {
      List<Interessado> intList = controle.getList();
      interessados = new ListDataModel<Interessado>(intList);
      return interessados;
   }
   

   public void setInteressados(DataModel<Interessado> interessados) {
      this.interessados = interessados;
   }

   public int getCurso() {
      return curso;
   }

   public void setCurso(int curso) {
      this.curso = curso;
   }


   
   
   
}
   
