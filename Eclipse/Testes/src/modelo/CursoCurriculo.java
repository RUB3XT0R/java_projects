
package modelo;

class CursoCurriculo {
    private Curso curso;
    private Curriculo curriculo;
    private Boolean unidadeABC;
    private Boolean unidadeUP;
    private String periodo;

    public Curriculo getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(Curriculo curriculo) {
        this.curriculo = curriculo;
    }

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

