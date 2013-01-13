/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.*;
import javax.inject.Named;
import modelo.Curso;
import modelo.Cursoinstrutor;
import modelo.CursoinstrutorPK;
import modelo.Instrutor;

@Named
@SessionScoped
public class InstrutorBean implements Serializable {

   private InstrutorControl controle = new InstrutorControl();
   private CursoinstrutorControl controlC = new CursoinstrutorControl();
   private Instrutor instrutor = new Instrutor();
   private DataModel<Instrutor> instrutores;
   
   private int curso;
   private Cursoinstrutor ci = new Cursoinstrutor();
   
   public void addCurso(){
      Curso c = new CursoControl().get(curso);
      ci.getChavePK().setCurso(c);
      ci.getChavePK().setInstrutor(instrutor);
      instrutor.getCursoinstrutorList().add(ci);
      controlC.salvar(ci);
      ci = new Cursoinstrutor();
   }
   public void delCurso(Cursoinstrutor c){
      instrutor.getCursoinstrutorList().remove(c);
      controlC.excluir(c);
   }

   public void novo() {
      instrutor = new Instrutor();
   }

   public String inserir() {
      return (controle.salvar(instrutor)) ? "addCursoInst" : "falhou";
   }

   public void selecionar() {
      instrutor = instrutores.getRowData();
   }

   public String alterar() {
      return (controle.alterar(instrutor)) ? "addCursoInst" : "falhou";
   }

   public String remover() {
      return (controle.excluir(instrutor)) ? "instrutores" : "falhou";
   }

   public Instrutor getInstrutor() {
      return instrutor;
   }

   public void setInstrutor(Instrutor instrutor) {
      this.instrutor = instrutor;
   }

   public DataModel<Instrutor> getInstrutores() {
      List<Instrutor> list = controle.getList();
      instrutores = new ListDataModel<Instrutor>(list);
      return instrutores;
   }

   public void setInstrutors(DataModel<Instrutor> instrutores) {
      this.instrutores = instrutores;
   }

   public Cursoinstrutor getCi() {
      return ci;
   }

   public void setCi(Cursoinstrutor ci) {
      this.ci = ci;
   }

   public int getCurso() {
      return curso;
   }

   public void setCurso(int curso) {
      this.curso = curso;
   }
   
   
}
