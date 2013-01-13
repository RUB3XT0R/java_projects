
package controle.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.Cliente;

public class ClienteDao extends Dao{

    public ClienteDao(){}

    public int addCliente(Cliente cli) throws SQLException{
        cli.setId(getNextId("clientes"));
        executeCommand(
                "insert into clientes (id,nome,idade,endereco,telefone) values(?,?,?,?,?)",
                cli.getId(),cli.getNome(),cli.getIdade(),cli.getEndereco(),cli.getTelefone()
        );
        return cli.getId();
    }

    public void removeCliente(int id) throws SQLException{
        executeCommand("delete from clientes where id=?",id);
    }

    public void updateCliente(Cliente cli) throws SQLException{
        executeCommand(
                "update clientes set nome=?,idade=?,endereco=?,telefone=? where id=?",
                cli.getNome(),cli.getIdade(),cli.getEndereco(),cli.getTelefone(),cli.getId()
        );
    }

    public Cliente getCliente(int id) throws SQLException{
        ResultSet rs= executeQuery("select * from clientes where id=?",id);
        Cliente cli = (rs.next())? populateCliente(rs) : null;
        rs.close();
        return cli;
    }

    public List<Cliente> getAllClientes() throws SQLException {
        ResultSet rs = executeQuery("SELECT * FROM clientes");
        List<Cliente> toReturn = new LinkedList<Cliente>();
        while (rs.next())
            toReturn.add(populateCliente(rs));
        rs.close();
        return toReturn;

    }

    public static Cliente populateCliente(ResultSet rs) throws SQLException {
        Cliente toreturn = new Cliente();
        toreturn.setId(rs.getInt("id"));
        toreturn.setNome(rs.getString("nome"));
        toreturn.setIdade(rs.getInt("idade"));
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
}

