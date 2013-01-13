

package modelo;

public class Aluno {

    private String ra;
    private String nome;
    private String cpf;
    private String email;
    private int ano;
    private String curso;
    private String modalidade;

    public Aluno() {
    }

    public Aluno(String ra) {
        this.ra = ra;
    }

    public Aluno(String ra, String nome, String cpf, String email, int ano, String curso, String modalidade) {
        this.ra = ra;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.ano = ano;
        this.curso = curso;
        this.modalidade = modalidade;
    }



    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if ((this.ra == null) ? (other.ra != null) : !this.ra.equals(other.ra)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.ra != null ? this.ra.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + "nome=" + nome + "cpf=" + cpf + "email=" + email + "ano=" + ano + "curso=" + curso + "modalidade=" + modalidade + '}';
    }

    
}
