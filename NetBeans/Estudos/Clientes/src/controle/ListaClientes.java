/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.LinkedList;
import java.util.List;
import modelo.Cliente;

public class ListaClientes {
   
   List<Cliente> clientes = new LinkedList<Cliente>();
   
   public void add(int id, String nome, String telefone, String email){
      Cliente c = new Cliente();
      c.setId(id);
      c.setNome(nome);
      c.setTelefone(telefone);
      c.setEmail(email);
      if( ! clientes.contains(c) ) clientes.add(c);
   }
   
   public List<Cliente> getLista(){
      return clientes;
   }
}
