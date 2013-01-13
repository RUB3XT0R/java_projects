
package controle.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.Fornecedor;

public class FornecedorDao extends Dao{

    public FornecedorDao(){}

    public int addFornecedor(Fornecedor f) throws SQLException{
        f.setId(getNextId("fornecedor"));
        executeCommand(
                "insert into fornecedor (id,cnpj,nome,email,endereco,telefone) values(?,?,?,?,?,?)",
                f.getId(),f.getCnpj(),f.getNome(),f.getEmail(),f.getEndereco(),f.getTelefone()
        );
        return (int) f.getId();
    }

    public void removeFornecedor(int id) throws SQLException{
        executeCommand("delete from fornecedor where id=?",id);
    }

    public void updateFornecedor(Fornecedor f) throws SQLException{
        executeCommand(
                "update fornecedor set cnpj=?,nome=?,email=?,endereco=?,telefone=? where id=?",
                f.getCnpj(),f.getNome(),f.getEmail(),f.getEndereco(),f.getTelefone(),f.getId()
        );
    }

    public Fornecedor getFornecedor(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from fornecedor where id=?",id);
        Fornecedor prod = (rs.next())? populateFornecedor(rs): null;
        rs.close();
        return prod;
    }

    public List<Fornecedor> getFornecedor(String nome) throws SQLException{
        List<Fornecedor> toreturn = new LinkedList<Fornecedor>();
        ResultSet rs= executeQuery("select * from fornecedor where nome like ?","%"+nome+"%");
        while(rs.next())
            toreturn.add(populateFornecedor(rs));
        rs.close();
        return toreturn;
    }

    public static Fornecedor populateFornecedor(ResultSet rs) throws SQLException {
        Fornecedor toreturn = new Fornecedor();
        ProdutoDao pd = new ProdutoDao();

        toreturn.setId(rs.getInt("id"));
        toreturn.setCnpj(rs.getString("cnpj"));
        toreturn.setNome(rs.getString("nome"));
        toreturn.setEmail(rs.getString("email"));
        toreturn.setEndereco(rs.getString("endereco"));
        toreturn.setTelefone(rs.getString("telefone"));
        toreturn.setProdutos(pd.findForOneSupplier(toreturn));
        return toreturn;
    }

    public List<Fornecedor> getAllFornecedores() throws SQLException{
        List<Fornecedor> toreturn = new LinkedList<Fornecedor>();
        ResultSet rs= executeQuery("select * from fornecedor");
        while(rs.next())
            toreturn.add(populateFornecedor(rs));
        rs.close();
        return toreturn;
    }

}
