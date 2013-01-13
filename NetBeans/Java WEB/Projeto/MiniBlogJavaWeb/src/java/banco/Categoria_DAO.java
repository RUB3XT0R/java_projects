
package banco;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelos.Categoria;


public class Categoria_DAO extends Dao{

    private static List<Categoria> categorias = new LinkedList<Categoria>();
    private static ResultSet rs;
    private static Categoria categoria;
    private static String retorno;

    public static String inserir(Categoria categoria){
        retorno ="Falha";
        try {
            executeCommand("insert into categoria (nome) values (?)",categoria.getNome());
            retorno = "sucesso";
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return retorno;
    }

    public static  String alterar(Categoria categoria){
        retorno = "falha";
        try {
            executeCommand("update categoria set nome=? where codigo=?", categoria.getNome(), categoria.getCodigo());
            retorno = "sucesso";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno;
    }

    public static  String remover(int codigo){
        retorno = "falha";
        try{
            executeCommand("delete from categoria where codigo=?",codigo);
            executeCommand("delete from artigos where categoria=?",codigo);
            retorno = "sucesso";
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno;
    }

    public static  List<Categoria> listar(){
        try {
            categorias = new LinkedList<Categoria>();
            rs = executeQuery("select * from categoria;");
            while(rs.next()){
                categoria = new Categoria();
                categoria.setCodigo(rs.getInt("codigo"));
                categoria.setNome(rs.getString("nome"));
                categoria.setArtigos(Artigo_DAO.listar(categoria.getCodigo(),false));
                categorias.add(categoria);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categorias;
    }


    public static  Categoria selecionar(int codigo) {
        try {
            ResultSet rs = executeQuery("select * from categoria where codigo ='"+codigo+"'");
            rs.next();
            categoria = new Categoria();
            categoria.setCodigo(rs.getInt("codigo"));
            categoria.setNome(rs.getString("nome"));
            categoria.setArtigos(Artigo_DAO.listar(categoria.getCodigo(),false));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoria;
    }


}
