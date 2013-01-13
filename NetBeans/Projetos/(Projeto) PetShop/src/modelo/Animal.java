
package modelo;

import controle.tipos.AnimalTipo;
import controle.SwingColumn;

public class Animal {

    private Integer id;
    @SwingColumn(description="Nome")
    private String nome;
    @SwingColumn(description="Raça")
    private String raca;
    @SwingColumn(description="Idade")
    private int idade;
    @SwingColumn(description="Dono")
    private Cliente dono;
    @SwingColumn(description="Tipo")
    private AnimalTipo tipo;

    public Animal() {
    }

    public Animal(Integer id) {
        this.id = id;
    }

    public Animal(Integer id, String nome, String raca, int idade, Cliente dono, AnimalTipo tipo) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.dono = dono;
        this.tipo = tipo;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public AnimalTipo getTipo() {
        return tipo;
    }

    public void setTipo(AnimalTipo tipo) {
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
        final Animal other = (Animal) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return nome;
    }


}
