
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import lanchonete.Produto;


public class Consulta {
    
    Connection con;
    Statement  stm;
    ResultSet   rs;
    String temp,sql,sql1,lanche,qtd;
    Enumeration i;
    int ini,fim;

    public Connection getCon() {
        return con;
    }

    public boolean abreBanco(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lanchonete?user=root&password=cdf2525");
            stm=con.createStatement();
        }catch(Exception e){
            System.out.println(e);
            return(false);
        }
        return true;
    }

    //*******************************************Lanche
    // Fazer a carga dos dados do Lanche
    public DefaultListModel carregaLanche(){

        DefaultListModel dlm = new DefaultListModel();
        sql = "select * from lanchonete.LANCHE;";
        try {
            rs = stm.executeQuery(sql);
            while(rs.next()){
                temp = rs.getString("codigo");
                temp+=" - " + rs.getString("descricao");
                temp+=" - " + rs.getString("preco");
                dlm.addElement(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dlm;
    }

    public void gravaLanche(String descricao, double preco){
        if(javax.swing.JOptionPane.showConfirmDialog(null,
                "Confirmação de gravação",
                "Confirmação",
                javax.swing.JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            //gravar
            try{
                sql="insert into lanchonete.LANCHE (descricao,preco) values ('"
                        + descricao + "'," + preco + ");" ;
                stm.executeUpdate(sql);

            }catch (SQLException ex) {
                Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        
    }

    public boolean buscaDescricaoLanche(String descricao){
        sql="select codigo from lanchonete.LANCHE "
                + "where descricao='"+descricao+"';";
        try {
            rs = stm.executeQuery(sql);
            while(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void deletaLanche(String codigo){
        sql="delete from lanchonete.LANCHE where codigo="+codigo+";";

        System.out.println(sql);
        try {
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

    //***************************************************Produto
    // Fazer a carga dos dados do Produto
    public DefaultListModel carregaProduto(){

        DefaultListModel dlm = new DefaultListModel();
        sql = "select * from lanchonete.PRODUTO;";
        try {
            rs = stm.executeQuery(sql);
            while(rs.next()){
                temp = rs.getString("codigo");
                temp+=" - " + rs.getString("descricao");
                temp+=" - " + rs.getString("preco");
                dlm.addElement(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dlm;
    }
    public DefaultListModel carregaProdutoOBJ(){

        DefaultListModel dlm = new DefaultListModel();
        sql = "select * from lanchonete.PRODUTO;";
        try {
            rs = stm.executeQuery(sql);
            Produto pd;
            while(rs.next()){
                pd = new Produto(rs.getInt("codigo"),
                            rs.getString("descricao"),
                            rs.getDouble("preco"));
                dlm.addElement(pd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dlm;
    }



    public void gravaProduto(String descricao, double preco){
        if(javax.swing.JOptionPane.showConfirmDialog(null,
                "Confirmação de gravação",
                "Confirmação",
                javax.swing.JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            //gravar
            try{
                sql="insert into lanchonete.PRODUTO (descricao,preco) values ('"
                        + descricao + "'," + preco + ");" ;
                stm.executeUpdate(sql);

            }catch (SQLException ex) {
                Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public boolean buscaDescricaoProduto(String descricao){
        sql="select codigo from lanchonete.PRODUTO "
                + "where descricao='"+descricao+"';";
        try {
            rs = stm.executeQuery(sql);
            while(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void deletaProduto(String codigo){
        sql="delete from lanchonete.PRODUTO where codigo="+codigo+";";

        System.out.println(sql);
        try {
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //******************************************************Ingrediente

    public String custoLanche(String lanche){
        sql="select * from lanchonete.custo where codigo=" + lanche+";";
         try {
            rs = stm.executeQuery(sql);
            while(rs.next()){
                return rs.getString("custo").toString();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return("erro do banco");
    }

    public DefaultListModel carregaIngrediente(String temp){
        DefaultListModel dlm = new DefaultListModel();
        sql="select lanche,produto,descricao,peso "
                + "from lanchonete.INGREDIENTE,lanchonete.PRODUTO "
                + "where   lanche = "+temp+" and "
                + "produto=codigo;";
        try {
            rs = stm.executeQuery(sql);
            while(rs.next()){
                temp = rs.getString("produto");
                temp+=" - " + rs.getString("descricao");
                temp+=" - " + rs.getString("peso");
                dlm.addElement(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dlm;
    }

    public DefaultListModel carregaIngredienteOBJ(String temp){
        DefaultListModel dlm = new DefaultListModel();
        sql="select lanche,produto,descricao,peso "
                + "from lanchonete.INGREDIENTE,lanchonete.PRODUTO "
                + "where   lanche = "+temp+" and "
                + "produto=codigo;";
        try {
            rs = stm.executeQuery(sql);
            Produto pd;
            while(rs.next()){
                pd = new Produto(Integer.parseInt(rs.getString("produto")),
                        rs.getString("descricao"),
                        Double.parseDouble(rs.getString("peso")));

                dlm.addElement(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dlm;
    }
    public boolean buscaIngrediente(String lanche,String produto){
        sql="select produto from lanchonete.INGREDIENTE "
                + "where lanche  = " + lanche + " and  "
                + "      produto = " + produto + ";";
        try {
            rs = stm.executeQuery(sql);
            while(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void gravaIngrediente(String lanche, String produto, double peso){
        if(javax.swing.JOptionPane.showConfirmDialog(null,
                "Confirmação de gravação",
                "Confirmação",
                javax.swing.JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            //gravar
            try{
                sql="insert into lanchonete.INGREDIENTE (lanche,produto,peso) "
                        + "values (" + lanche + "," + produto + "," + peso + ");";

                stm.executeUpdate(sql);

            }catch (SQLException ex) {
                Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void deletaIngrediente(String lanche, String produto){
        sql="delete from lanchonete.INGREDIENTE where lanche="+lanche+" and "
                + "produto="+produto+";";

        //System.out.println(sql);
        try {
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String incluirVenda(){
        sql="insert into VENDA ()values();";
        try{
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        sql="select max(numero) as ultimo from VENDA";
        try{
            stm.executeQuery(sql);
            rs=stm.executeQuery(sql);
            while(rs.next()){
                return rs.getString("ultimo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return("pau");
    }

    public void gravaVenda(DefaultListModel dlm,Date hoje, String pedido, int numero){

        DateFormat dt = new SimpleDateFormat ("yyyy-MM-dd");
        sql="update VENDA set dia='" + dt.format(hoje) + "' "
                + "where numero=" + pedido + ";";
        try{
            stm.executeUpdate(sql);
            // Carga do ComboBox Lanche
            i = dlm.elements();
            while(i.hasMoreElements()){
                temp=i.nextElement().toString();
                lanche=temp.substring(0, temp.indexOf("-"));
                ini=temp.indexOf("(");
                fim=temp.indexOf(")");
                qtd=temp.substring(ini+1,fim);

                try{
                    sql="insert into VENDAITEM (numero,lanche,quantidade) values ("
                        + pedido + "," + lanche + "," + qtd + ");";
                    //System.out.println(sql);
                    stm.executeUpdate(sql);
                }catch (SQLException ex) {
                    Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void apagaVenda(String numero){
        sql="delete from VENDA where numero=" + numero + ";";

         try {
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
