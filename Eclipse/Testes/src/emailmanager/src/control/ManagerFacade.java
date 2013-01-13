/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import model.Executable;

public class ManagerFacade {

   public boolean run(String action, Object o) {
      try {
         String nomeClasse = action;
         Class classe = Class.forName(nomeClasse);
         Executable logica = (Executable) classe.newInstance();
         logica.run(o);
         return true;
      } catch (Exception ex) {
         JOptionPane.showMessageDialog(null, "Um erro ocorreu", "Erro", JOptionPane.ERROR_MESSAGE);
         return false;
      }

   }
}
