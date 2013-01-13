package editorvrml;

import java.io.File;
import java.lang.reflect.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClassesDoPacote {
    
    private ArrayList<Class> classes;
    
    public ClassesDoPacote() {  
        try {
            getClassesNames("modelo.primitivos");  
            //for (Class c : classes) System.out.println(c.getSimpleName());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao abrir pacote de primitivos! Arquivo não encontrado!");
        }
    }  
      
    public void getClassesNames(String pckgname) throws ClassNotFoundException {  
        classes= new ArrayList<>();  
        File directory=null; 
        try {  
            directory = 
                new File(Thread.currentThread().getContextClassLoader().getResource(pckgname.replace('.', '/')).getFile());  
        } catch(NullPointerException x) {  
            throw new ClassNotFoundException(pckgname+" does not appear to be a valid package1");  
        }  
        if(!directory.exists()) throw new ClassNotFoundException(pckgname+" does not appear to be a valid package2");  
        String[] files=directory.list();
        for(int i=0; i<files.length; i++) {
            if(!files[i].endsWith(".class")) continue;
            classes.add(Class.forName(pckgname+'.'+files[i].substring(0, files[i].length()-6)));   
        } 
    }  
    
    public ArrayList<Class> getClasses() {
        return classes;
    }
  
    //public static void main(String args[]) {  
   //     java.awt.EventQueue.invokeLater(new Runnable() { public void run() { new ClassesDoPacote(); } });  
   // }  

    
      

}
