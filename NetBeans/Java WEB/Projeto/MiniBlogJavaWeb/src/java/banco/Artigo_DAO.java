

package banco;

import banco.Categoria_DAO;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelos.Artigo;
import modelos.Categoria;


public class Artigo_DAO extends Dao{

    private  static List<Artigo> artigos = new LinkedList<Artigo>();
    private  static ResultSet rs;
    private  static Artigo artigo;
    private  static String retorno;
    private  static Categoria_DAO c = new Categoria_DAO();;

    public static  String inserir(Artigo artigo){
        retorno ="Falha";
        try {
            executeCommand("insert into artigos "
                    + "(titulo,resumo,dataHora,categoria,conteudo,autor) "
                    + "values "
                    + "(?,?,?,?,?,?)",
                    artigo.getTitulo(),artigo.getResumo(),artigo.getDataHora(),artigo.getCategoria().getCodigo(),artigo.getConteudo(),artigo.getAutor());
            retorno = "sucesso";
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return retorno;
    }

    public  static String alterar(Artigo artigo){
        retorno = "falha";
        try {
            executeCommand("update artigos "
                    + "set titulo=?,resumo=?,dataHora=?,categoria=?,conteudo=?,autor=? "
                    + "where codigo=?",
                    artigo.getTitulo(),artigo.getResumo(),artigo.getDataHora(),artigo.getCategoria().getCodigo(),artigo.getConteudo(),artigo.getAutor(),artigo.getCodigo());
            retorno = "sucesso";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno;
    }

    public  static String remover(int codigo){
        retorno = "falha";
        try{
            executeCommand("delete from artigos where codigo=?",codigo);
            retorno = "sucesso";
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno;
    }

    public  static List<Artigo> listar(ResultSet rs,boolean ...semcat) {
        try {
            artigos = new LinkedList<Artigo>();
            while (rs.next()) {
                artigo = new Artigo();
                artigo.setCodigo(rs.getInt("codigo"));
                artigo.setTitulo(rs.getString("titulo"));
                artigo.setResumo(rs.getString("resumo"));
                artigo.setDataHora(rs.getDate("dataHora"));
                if(semcat==null || semcat.length==0){
                    artigo.setCategoria(c.selecionar(rs.getInt("categoria")));
                }
                artigo.setConteudo(rs.getString("conteudo"));
                artigo.setAutor(rs.getString("autor"));
                artigos.add(artigo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return artigos;
    }

    public  static List<Artigo> listar() throws SQLException {
            rs = executeQuery("select * from artigos");
            return(listar(rs));
    }
    public  static List<Artigo> listar(String titulo) throws SQLException {
            rs = executeQuery("select * from artigos where titulo like ?","%"+titulo+"%");
            return(listar(rs));
    }
    public  static List<Artigo> listar(Date data) throws SQLException {
            rs = executeQuery("select * from artigos where dataHora=?",data);
            return(listar(rs));
    }
    public  static List<Artigo> listar(Date inicio,Date fim) throws SQLException {
            rs = executeQuery("select * from artigos where dataHora>=? and dataHora<=?",inicio,fim);
            return(listar(rs));
    }
    public  static List<Artigo> listar(int categoria,boolean ...semcat) throws SQLException {
            rs = executeQuery("select * from artigos where categoria=?",categoria);
            return(listar(rs,true));
    }

    public  static Artigo selecionar(int codigo,boolean... semartigo) {
        try {
            rs = executeQuery("select * from artigos where codigo =?",codigo);
            while (rs.next()) {
                artigo = new Artigo();
                artigo.setCodigo(rs.getInt("codigo"));
                artigo.setTitulo(rs.getString("titulo"));
                artigo.setResumo(rs.getString("resumo"));
                artigo.setDataHora(rs.getDate("dataHora"));
                if(semartigo==null || semartigo.length==0){
                artigo.setCategoria(c.selecionar(rs.getInt("categoria")));
                }
                artigo.setConteudo(rs.getString("conteudo"));
                artigo.setAutor(rs.getString("autor"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return artigo;
    }

}
