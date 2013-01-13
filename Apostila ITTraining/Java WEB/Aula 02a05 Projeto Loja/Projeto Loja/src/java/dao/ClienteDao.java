
package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class ClienteDao extends Dao{
   
   public void adiciona(Cliente cliente) {
      try {
         executeCommand("insert into cliente set "
                 + "cpf=?, nome=?, telefone=?, rua=?",
                 cliente.getCpf(), cliente.getNome(), 
                 cliente.getTelefone(), cliente.getEndereco());
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }

   public void altera(Cliente cliente) {
      try {
         executeCommand("update cliente set "
                 + "cpf=?, nome=?, telefone=?, rua=? "
                 + "where codigo=?",
                 cliente.getCpf(), cliente.getNome(), 
                 cliente.getTelefone(), cliente.getEndereco(), 
                 cliente.getCodigo());
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }

   public void remove(Cliente cliente){remove(cliente.getCodigo());}
   public void remove(int id) {
      try {
         executeCommand("delete from cliente where codigo=?",id);
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }
   
   public List<Cliente> getLista() {
      try {
         ResultSet rs = executeQuery("select * from cliente");
         List<Cliente> clientes = new ArrayList<Cliente>();
         while (rs.next()) clientes.add(populate(rs));
         rs.close();
         return clientes;
      } catch (SQLException ex) {
         return new ArrayList<Cliente>();
      }
   }
   
   public Cliente get(int codigo) throws SQLException {
         ResultSet rs = executeQuery("select * from cliente where codigo=?",codigo);
         Cliente cliente = rs.next()? populate(rs) : new Cliente();
         rs.close();
         return cliente;
   }
   
   private Cliente c;
   public Cliente populate(ResultSet rs) throws SQLException {
      c = new Cliente();
      c.setCodigo(rs.getInt("codigo"));
      c.setCpf(rs.getString("cpf"));
      c.setNome(rs.getString("nome"));
      c.setEndereco(rs.getString("rua"));
      c.setTelefone(rs.getString("telefone"));
      return c;
   }
}
