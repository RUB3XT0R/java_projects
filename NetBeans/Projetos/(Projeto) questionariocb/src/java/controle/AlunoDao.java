
package controle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Aluno;

public class AlunoDao extends Dao {

    Aluno aluno;
    ResultSet rs;

    public Boolean login(String ra, String cpf) {
        try {
            rs = executeQuery("select * from ALUNOS where ra=? and cpf=?", ra, cpf);
            while (rs.next()) return true;
            return false;
        } catch (SQLException ex) {
            return false;
        }
    }
    public Aluno getAluno(String ra, String cpf){
        try {
            rs = executeQuery("select * from ALUNOS where ra=? and cpf=?",ra,cpf);
            while(rs.next()){
                aluno = new Aluno();
                aluno.setAno(rs.getInt("ano"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setCurso(rs.getString("curso"));
                aluno.setEmail(rs.getString("email"));
                aluno.setModalidade(rs.getString("modalidade"));
                aluno.setNome(rs.getString("nome"));
                aluno.setRa(rs.getString("ra"));
            }
            return aluno;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String insertEngenharia(Aluno aluno){
        try {
            executeCommand("update ALUNOS set email=?, modalidade=? where ra=?", aluno.getEmail(), aluno.getModalidade(), aluno.getRa());
            return "sucesso";
        } catch (SQLException ex) {
            return "falhou";
        }

    }
}
