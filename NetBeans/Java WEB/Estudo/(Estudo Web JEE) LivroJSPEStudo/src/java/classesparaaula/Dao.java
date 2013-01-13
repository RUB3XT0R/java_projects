
package classesparaaula;

import java.sql.*;

public abstract class Dao {

    //esse método cria uma conexão com com a classe Conexao,
    //fazendo com que ela se conecte ao banco. Abrindo assim, uma nova sessão.
    public Connection getConnection(){
        return Conexao.getConn();
    }
    //ambos os métodos a seguir criam Statements, ou instruçoes semi prontas,
    //para rodar SQL. Elas já estão semi-preparadas.
    //O método mais usado é o getStatement(Stringstatement),
    //onde se passa uma String contendo uma instrução SQL.
    public Statement getStatement() throws SQLException{
        return getConnection().createStatement();
    }
    
    public PreparedStatement getStatement(String statement) throws SQLException{
        return getConnection().prepareStatement(statement);
    }

    // esses dois métodos a seguir recebem a String SQL desejada
    // e podem receber vários ou nenhum parâmetro do tipo Object, ou seja,
    // elas podem receber parâmetros que identificam valores a serem colocados nas SQL,
    // como os dados de uma inserção, ou atualização, ou remoção e parâmetros de pesquisa.

    //  executeQuery é um método próprio para consultas, e retorna um resultSet,
    // ouseja, um conjunto de dados, ou mais abruptamente,a tabela do banco.
    // Usada com o comando “select”, pode receber parâmetros para uma pesquisa filtrada,
    // ou não, é essa a função dos “...” depois de Object, eles indicam que se trata de
    // um parâmetro variável, ou seja, posso passar, um, dois, três, mil, ou nenhum.
    // Ele parâmetro é tratado como um vetor, um conjunto de dados.
    //  por isso usamos o for para passear pelo vetor, e setarmos as posições dos parâmetros.
    // Como veremos mais a frente, onde forem colocados parâmetros nas SQL,
    // podemos simplesmente colocar um “?”, e depois passarmos o objeto cujo valor
    // representa o parâmetro. Por exemplo:
    // “select * from alunos where código=?”
    // a passamos o paramtero aluno.codigo, para recebermos uma tabela que contem o aluno
    // cujo código pe igual ao passado.
    // outro exemplo, usando o executeCommand, que faz a mesma coisa que o executeQuery,
    // mas não retorna nenhuma tabela de dados.
    // executeCommand(“insert into aluno (nome,telefone) values (?,?)”, aluno.nome,aluno.telefone) ;
    //  repare que a ordem dos parâmetros DEVE ser a MESMA	qua a ordem das suas “?” (posições)
    public ResultSet executeQuery(String query, Object ... params) throws SQLException{
        PreparedStatement ps = getStatement(query);
        for(int i = 0; i< params.length; i++)
            ps.setObject(i+1, params[i]);
        return ps.executeQuery();
    }

    public int executeCommand(String query, Object... params) throws SQLException{
        PreparedStatement ps = getStatement(query);
        for(int i = 0; i< params.length; i++)
            ps.setObject(i+1, params[i]);
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }

}
