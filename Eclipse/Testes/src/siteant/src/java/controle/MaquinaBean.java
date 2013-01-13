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
import modelo.Maquina;

@Named
@SessionScoped
public class MaquinaBean implements Serializable {
  
   private MaquinaControl controle = new MaquinaControl();
   private Maquina maquina = new Maquina();
   private DataModel<Maquina> maquinas;
   private String page;
   private boolean showPanel = false;
   
   public MaquinaBean() {
      super();
   }
   
   public void novo() {
      maquina = new Maquina();
      showPanel = true;
   }

   public String inserir() {
      page = (controle.salvar(maquina)) ? "maquinas" : "falhou";
      showPanel = false;
      return page;
   }
   public void cancelar() {
      showPanel = false;
   }

   public void selecionar() {
      maquina = maquinas.getRowData();
      showPanel = true;
   }

   public String alterar() {
      page =(controle.alterar(maquina)) ? "maquinas" : "falhou";
      showPanel = false;
      return page;
   }

   public String remover() {
      page = (controle.excluir(maquina)) ? "maquinas" : "falhou";
      showPanel = false;
      return page;
   }

   public Maquina getMaquina() {
      return maquina;
   }

   public void setMaquina(Maquina maquina) {
      this.maquina = maquina;
   }

   public DataModel<Maquina> getMaquinas() {
      List<Maquina> lista = controle.getList();
      maquinas = new ListDataModel<Maquina>(lista);
      return maquinas;
   }

   public void setMaquinas(DataModel<Maquina> maquinas) {
      this.maquinas = maquinas;
   }

   public MaquinaControl getControle() {
      return controle;
   }

   public void setControle(MaquinaControl controle) {
      this.controle = controle;
   }

   public String getPage() {
      return page;
   }

   public void setPage(String page) {
      this.page = page;
   }

   public boolean isShowPanel() {
      return showPanel;
   }

   public void setShowPanel(boolean showPanel) {
      this.showPanel = showPanel;
   }
   
   
}
