package control;

import java.util.List;
import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

    public static void main(String[] args) {
        //fabrica de sessão de banco de dados
        //"conexao"
        SessionFactory sf = new AnnotationConfiguration() 
                //dialeto, comunicação com o banco de dados
                //o hibernate é compativel com vários banco de dados
                //sua aplicação ganha independencia de banco de dados.
                //vários tipos de dialetos para cada banco de dados
                .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect") 
                //driver de conexão
                //hibernate.connection.driver_class = com.mysql.jdbc.Driver
                .setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver") 
                //url de conexao
                .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/testehibernate")
                .setProperty("hibernate.connection.username", "root")
                .setProperty("hibernate.connection.password", "cdf2525") 
                //formata e mostra os códigos sqlque ele está usando
                .setProperty("hibernate.show_sql", "false")
                .setProperty("hibernate.format_sql", "true") 
                //configurando pools de conexão
                //NÃO FUÇA!!!
                .setProperty("hibernate.c3p0.acquire_increment", "1")
                .setProperty("hibernate.c3p0.idle_test_period", "100")
                .setProperty("hibernate.c3p0.max_size", "10")
                .setProperty("hibernate.c3p0.max_statements", "")
                .setProperty("hibernate.c3p0.min_size", "5")
                .setProperty("hibernate.c3p0.timeout", "100") 
                //quais classes estão mapeadas.
                ///COLOCAR INDIVIDUAL EM CADA CLASSE?? (CONSTRUTOR)
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Invoice.class)
                .addAnnotatedClass(InvoiceItem.class)
                .buildSessionFactory();


        //para poder realizar todas as ações desejados
        Session se = sf.openSession();
        //abrindo transação de ações
        se.beginTransaction();

        //começo das ações


        //capturando usuários no banco
        //User u = (User) se.get(User.class,1);
        //System.out.println("O nome é :"+u.getName());
        //u = (User) se.get(User.class,2);
        //System.out.println("O nome é :"+u.getName());
        //u = (User) se.get(User.class,3);
        //System.out.println("O nome é :"+u.getName());
        //User newUser = new User();
        //newUser.setId(5);
        //newUser.setName("Raul Gamões");
            //grava
        // se.save(newUser);
            //atualiza
         //se.update(newUser);
            //delete
        // se.delete(newUser);
        //u = (User) se.get(User.class,5);
        //System.out.println("O nome é :"+u.getName());
        

        //Product p = (Product) se.get(Product.class,1);
        //System.out.println("Produto : "+p.getName()+", seu dono : "+(p.getOwner()).getName());
        //ele ira verificar e vai cirar o novo usuario tmbm, junto com o produto.
        //td o q eh atualizado do owenr do produto, por meio do produto, tmbm eh feito
        //na tabela user, a qual owner pertence.
        //caso coloque null, o user sera apagado.
        //User u = new User();
        //u.setId(8);
        //u.setName("Gabriel");
        //p.setOwner(u);
        //se.update(p);
        //System.out.println("Produto : "+p.getName()+", seu dono : "+(p.getOwner()).getName());
        //Product p = (Product) se.get(Product.class,2);
        Invoice invoice = (Invoice) se.get(Invoice.class,1);

        //InvoiceItem i = new InvoiceItem();
        //i.setId(14);
        //i.setAmount(3);
        //i.setProduct(p);
        //invoice.addItem(i);
        
        //System.out.println("----------------------------------------------------------");
        
        //List<InvoiceItem> l = invoice.getItens();
        //System.out.println("O numero de produtos vendido foi de "+l.size());
        //System.out.println("O vendedor é "+invoice.getVendor().getName());
        //System.out.println("Os produtos vendidos foram: ");
        //double total=0;
        //for (InvoiceItem a : l) {
        //    System.out.println("\t- "+a.getProduct().getId()+" , "+a.getProduct().getName()+" , quantidade :"+a.getAmount());
        //    total+=a.getAmount();
        //}
        //System.out.println("Total :"+total);
        //System.out.println("-----------------------Relatórios de compras-----------------\n\n");
        //relatorio(se,1);
        //relatorio(se,2);
        //relatorio(se,3);
        //relatorio(se,4);
        //System.out.println("\n-------------------------------------------------------------");
        //Product p = (Product) se.get(Product.class,1);
        //System.out.println("Quantas pessoas compraram"+p.getName()+" : "+p.getInvoiceItens().size());
        //invoice.getItens().remove(0);
        //se.merge(invoice);
        //System.out.println("----------------------------------------------------------");
        

        


        //termino das ações

        //fechando transações de ações
        //sem esse commit ele não faz as ações, não grava os dados no banco
        se.getTransaction().commit();
        se.close();
        //sf.close();

        Session se2 = sf.openSession();
        se2.beginTransaction();

        //reanexa o objeto na sessão
        se2.update(invoice);
        relatorio(se2,1);

        se2.getTransaction().commit();
        se2.close();

        sf.close();
    }

    public static void relatorio(Session se,int i){
        System.out.println("-----------------------Relatório-----------------------------");
        Invoice invoice = (Invoice) se.get(Invoice.class,i);
        List<InvoiceItem> l = invoice.getItens();
        System.out.println("Ocorreu em "+invoice.getDateOfSale());
        System.out.println("O numero de produtos vendidos foi "+l.size());
        System.out.println("O vendedor é "+invoice.getVendor().getName());
        System.out.println("Os produtos vendidos foram: ");
        double total=0;
        for (InvoiceItem a : l) {
            System.out.println("\t- "+a.getProduct().getId()+" , "+a.getProduct().getName()+" , quantidade :"+a.getAmount());
            total+=a.getAmount();
        }
        System.out.println("Total de produtos:"+total);
        System.out.println("-------------------------------------------------------------");
    }

}
