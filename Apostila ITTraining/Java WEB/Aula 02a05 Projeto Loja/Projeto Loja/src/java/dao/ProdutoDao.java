package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Produto;

public class ProdutoDao extends Dao{
   

   public void adiciona(Produto produto) {
      try {
         executeCommand("insert into produtos set "
                 + "nome=?, valor=?",
                   produto.getNome(), produto.getValor());
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }

   public void altera(Produto produto) {
      try {
         executeCommand("update produtos set "
                 + " nome=?, valor=? where codigo=?",
                 produto.getNome(), produto.getValor(), 
                 produto.getCodigo());
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }

   }

   public void remove(Produto produto){remove(produto.getCodigo());}
   public void remove(int id) {
      try {
         executeCommand("delete from produtos where codigo=?",id);
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }
   
   public List<Produto> getLista() throws SQLException {
      ResultSet rs = executeQuery("select * from produtos");
      List<Produto> produtos = new ArrayList<Produto>();
      while (rs.next())  produtos.add(populate(rs));
      rs.close();
      return produtos;
   }
   
   public Produto get(int codigo) throws SQLException {
         ResultSet rs = executeQuery("select * from produtos where codigo=?",codigo);
         Produto produto = rs.next()? populate(rs) : new Produto();
         rs.close();
         return produto;
   }
   
   private Produto p;
   public Produto populate(ResultSet rs) throws SQLException {
      p = new Produto();
      p.setCodigo(rs.getInt("codigo"));
      p.setNome(rs.getString("nome"));
      p.setValor(rs.getFloat("valor"));
      return p;
   }
}
