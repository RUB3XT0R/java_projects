package agenda.dao;

import agenda.connector.CriarConexao;
import agenda.model.Contato;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContatoDao {

    private Connection conexao;

    public ContatoDao() throws SQLException {
        this.conexao = CriarConexao.getConexao();
    }

    public void add(Contato cl) throws SQLException {
        //prepara a conexao
        String sql = "insert into contato (nome, endereco, telefone, email, sexo) values(?,?,?,?,?)";
        PreparedStatement str = conexao.prepareStatement(sql);
        //set os valores
        str.setString(1, cl.getNome());
        str.setString(2, cl.getEndereco());
        str.setString(3, cl.getTelefone());
        str.setString(4, cl.getEmail());
        str.setString(5, cl.getSexo());

        //executa o codigo sql
        str.execute();
        str.close();
    }

    public List<Contato> getLista(String s) throws SQLException{
        String sql = "select * from contato where nome like ?";
        PreparedStatement str = this.conexao.prepareStatement(sql);
        str.setString(1,s);
        ResultSet rs = str.executeQuery();
        List<Contato> ml = new ArrayList<Contato>();
        while (rs.next()) {
            Contato c = new Contato();
            c.setId(rs.getLong("id"));
            c.setNome(rs.getString("nome"));
            c.setEndereco(rs.getString("endereco"));
            c.setEmail(rs.getString("email"));
            c.setSexo(rs.getString("sexo"));
            c.setTelefone(rs.getString("telefone"));
            ml.add(c);
        }
        rs.close();
        str.close();
        return ml;
    }
    
    public void altera(Contato cl) throws SQLException{
        String sql = "update contato set nome=?, endereco=?, telefone=?, email=?, sexo=? where id=?";
        PreparedStatement str = this.conexao.prepareStatement(sql);
        str.setString(1, cl.getNome());
        str.setString(2, cl.getEndereco());
        str.setString(3, cl.getTelefone());
        str.setString(4, cl.getEmail());
        str.setString(5, cl.getSexo());
        str.setLong(6,cl.getId());

        str.execute();
        str.close();
    }

    public  void remove(Contato cl) throws SQLException{
        String sql ="delete from contato where id=?";
        PreparedStatement str = this.conexao.prepareStatement(sql);
        str.setLong(1,cl.getId());
        str.execute();
        str.close();
    }
}
