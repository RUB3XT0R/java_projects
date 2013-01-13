
package modelo;

public class Aluno {
    private Cliente aluno;
    private Calendario curso;
    private float valorPraticado;
    private TipoPagamento tipo;

    public Cliente getAluno() {
        return aluno;
    }

    public void setAluno(Cliente aluno) {
        this.aluno = aluno;
    }

    public Calendario getCurso() {
        return curso;
    }

    public void setCurso(Calendario curso) {
        this.curso = curso;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoPagamento tipo) {
        this.tipo = tipo;
    }

    public float getValorPraticado() {
        return valorPraticado;
    }

    public void setValorPraticado(float valorPraticado) {
        this.valorPraticado = valorPraticado;
    }
    
}
