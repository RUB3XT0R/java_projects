package Modelo;
import java.text.DecimalFormat;

public class Produto {
    private int qtd;
    private String descricao;
    private double total;

    public Produto(int qtd, String desc,double preco){
        this.qtd=qtd;
        this.descricao=desc;
        this.total=preco;
    }

    public Produto(){}

    //calcula a quantidade do produto.
    public double getQTDE()
        {return total;}

    //retorna a descrição completa do produto
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "("+qtd+") -"+descricao+" : R$ "+df.format(total);
    }//fim do toString
    
}