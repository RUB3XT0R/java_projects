package controle.Dao;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import modelo.Cliente;

public class ClientesDao extends Dao{

    public ClientesDao(){
        super();
    }
    public int addCliente(Cliente c) throws SQLException{
        c.setId(getNextId("clientes"));
        executeCommand(
                "insert into clientes (id,cpf,nome,telefone,email,endereco,cidade,estado) values(?,?,?,?,?,?,?,?)",
                c.getId(),c.getCpf(),c.getNome(),c.getTelefone(),c.getEmail(),c.getEndereco(),c.getCidade(),c.getEstado()
                );
        return c.getId();
    }
    public void alteraCliente(Cliente c) throws SQLException{
        executeCommand(
                "update clientes set cpf=?,nome=?,telefone=?,email=?,endereco=?,cidade=?,estado=? where id=?",
                c.getCpf(),c.getNome(),c.getTelefone(),c.getEmail(),c.getEndereco(),c.getCidade(),c.getEstado(),c.getId()
                );
    }

    public void removeCliente(int id) throws SQLException{
        executeCommand("delete from clientes where id=?",id);
    }

    public Cliente getCliente(int id) throws SQLException{
        ResultSet rs= executeQuery("select * from clientes where id=?",id);
        Cliente cli = (rs.next())? populateCliente(rs) : null;
        rs.close();
        return cli;
    }

    public List<Cliente> getAllClientes() throws SQLException {
        ResultSet rs = executeQuery("select * from clientes");
        List<Cliente> toReturn = new LinkedList<Cliente>();
        while (rs.next())
            toReturn.add(populateCliente(rs));
        rs.close();
        return toReturn;

    }

    public static Cliente populateCliente(ResultSet rs) throws SQLException {
        Cliente toreturn = new Cliente();
        toreturn.setId(rs.getInt("id"));
        toreturn.setCpf(rs.getLong("cpf"));
        toreturn.setNome(rs.getString("nome"));
        toreturn.setEmail(rs.getString("email"));
        toreturn.setCidade(rs.getString("cidade"));
        toreturn.setEstado(rs.getString("estado"));
        toreturn.setEndereco(rs.getString("endereco"));
        toreturn.setTelefone(rs.getString("telefone"));
        return toreturn;
    }

    public List<Cliente> getAllClienteByNome(String nome) throws SQLException{
        List<Cliente> toreturn = new LinkedList<Cliente>();
        ResultSet rs= executeQuery("select * from clientes where nome like ?","%"+nome+"%");
        while(rs.next())
            toreturn.add(populateCliente(rs));
        rs.close();
        return toreturn;
    }

    public List<Cliente> getAllClienteByField(String field, String operador, Object valor) throws SQLException{
        List<Cliente> toreturn = new LinkedList<Cliente>();
        ResultSet rs= executeQuery("select * from clientes where ? ? ?",field,operador,valor);
        while(rs.next())
            toreturn.add(populateCliente(rs));
        rs.close();
        return toreturn;
    }
    

}
