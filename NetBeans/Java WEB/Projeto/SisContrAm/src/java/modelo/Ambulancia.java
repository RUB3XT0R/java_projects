
package modelo;

import java.util.List;

public class Ambulancia{

    private int numero;
    private String placa;

    private List<AtribuicaoMotorista> motoristas;

    public Ambulancia() {
    }

    public Ambulancia(int numero, String placa, List<AtribuicaoMotorista> motoristas) {
        this.numero = numero;
        this.placa = placa;
        this.motoristas = motoristas;
    }

    public List<AtribuicaoMotorista> getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(List<AtribuicaoMotorista> motoristas) {
        this.motoristas = motoristas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ambulancia other = (Ambulancia) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if ((this.placa == null) ? (other.placa != null) : !this.placa.equals(other.placa)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numero;
        hash = 97 * hash + (this.placa != null ? this.placa.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Ambulância " + numero + ", placa: " + placa;
    }


}
