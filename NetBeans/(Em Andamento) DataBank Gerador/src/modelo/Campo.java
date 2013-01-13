
package modelo;

public class Campo {

    private String  nome;
    private String  tipo;
    private String  padrao;
    private boolean nulo;
    private int tamanho;
    //somente pata tipos inteiros
    private boolean autoIncremento;

    public Campo() {
    }

     public boolean getAutoIncremento() {
        return autoIncremento;
    }

    public void setAutoIncremento(boolean autoIncremento) {
        this.autoIncremento = autoIncremento;
    }

     public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isNulo() {
        return nulo;
    }

    public void setNulo(boolean nulo) {
        this.nulo = nulo;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Campo other = (Campo) obj;
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return nome;
    }

    public boolean isVarcharOrChar(){
        return (tipo.equalsIgnoreCase("VARCHAR") || tipo.equalsIgnoreCase("CHAR"))? true : false;
    }
}
