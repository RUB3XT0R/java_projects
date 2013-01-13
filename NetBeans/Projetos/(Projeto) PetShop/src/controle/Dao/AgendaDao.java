

package controle.Dao;

import controle.tipos.AgendaTipo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.Agenda;


public class AgendaDao extends Dao{

    public AgendaDao(){}


    public int addAgenda(Agenda agen) throws SQLException{
        agen.setId(getNextId("agenda"));
        executeCommand(
                "insert into agenda (id,id_animal,data,tipo,total) values(?,?,?,?,?)",
                agen.getId(),agen.getAnimal().getId(),agen.getDate(),agen.getTipo().toString(),agen.getTotal()
        );
        return agen.getId();
    }

    public void removeAgenda(int id) throws SQLException{
        executeCommand("delete from agenda where id=?",id);
    }

    public void updateAgenda(Agenda agen) throws SQLException{
        executeCommand(
                "update agenda set id_animal=?,data=?,tipo=?,total=? where id=?",
                agen.getAnimal().getId(),agen.getDate(),agen.getTipo().toString(),agen.getTotal(),agen.getId()
        );
    }

    public Agenda getAgenda(int id) throws SQLException{
        ResultSet rs= executeQuery("select * from agenda where id=?",id);
        Agenda agen = (rs.next())? populateAgenda(rs) : null;
        rs.close();
        return agen;
    }

    public static Agenda populateAgenda(ResultSet rs) throws SQLException{
        AnimalDao animal = new AnimalDao();
        Agenda toreturn = new Agenda();
        toreturn.setId((rs.getInt("id")));
        toreturn.setDate(rs.getDate("data"));
        toreturn.setTotal(rs.getFloat("total"));
        toreturn.setTipo(AgendaTipo.valueOf(rs.getString("tipo")));
        toreturn.setAnimal(animal.getAnimal(rs.getInt("id_animal")));
        return toreturn;
    }

    public List<Agenda> getAgendas() throws SQLException{
        List<Agenda> toreturn = new LinkedList<Agenda>();
        ResultSet rs = executeQuery("select * from agenda order by data");
        while(rs.next())
            toreturn.add(populateAgenda(rs));
        rs.close();
        return toreturn;
    }

    

}
