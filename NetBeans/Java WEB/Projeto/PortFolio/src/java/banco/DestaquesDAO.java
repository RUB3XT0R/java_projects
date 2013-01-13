/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Destaque;

/**
 *
 * @author Lucas Biason
 */
public class DestaquesDAO extends Dao {

    public LinkedList<Destaque> getDestaques() {
        ResultSet rs;
        try {
            rs = executeQuery("select * from destaques");
            LinkedList<Destaque> destaques = new LinkedList<Destaque>();
            while (rs.next()) {
                destaques.add(new Destaque(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("link"),
                        rs.getString("imagem"),
                        rs.getInt("ativo")));

            }
            rs.close();
            return destaques;
        } catch (SQLException ex) {
            return new LinkedList<Destaque>();
        }

    }

    public void inserir(Destaque d){
        try {
            executeCommand("insert into destaques(titulo,link,imagem) values(?,?,?)", d.getTitulo(), d.getLink(), d.getImagem());
        } catch (SQLException ex) {
            Logger.getLogger(DestaquesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
