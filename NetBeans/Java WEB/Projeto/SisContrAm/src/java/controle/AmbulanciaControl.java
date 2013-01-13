
package controle;

import dao.AmbulanciaDao;
import java.sql.SQLException;
import java.util.List;
import modelo.Ambulancia;
import modelo.AtribuicaoMotorista;

public class AmbulanciaControl {

    public AmbulanciaDao dao;

    public AmbulanciaControl() {
            dao = new AmbulanciaDao();
    }
    public void addAmbulancia(Ambulancia a) throws SQLException {
        dao.inserirAmbulancia(a);
    }
    public int addAtribuicaoMotorista(AtribuicaoMotorista a) throws SQLException {
        return dao.inserirAtribuicaoMotorista(a);
    }
    public void updateAtribuicaoMotorista(AtribuicaoMotorista a) throws SQLException {
        dao.updateAtribuicaoMotorista(a);
    }
    public void removeAmbulancia(int id) throws SQLException {
        dao.removeAmbulancia(id);
    }
    public void removeAtribuicaoMotorista(int id) throws SQLException {
        dao.removeAtribuicaoMotorista(id);
    }
    public  Ambulancia getAmbulancia(int id) throws SQLException{
        return dao.getAmbulancia(id);
    }
    public AtribuicaoMotorista getAtribuicaoMotorista(int id) throws SQLException{
        return dao.getAtribuicaoMotorista(id);
    }
    public List<Ambulancia> getAllAmbulancias() throws SQLException{
        return dao.getAllAmbulancias();
    }
    public List<AtribuicaoMotorista> getAllAtribuicaoMotoristas() throws SQLException{
        return dao.getAllAtribuicaoMotoristas();
    }
}
