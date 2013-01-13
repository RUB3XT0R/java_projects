/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.Interessado;
import view.JCadInteressado;
import view.JConsultaInteressado;

/**
 *
 * @author Lucas
 */
public  class fillTable implements  Runnable{
    private final DefaultTableModel model;
    private List<Interessado> lista;
   
    public fillTable(JCadInteressado frame) {
        model = (DefaultTableModel) frame.tblInteressados.getModel();
        model.setColumnIdentifiers(new Object[]{"Nome","Email","Tel.Residencial"});
        model.setNumRows(0);  
        this.lista= frame.interessados;
    }
    
    @Override
    public void run() {
         for (Interessado c : lista) {
             model.addRow(new Object[]{c.getNome(),c.getEmail(),c.getTelefoneR()});
         }
    }
    
}
