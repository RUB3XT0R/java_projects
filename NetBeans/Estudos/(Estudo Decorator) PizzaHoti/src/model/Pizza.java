
package model;

public class Pizza extends Refeicao {
    //Construtor atribui a descrição

    public Pizza(String descricao) {
        super(descricao);
    }

    public double getPrecoDaRefeicao() {
        return 10;
    }
}
