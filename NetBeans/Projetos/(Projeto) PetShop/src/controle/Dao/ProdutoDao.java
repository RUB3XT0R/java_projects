
package controle.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.Produto;

public class ProdutoDao extends Dao{

    public ProdutoDao(){}

    public int addProduto(Produto prod) throws SQLException{
        prod.setId(getNextId("produtos"));
        executeCommand(
                "insert into produtos (id,nome,preco,estoque) values(?,?,?,?)",
                prod.getId(),prod.getNome(),prod.getPreco(),prod.getEstoque()
        );
        return prod.getId();
    }

    public void removeProduto(int id) throws SQLException{
        executeCommand("delete from produtos where id=?",id);
    }

    public void updateProduto(Produto prod) throws SQLException{
        executeCommand(
                "update produtos set nome=?, preco=? ,estoque=? where id=?",
                prod.getNome(),prod.getPreco(),prod.getEstoque(),prod.getId()
        );
    }

    public Produto getProduto(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from produtos where id=?",id);
        Produto prod = (rs.next())? populateProduto(rs): null;
        rs.close();
        return prod;
    }

    public static Produto populateProduto(ResultSet rs) throws SQLException {
        Produto toreturn = new Produto();
        toreturn.setId(rs.getInt("id"));
        toreturn.setNome(rs.getString("nome"));
        toreturn.setPreco(rs.getFloat("preco"));
        toreturn.setEstoque(rs.getInt("estoque"));
        return toreturn;
    }

    public List<Produto> getAllProdutos(ResultSet rs) throws SQLException{
        List<Produto> toreturn = new LinkedList<Produto>();
        if(rs!=null){
            while(rs.next())
                toreturn.add(populateProduto(rs));
        }
        rs.close();
        return toreturn;
    }

    public List<Produto> getAllProdutos() throws SQLException{
        ResultSet rs= executeQuery("select * from produtos");
        return getAllProdutos(rs);
    }
    public List<Produto> getAllProdutosOrdened(String field) throws SQLException{
        ResultSet rs= executeQuery("select * from produtos order by ?",field);
        return getAllProdutos(rs);
    }
}
