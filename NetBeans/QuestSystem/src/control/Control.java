/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.util.List;
import model.Interessado;

/**
 *
 * @author Lucas
 */
public class Control {
    
            
    public void gerarContatos(String path,List<Interessado> lista) throws IOException{
        Arquivo arq = new Arquivo();
	arq.openFile(path+".txt");
        for(Interessado i : lista)
               arq.getOutput().format("%s;",i.getEmail());
        arq.closeFile();
    }

    
}
