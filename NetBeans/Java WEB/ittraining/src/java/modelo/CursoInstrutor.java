
package modelo;

class CursoInstrutor {
    private Instrutor professor;
    private Curso curso;
    private Boolean unidadeABC;
    private Boolean unidadeUP;
    private String periodo;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Instrutor getProfessor() {
        return professor;
    }

    public void setProfessor(Instrutor professor) {
        this.professor = professor;
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
