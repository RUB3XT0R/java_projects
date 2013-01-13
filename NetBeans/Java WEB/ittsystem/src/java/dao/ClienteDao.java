package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import modelo.*;

public class ClienteDao extends Dao {
    
    public boolean addCliente(Cliente c) {
        try {
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            executeCommand(
                    "INSERT INTO cliente set "
                    + "nome=?,"
                    + "cpf_cnpj=?,"
                    + "RG=?,"
                    + "tipo_cliente=?,"
                    + "dataCadastro=?,"
                    + "uf=?,"
                    + "endereco=?,"
                    + "bairro=?,"
                    + "cidade=?,"
                    + "cep=?,"
                    + "telefoneResidencial=?,"
                    + "telefoneComercial=?,"
                    + "telefoneCelular=?,"
                    + "email=?,"
                    + "email2=?",
                    c.getNome(), c.getCpf_cnpj(), c.getRg(), c.getTipo(),
                    sd.format(new java.util.Date()), c.getUf(), c.getLogradouro(), c.getBairro(),
                    c.getCidade(), c.getCep(), c.getTelefoneResidencial(), c.getTelefoneComercial(),
                    c.getTelefoneCelular(), c.getEmail(), c.getEmail2());

            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    public boolean upCliente(Cliente c) {
        try {
            executeCommand("UPDATE  cliente set "
                    + "nome=?,"
                    + "cpf_cnpj=?,"
                    + "RG=?,"
                    + "tipo_cliente=?,"
                    + "uf=?,"
                    + "endereco=?,"
                    + "bairro=?,"
                    + "cidade=?,"
                    + "cep=?,"
                    + "telefoneResidencial=?,"
                    + "telefoneComercial=?,"
                    + "telefoneCelular=?,"
                    + "email=?,"
                    + "email2=?"
                    + "where id=?",
                    c.getNome(), c.getCpf_cnpj(), c.getRg(), c.getTipo(), c.getUf(), c.getLogradouro(), c.getBairro(),
                    c.getCidade(), c.getCep(), c.getTelefoneResidencial(), c.getTelefoneComercial(),
                    c.getTelefoneCelular(), c.getEmail(), c.getEmail2(), c.getId());
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    public boolean delCliente(int id) {
        try {
            executeCommand("delete from cliente where id=?",id);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    public boolean contains(String nome) {
        try {
            return contain("cliente","nome",nome);
        } catch (SQLException ex) {return true;}
    }
    public boolean contains(int idCliente) {
        try {
            return contain("cliente","id",idCliente);
        } catch (SQLException ex) {return true;}
    }
    public Cliente getCliente(int id) {
        try {
            ResultSet rs = executeQuery("select * from cliente where id=?",id);
            Cliente cliente = rs.next()? populateCliente(rs) : null;
            rs.close();
            return cliente;
        } catch (SQLException e) {return null;}
    }
    public Cliente getClienteByCpf(String cpf) {
        try {
            ResultSet rs = executeQuery("select * from cliente where cpf_cnpj=?",cpf);
            Cliente cliente = rs.next()? populateCliente(rs) : null;
            rs.close();
            return cliente;
        } catch (SQLException e) {return null;}
    }
    public List<Cliente> getClientes() {
        try {
            ResultSet rs = executeQuery("SELECT * FROM `ittraining`.`cliente` order by cpf_cnpj");
            List<Cliente> clientes = new LinkedList<Cliente>(); 
            while(rs.next()) clientes.add(populateCliente(rs));
            rs.close();
            return clientes;
        } catch (SQLException e) {
            System.out.println(e);
            return null;}
    }
    public List<Cliente> getClientes(String nome) {
        try {
            ResultSet rs = executeQuery("select * from cliente where nome like ? order by cpf_cnpj","%"+nome+"%");
            List<Cliente> clientes = new LinkedList<Cliente>(); 
            while(rs.next()) clientes.add(populateCliente(rs));
            rs.close();
            return clientes;
        } catch (SQLException e) {return null;}
    }
    public List<Cliente> getClientes(Date dataCadastro) {
        try {
            ResultSet rs = executeQuery("select * from cliente where dataCadastro=?",dataCadastro);
            List<Cliente> clientes = new LinkedList<Cliente>(); 
            while(rs.next()) clientes.add(populateCliente(rs));
            rs.close();
            return clientes;
        } catch (SQLException e) {return null;}
    }
    public Cliente populateCliente(ResultSet rs) throws SQLException{
        Cliente cliente = new Cliente();
        cliente.setId(rs.getInt("id"));
        cliente.setNome(rs.getString("nome"));
        cliente.setCpf_cnpj(rs.getString("cpf_cnpj"));
        cliente.setTipo(rs.getString("tipo_cliente"));
        cliente.setCadastro(rs.getDate("dataCadastro"));
        cliente.setUf(rs.getString("uf"));
        cliente.setLogradouro(rs.getString("endereco"));
        cliente.setRg(rs.getString("RG"));
        cliente.setBairro(rs.getString("bairro"));
        cliente.setCidade(rs.getString("cidade"));
        cliente.setCep(rs.getString("cep"));
        cliente.setTelefoneResidencial(rs.getString("telefoneResidencial"));
        cliente.setTelefoneComercial(rs.getString("telefoneComercial"));
        cliente.setTelefoneCelular(rs.getString("telefoneCelular"));
        cliente.setEmail(rs.getString("email"));
        cliente.setEmail2(rs.getString("email2"));
        return cliente;
    }
}