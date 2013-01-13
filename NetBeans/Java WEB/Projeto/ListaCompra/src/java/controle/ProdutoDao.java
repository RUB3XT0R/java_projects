
package controle;

import dao.Dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.Produto;

public final class ProdutoDao extends Dao{
    
    public boolean addProduto(Produto p){
        try {
            executeCommand("insert into produto"
                    + "(nome,descricao,unidade_compra,qtde_prevista_mes,preco_maximo_anterior)"
                    + "values(?,?,?,?,?)",
                    p.getNome(),p.getDescricao(),p.getUnidade_compra(),
                    p.getQtde_prevista_mes(),p.getPreco_maximo_anterior());
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean upProduto(Produto p){
        try {
            executeCommand("update produto set "
                    + "nome=?,descricao=?,unidade_compra=?,qtde_prevista_mes=?,preco_maximo_anterior=? "
                    + "where codigo=?",
                    p.getNome(),p.getDescricao(),p.getUnidade_compra(),
                    p.getQtde_prevista_mes(),p.getPreco_maximo_anterior(),
                    p.getCodigo());
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean delProduto(int codigo){
        try {
            executeCommand("delete from produto "
                    + " where codigo = ?",codigo);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public Produto getProduto(int codigo){
        try {
            ResultSet rs = executeQuery("select * from produto where codigo = ?", codigo);
            Produto p = new Produto();
            p.setCodigo(rs.getInt("codigo"));
            p.setDescricao(rs.getString("descricao"));
            p.setNome(rs.getString("nome"));
            p.setPreco_maximo_anterior(rs.getFloat("preco_maximo_anterior"));
            p.setQtde_prevista_mes(rs.getInt("qtde_prevista_mes"));
            p.setUnidade_compra(rs.getString("unidade_Compra"));
            return p;
        } catch (SQLException ex) {
            return new Produto();
        }
    }
    
    public List<Produto> getProdutos(){
        try {
            ResultSet rs = executeQuery("select * from produto");
            List<Produto> produtos = new LinkedList<Produto>();
            Produto p;
            while (rs.next()) {
                p = new Produto();
                p.setCodigo(rs.getInt("codigo"));
                p.setDescricao(rs.getString("descricao"));
                p.setNome(rs.getString("nome"));
                p.setPreco_maximo_anterior(rs.getFloat("preco_maximo_anterior"));
                p.setQtde_prevista_mes(rs.getInt("qtde_prevista_mes"));
                p.setUnidade_compra(rs.getString("unidade_Compra"));
                produtos.add(p);
            }
            return produtos;
        } catch (SQLException ex) {
            return new LinkedList<Produto>();
        }
    }
    
    public Produto populateProduto(ResultSet  rs) throws SQLException{
        Produto p = new Produto();
        p.setCodigo(rs.getInt("codigo"));
        p.setDescricao(rs.getString("descricao"));
        p.setNome(rs.getString("nome"));
        p.setPreco_maximo_anterior(rs.getFloat("preco_maximo_anterior"));
        p.setQtde_prevista_mes(rs.getInt("qtde_prevista_mes"));
        p.setUnidade_compra(rs.getString("unidade_Compra"));
        return p;
    }
}
