package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Produto;

public class ProdutoDao {
   // a conexão com o banco de dados

   private Connection con;

   public ProdutoDao() {
      this.con = new ConnectionFactory().getConnection();
   }

   public void adiciona(Produto produto) {
      try {
         // prepared statement para inserção
         PreparedStatement stmt = con.prepareStatement(
                 "insert into produtos set "
                 + "nome=?, valor=?");
         // seta os valores
         stmt.setString(1, produto.getNome());
         stmt.setFloat(2, produto.getValor());
         // executa
         stmt.execute();
         stmt.close();
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }

   public void altera(Produto produto) {
      try {
         PreparedStatement stmt = con.prepareStatement(
                 "update produtos set "
                 + " nome=?, valor=? where codigo=?");
         stmt.setString(1, produto.getNome());
         stmt.setFloat(2, produto.getValor());
         stmt.setInt(3, produto.getCodigo());
         stmt.execute();
         stmt.close();
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }

   public void remove(Produto produto){remove(produto.getCodigo());}
   public void remove(int id) {
      try {
         PreparedStatement stmt = 
                 con.prepareStatement("delete from produtos where codigo=?");
         stmt.setInt(1, id);
         stmt.execute();
         stmt.close();
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }
   
   public List<Produto> getLista() {
      try {
         PreparedStatement stmt = this.con.prepareStatement("select * from produtos");
         //o execute query retorna um ResultSet
         ResultSet rs = stmt.executeQuery();
         
         //lista onde ficarão nossos produtos
         List<Produto> produtos = new ArrayList<Produto>();
         
         Produto produto;
         //enquanto houver registros no ResultSet
         while (rs.next()) {
            produto = new Produto();
            produto.setCodigo(rs.getInt("codigo"));
            produto.setNome(rs.getString("nome"));
            produto.setValor(rs.getFloat("valor"));
            // adicionando o objeto à lista
            produtos.add(produto);
         }
         rs.close();
         stmt.close();
         return produtos;
      } catch (SQLException e) {
         return new ArrayList<Produto>();
      }

   }
   
   public Produto get(int codigo) {
      try {
         PreparedStatement stmt = 
                 this.con.prepareStatement(
                 "select * from produtos where codigo=?");
         stmt.setInt(1, codigo);
         
         ResultSet rs = stmt.executeQuery();
         
         Produto produto;
         if(rs.next()){
            produto = new Produto();
            produto.setCodigo(rs.getInt("codigo"));
            produto.setNome(rs.getString("nome"));
            produto.setValor(rs.getFloat("valor"));
         }else{
            produto = new Produto();
         }
         rs.close();
         stmt.close();
         return produto;
      } catch (SQLException e) {
         return new Produto();
      }

   }

}
