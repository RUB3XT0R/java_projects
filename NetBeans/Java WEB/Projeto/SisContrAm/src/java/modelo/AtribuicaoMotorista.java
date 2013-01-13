
package modelo;

import java.sql.Date;

public class AtribuicaoMotorista {

    private int id;
    private Date inicio;
    private Date fim;

    private Funcionario funcionario;

    private Ambulancia ambulancia;

    public AtribuicaoMotorista() {
    }

    public AtribuicaoMotorista(int id) {
        this.id = id;
    }

    public AtribuicaoMotorista(Date inicio, Date fim, Funcionario funcionario, Ambulancia ambulancia) {
        this.inicio = inicio;
        this.fim = fim;
        this.funcionario = funcionario;
        this.ambulancia = ambulancia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ambulancia getAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(Ambulancia ambulancia) {
        this.ambulancia = ambulancia;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AtribuicaoMotorista other = (AtribuicaoMotorista) obj;
        if (this.inicio != other.inicio && (this.inicio == null || !this.inicio.equals(other.inicio))) {
            return false;
        }
        if (this.fim != other.fim && (this.fim == null || !this.fim.equals(other.fim))) {
            return false;
        }
        if (this.funcionario != other.funcionario && (this.funcionario == null || !this.funcionario.equals(other.funcionario))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.inicio != null ? this.inicio.hashCode() : 0);
        hash = 71 * hash + (this.fim != null ? this.fim.hashCode() : 0);
        hash = 71 * hash + (this.funcionario != null ? this.funcionario.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "de " + inicio + " até " + fim + ", funcionario=" + funcionario;
    }

   


}
