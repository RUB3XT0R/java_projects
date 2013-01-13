
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import modelo.*;

public class InstrutorDao extends Dao{
    
    public boolean addInstrutor(Instrutor c, boolean addComCursos) {
        try {
            executeCommand(
                    "INSERT INTO instrutor set nome=?, rg=?, cpf=?,"
                    + "email=?, email2=?, telefone=?, telefone2=?, "
                    + "carro_modelo=?, carro_placa=?, carro_cor=?, carro_marca=?",
                    c.getNome(),c.getRg(),c.getCpf(),c.getEmail(),c.getEmail2(),c.getTelefone(),c.getTelefone2(),
                    c.getCarro_modelo(),c.getCarro_placa(),c.getCarro_cor(),c.getCarro_marca());
            int idInst = getIDFromLastInsert("instrutor");
            if(addComCursos)
                for(CursoInstrutor ci : c.getCursosQueLeciona()) addCursoInstrutor(ci,idInst);
            return true;
        } catch (SQLException ex){
            return false;
        }
    }
    public void addCursoInstrutor(CursoInstrutor ci, int idInst) throws SQLException{
           executeCommand("insert into cursoinstrutor set "
                   + "idCurso=?, idInstrutor=?, unidadeAbc=?, unidadeUP=?, periodo=?",
                   ci.getCurso().getId(),idInst, ci.getUnidadeABC(), ci.getUnidadeUP(), ci.getPeriodo());
    }
    public boolean upInstrutor(Instrutor c, boolean upComCursos) {
        try {
            executeCommand(
                    "update instrutor set "
                    + "nome=?, rg=?, cpf=?,"
                    + "email=?, email2=?, telefone=?, telefone2=?,"
                    + "carro_modelo=?, carro_placa=?, carro_cor=?,"
                    + "carro_marca=? where id=?",
                    c.getNome(),c.getRg(),c.getCpf(),c.getEmail(),c.getEmail2(),c.getTelefone(),c.getTelefone2(),
                    c.getCarro_modelo(),c.getCarro_placa(),c.getCarro_cor(),c.getCarro_marca(),c.getId());
            if(upComCursos)
                for(CursoInstrutor ci : c.getCursosQueLeciona()) addCursoInstrutor(ci,c.getId());
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    public void upCursoInstrutor(CursoInstrutor ci, int idInst) throws SQLException{
           executeCommand("update cursoinstrutor set "
                   + "idCurso=?, idInstrutor=?, unidadeAbc=?, unidadeUP=?, periodo=? where idCurso=? and idInstrutor=?",
                   ci.getCurso().getId(),idInst, ci.getUnidadeABC(), ci.getUnidadeUP(), ci.getPeriodo(), ci.getCurso().getId(),idInst);
    }
    public boolean delInstrutor(int id) {
        try {
            
            executeCommand("delete from cursoinstrutor where idInstrutor=?",id);
            executeCommand("delete from instrutor where id=?",id);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    public boolean delCursoInstrutor(int idCurso, int idInstrutor) {
        try {
            executeCommand("delete from cursoinstrutor where idInstrutor=? and idCurso=?",
                    idInstrutor,idCurso);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    public boolean contains(String nome) {
        try {
            return contain("instrutor","nome",nome);
        } catch (SQLException ex) {return true;}
    }
    public boolean contains(int idCurso) {
        try {
            return contain("instrutor","id",idCurso);
        } catch (SQLException ex) {return true;}
    }
    
    public Instrutor getInstrutor(int id) {
        try {
            ResultSet rs = executeQuery("select * from instrutor where id=?",id);
            Instrutor instrutor = rs.next()? populateInstrutor(rs, true) : null;
            rs.close();
            return instrutor;
        } catch (SQLException e) {return null;}
    }
    
    public List<Instrutor> getInstrutores() {
        try {
            ResultSet rs = executeQuery("SELECT * FROM instrutor order by nome");
            List<Instrutor> instrutor = new LinkedList<Instrutor>(); 
            while(rs.next()) instrutor.add(populateInstrutor(rs,true));
            rs.close();
            return instrutor;
        } catch (SQLException e) {
            return null;}
    }
    
    public List<Instrutor> getInstrutores(String nome) {
        try {
            ResultSet rs = executeQuery("SELECT * FROM instrutor where nome like ? order by nome","%"+nome+"%");
            List<Instrutor> instrutor = new LinkedList<Instrutor>(); 
            while(rs.next()) instrutor.add(populateInstrutor(rs,true));
            rs.close();
            return instrutor;
        } catch (SQLException e) {
            return new LinkedList<Instrutor>();}
    }
    
    public List<Instrutor> getInstrutoresByCurso(int idCurso) {
        try {
            ResultSet rs = executeQuery("select distinct id,nome,cpf,email,telefone,"
                    + "email2,telefone2,rg,carro_modelo,carro_placa,carro_cor, carro_marca "
                    + "from instrutor join cursoinstrutor on idInstrutor = id "
                    + "where idCurso=?",idCurso);
            List<Instrutor> instrutor = new LinkedList<Instrutor>(); 
            while(rs.next()) instrutor.add(populateInstrutor(rs,true));
            rs.close();
            return instrutor;
        } catch (SQLException e) {
            return new LinkedList<Instrutor>();}
    }
    
    public CursoInstrutor getCursoInstrutor(int idCurso, int idInstrutor){
        try {
            ResultSet rs = executeQuery("select * from cursoinstrutor where idCurso=? and idInstrutor=?",idCurso,idInstrutor);
            CursoInstrutor curIns = rs.next() ? populateCursoInstrutor(rs) : null;
            rs.close();
            return curIns;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public List<CursoInstrutor> getCursosInstrutor(Instrutor inst){
        try {
            ResultSet rs = executeQuery("select * from cursoinstrutor where idInstrutor=?",inst.getId());
            List<CursoInstrutor> toreturn = new LinkedList<CursoInstrutor>();
            while(rs.next()) toreturn.add(populateCursoInstrutor(rs,inst));
            rs.close();
            return toreturn;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public Instrutor populateInstrutor(ResultSet rs, boolean comCursos) throws SQLException{
        Instrutor instrutor = new Instrutor();
        instrutor.setId(rs.getInt("id"));
        instrutor.setNome(rs.getString("nome"));
        instrutor.setCpf(rs.getString("cpf"));
        instrutor.setEmail(rs.getString("email"));
        instrutor.setTelefone(rs.getString("telefone"));
        instrutor.setCarro_modelo(rs.getString("carro_modelo"));
        instrutor.setRg(rs.getString("rg"));
        instrutor.setTelefone2(rs.getString("telefone2"));
        instrutor.setEmail2(rs.getString("email2"));
        instrutor.setCarro_placa(rs.getString("carro_placa"));
        instrutor.setCarro_cor(rs.getString("carro_cor"));
        instrutor.setCarro_marca(rs.getString("carro_marca"));
        if(comCursos) instrutor.setCursosQueLeciona(getCursosInstrutor(instrutor));
        return instrutor;
    }
    
    public CursoInstrutor populateCursoInstrutor(ResultSet rs, Instrutor... instrutor) throws SQLException{
        CursoInstrutor curIns = new CursoInstrutor();
        curIns.setCurso( new CursoDao().getCurso(rs.getInt("idCurso")));
        curIns.setProfessor( (instrutor!=null && instrutor.length>0) ? instrutor[0] : getInstrutor(rs.getInt("idInstrutor")) );
        curIns.setUnidadeABC(rs.getBoolean("unidadeAbc"));
        curIns.setUnidadeUP(rs.getBoolean("unidadeUP"));
        curIns.setPeriodo(rs.getString("periodo"));
        return curIns;
    }
            
}
