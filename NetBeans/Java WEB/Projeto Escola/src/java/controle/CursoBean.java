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

@Named
@SessionScoped
public class CursoBean implements Serializable {

   private CursoControl controle = new CursoControl();
   private Curso curso = new Curso();
   private DataModel<Curso> cursos;

   public void novo() {
      curso = new Curso();
   }

   public String inserir() {
      return (controle.salvar(curso)) ? "cursos" : "falhou";
   }

   public void selecionar() {
      curso = cursos.getRowData();
   }

   public String alterar() {
      return (controle.alterar(curso)) ? "cursos" : "falhou";
   }

   public String remover() {
      return (controle.excluir(curso)) ? "cursos" : "falhou";
   }

   public Curso getCurso() {
      return curso;
   }

   public void setCurso(Curso curso) {
      this.curso = curso;
   }

   public DataModel<Curso> getCursos() {
      List<Curso> cursoList = controle.getList();
      cursos = new ListDataModel<Curso>(cursoList);
      return cursos;
   }

   public void setCursos(DataModel<Curso> cursos) {
      this.cursos = cursos;
   }
}
