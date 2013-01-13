
package classesparaaula;


import com.mysql.jdbc.Connection;
import java.sql.*;

//criando uma classe de conexao,
//chamada conexao para ser chamada sempre que  for preciso abrir uma conexao com o banco de dados.
public class Conexao {

    //criando um método que realize e retorne essa conexão
    public static Connection getConn(){
       try{
           //aqui vamos mostrar qual é o driver que iremos utilizar,
           //o drive mostra como o JDBC deve se comportar
           //e comunicar com o SGBD, isso é,
           //ele indica qual é o SGBD que iremos nos conectar
           //e como será realizada essa conexão.
           //aqui utilizaremos o JDBC para o MySQL, mas existem outros, um para cada SGBD.
            Class.forName("com.mysql.jdbc.Driver");
            //aqui nós vamos retorna a conexão pronta.
            return (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha.");
            //exceções são criadas para verificar se a classe do driver foi encontrado ou não,
            //e se ocorreu um erro de conexão com o banco de dados.
       } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            return null;
        } catch (SQLException s) {
            System.out.println(s);
            return null;
        }
    }

}

