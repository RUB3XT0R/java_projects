


import java.util.LinkedList;
import java.util.List;

public class Interessado {
    private int id;
    private String nome;
    private String telComercial;
    private String telResidencial;
    private String celular;
    private String email;
    private Boolean unidadeABC;
    private Boolean unidadeUP;
    
    private List<Curso> cursosInterresados = new LinkedList<Curso>();
    
    public String getBodyText(String mensagem) {
        String bodyText = "<html><head>"
                + "<meta http-equiv='Content-Type' content='text/html; charset=utf-8'/>"
                + "<body>"
                + "<b><font face=futura size=15 color=#cc0000>Ittraining</font></b>"
                + "<br><br><b>Dados do Interessado:</b><br><br>"
                + "<b>Nome:</b> " + nome + "<br/>"
                + "<b>Tel. Comercial:</b> " + telComercial + "<br/>"
                + "<b>Tel. Residencial:</b> " + telResidencial + "<br/>"
                + "<b>Celular:</b> " + celular + "<br/>"
                + "<b>E-mail:</b> " + email + "<br/>"
                + "<b>Unidade:</b> " + (unidadeABC? "ABC " : "") + (unidadeUP? "UP " : "") + "<br/>"
                + "<b>Mensagem:</b> " + mensagem + "<br/>"
                + "<br><br><b>Interesse nos cursos:</b><br><br>";
        
        //for (Curso atual : cursosInterresados) {
          //  bodyText += atual.getNome();
        //}
        bodyText += "</body></html>";
        return bodyText;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<Curso> getCursosInterresados() {
        return cursosInterresados;
    }

    public void setCursosInterresados(List<Curso> cursosInterresados) {
        this.cursosInterresados = cursosInterresados;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelComercial() {
        return telComercial;
    }

    public void setTelComercial(String telComercial) {
        this.telComercial = telComercial;
    }

    public String getTelResidencial() {
        return telResidencial;
    }

    public void setTelResidencial(String telResidencial) {
        this.telResidencial = telResidencial;
    }

    public Boolean getUnidadeABC() {
        return unidadeABC;
    }

    public void setUnidadeABC(Boolean unidadeABC) {
        this.unidadeABC = unidadeABC;
    }

    public Boolean getUnidadeUP() {
        return unidadeUP;
    }

    public void setUnidadeUP(Boolean unidadeUP) {
        this.unidadeUP = unidadeUP;
    }
    
    
    
    
}
