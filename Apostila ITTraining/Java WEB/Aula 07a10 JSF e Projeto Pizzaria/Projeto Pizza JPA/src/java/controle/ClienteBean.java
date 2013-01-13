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
import modelo.Cliente;

@Named
@SessionScoped
public class ClienteBean implements Serializable{
   
   private ClienteControl controle = new ClienteControl();
   private Cliente cliente = new Cliente();
   private DataModel<Cliente> clientes;
   
   public void novo() {
        cliente = new Cliente();
    }
    public String inserir() {
        return (controle.salvar(cliente)) ? "clientes" : "falhou";
    }
    public void selecionar() {
        cliente = clientes.getRowData();
    }
    public String alterar() {
        return (controle.alterar(cliente))? "clientes" : "falhou";
    }
    public String remover() {
        return (controle.excluir(cliente))? "clientes" : "falhou";
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public DataModel<Cliente> getClientes() {
        List<Cliente> clienteList = controle.getList();
        clientes = new ListDataModel<Cliente>(clienteList);
        return clientes;
    }
    public void setClientes(DataModel<Cliente> clientes) {
        this.clientes = clientes;
    }
}
