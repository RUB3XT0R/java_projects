
package controle.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import modelo.Fornecedor;
import modelo.Produto;

public class ProdutoDao extends Dao {

    public ProdutoDao() {
    }

    public int addProduto(Produto prod) throws SQLException {
        prod.setId(getNextId("produtos"));
        executeCommand(
                "insert into produtos (id,nome,qtde_estoque,preco_inicial,preco_venda,id_fornecedor,foto) values(?,?,?,?,?,?,?)",
                prod.getId(), prod.getNome(), prod.getQtdeEstoque(),prod.getPreco_inicial(),prod.getPreco_venda(),prod.getFornecedor().getId(),prod.getFoto()
        );
        return (int) prod.getId();
    }

    public void removeProduto(long id) throws SQLException {
        executeCommand("delete from produtos where id=?", id);
    }

    public void updateProduto(Produto prod) throws SQLException {
        executeCommand(
        "update produtos set nome=?,qtde_estoque=?,preco_inicial=?,preco_venda=?,id_fornecedor=?,foto=? where id=?",
                prod.getNome(), prod.getQtdeEstoque(),prod.getPreco_inicial(),prod.getPreco_venda(),prod.getFornecedor().getId(),prod.getFoto(),prod.getId()
        );
    }

    public Produto getProduto(long id) throws SQLException {
        ResultSet rs = executeQuery("select * from produtos where id=?", id);
        Produto prod = (rs.next()) ? populateProduto(rs) : null;
        rs.close();
        return prod;
    }

    public static Produto populateProduto(ResultSet rs, Fornecedor... f) throws SQLException {
        
        Produto toreturn = new Produto();
        FornecedorDao daof = new FornecedorDao();

        toreturn.setId(rs.getInt("id"));
        toreturn.setNome(rs.getString("nome"));
        toreturn.setQtdeEstoque(rs.getInt("qtde_estoque"));
        toreturn.setPreco_inicial(rs.getInt("preco_inicial"));
        toreturn.setPreco_venda(rs.getFloat("preco_venda"));
        toreturn.setFornecedor( (f!=null && f.length >0) ?  f[0] : daof.getFornecedor(rs.getInt("id_fornecedor")));
        toreturn.setFoto(rs.getString("foto"));
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

    public List<Produto> getProduto(String nome) throws SQLException {
        List<Produto> toreturn = new LinkedList<Produto>();
        ResultSet rs = executeQuery("select * from produtos where nome like ?","%"+nome+"%");
        while (rs.next()) {
            toreturn.add(populateProduto(rs));
        }
        rs.close();
        return toreturn;
    }

    public List<Produto> findForOneSupplier(Fornecedor f) throws SQLException {
        List<Produto> toreturn = new ArrayList<Produto>();
        ResultSet rs = executeQuery("select * from  produtos where id_fornecedor=?",f.getId());
        while (rs.next()) {
           toreturn.add(populateProduto(rs,f));
        }
        rs.close();
        return toreturn;
    }

}
