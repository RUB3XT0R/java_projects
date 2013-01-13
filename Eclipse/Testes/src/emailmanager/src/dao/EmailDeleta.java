/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.Dao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Executable;


public class EmailDeleta extends Dao implements Executable {

   @Override
   public <Interessado> boolean run(Interessado o) {
      try {
         getNextId("ITT_PROSPECT");
         return false;
      } catch (SQLException ex) {
         Logger.getLogger(EmailDeleta.class.getName()).log(Level.SEVERE, null, ex);
         return true;
      }
   }   
   
}
