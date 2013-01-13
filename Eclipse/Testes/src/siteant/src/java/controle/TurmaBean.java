
package controle;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;
import modelo.Turma;

@Named
@SessionScoped
public class TurmaBean implements Serializable {

   private TurmaControl controle = new TurmaControl();
   private Turma turma = new Turma();
   private DataModel<Turma> turmas;
   
   private int curso;
   private DataModel<Turma> turmasABC;
   private DataModel<Turma> turmasUP;

   public TurmaBean() {
      super();
   }
   
   public String  isCategoria(String cat){
        if (cat.equalsIgnoreCase("Oracle")) return "oracle";
        if (cat.equalsIgnoreCase("SAP")) return "sap";
        if (cat.equalsIgnoreCase("Desenvolvimento de Sistemas")) return "dessis";
        if (cat.equalsIgnoreCase("Gestão")) return "gestao";
        else return "outro";
   }
   
   public void novo() {
      turma = new Turma();
   }

   public String inserir() {
      turma.setCurso(new CursoControl().get(curso));
      return (controle.salvar(turma)) ? "turmas" : "falhou";
   }

   public void selecionar() {
      turma = turmas.getRowData();
   }
   
   public void selecionarABC() {
      turma = turmasABC.getRowData();
   }
   
   public void selecionarUP() {
      turma = turmasUP.getRowData();
   }

   public String alterar() {
      return (controle.alterar(turma)) ? "turmas" : "falhou";
   }

   public String remover() {
      return (controle.excluir(turma)) ? "turmas" : "falhou";
   }

   public TurmaControl getControle() {
      return controle;
   }

   public void setControle(TurmaControl controle) {
      this.controle = controle;
   }

   public Turma getTurma() {
      return turma;
   }

   public void setTurma(Turma turma) {
      this.turma = turma;
   }

   public DataModel<Turma> getTurmas() {
      List<Turma> lista = controle.getList();
      turmas = new ListDataModel<Turma>(lista);
      return turmas;
   }

   public void setTurmas(DataModel<Turma> turmas) {
      this.turmas = turmas;
   }

   public DataModel<Turma> getTurmasABC() {
       List<Turma> lista = controle.getListABC();
      turmasABC = new ListDataModel<Turma>(lista);
      return turmasABC;
   }

   public void setTurmasABC(DataModel<Turma> turmasABC) {
      this.turmasABC = turmasABC;
   }

   public DataModel<Turma> getTurmasUP() {
       List<Turma> lista = controle.getListUP();
      turmasUP = new ListDataModel<Turma>(lista);
      return turmasUP;
   }

   public void setTurmasUP(DataModel<Turma> turmasUP) {
      this.turmasUP = turmasUP;
   }

   public int getCurso() {
      return curso;
   }

   public void setCurso(int curso) {
      this.curso = curso;
   }

   
   
}
