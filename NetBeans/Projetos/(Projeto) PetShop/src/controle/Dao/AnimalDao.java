
package controle.Dao;

import controle.tipos.AnimalTipo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.Animal;

public class AnimalDao extends Dao{

    public int addAnimal(Animal an) throws SQLException{
        an.setId(getNextId("animais"));
        executeCommand(
                "insert into animais(id,id_dono,nome,tipo,raca,idade) values (?,?,?,?,?,?)",
                an.getId(), an.getDono().getId() , an.getNome(), an.getTipo().toString(),an.getRaca(), an.getIdade()
        );
        return an.getId();
    }

    public void removeAnimal(int id) throws SQLException{
        executeCommand("delete from animais where id=?",id);
    }

    public void updateAnimal(Animal an) throws SQLException{
        executeCommand(
                "update animais set id_dono=?, nome=?, tipo=?, raca=?, idade=? where id=?",
                an.getDono().getId() , an.getNome(), an.getTipo().toString(),an.getRaca(), an.getIdade(), an.getId()
        );
    }

    public Animal getAnimal(int id) throws SQLException{
        ResultSet rs = executeQuery("select * from animais where id=?",id);
        Animal an = (rs.next())? populateAnimal(rs): null;
        rs.close();
        return an;
    }

    public List<Animal>  getAllAnimal() throws SQLException{
        List<Animal> toreturn = new LinkedList<Animal>();
        ResultSet rs= executeQuery("select * from animais");
        while(rs.next())
            toreturn.add(populateAnimal(rs));
        rs.close();
        return toreturn;
    }
    public static Animal populateAnimal(ResultSet rs) throws SQLException {
        ClienteDao dono = new ClienteDao();
        Animal toreturn = new Animal();
        toreturn.setId(rs.getInt("id"));
        toreturn.setDono(dono.getCliente(rs.getInt("id_dono")));
        toreturn.setNome(rs.getString("nome"));
        toreturn.setTipo(AnimalTipo.valueOf(rs.getString("tipo")));
        toreturn.setRaca(rs.getString("raca"));
        toreturn.setIdade(rs.getInt("idade"));
        return toreturn;
    }

    public List<Animal> getAllAnimaisbyNome(String nome) throws SQLException{
        List<Animal> toreturn = new LinkedList<Animal>();
        ResultSet rs= executeQuery("select * from animais where nome like ?","%"+nome+"%");
        while(rs.next())
            toreturn.add(populateAnimal(rs));
        rs.close();
        return toreturn;
    }

}
