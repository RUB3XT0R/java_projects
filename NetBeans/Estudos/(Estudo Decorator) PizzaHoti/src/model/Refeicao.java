
package model;

import java.util.LinkedList;
import java.util.List;

public abstract class Refeicao implements ProdutoAlimenticio {

    private String descricao;
    private double custo;

    protected abstract double getPrecoDaRefeicao();
    private List<ProdutoAlimenticio> condimentos;

    // Construtor da classe com String como parâmetro
    protected Refeicao(String descricao) {
        this.descricao = descricao;
        this.custo = getPrecoDaRefeicao();
        condimentos = new LinkedList<ProdutoAlimenticio>();
    }

    public double getCusto() {
        return custo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCondimentos() {
        String str = "";
        for (ProdutoAlimenticio s : condimentos) {
            str += s.getDescricao();
        }
        return str;

    }

    public List<ProdutoAlimenticio> getCondimentosLista() {
        return condimentos;
    }

    public void add(ProdutoAlimenticio complemento) {
        custo += complemento.getCusto();
        condimentos.add(complemento);
    }

    public void remove(ProdutoAlimenticio complemento) {
        if (!condimentos.contains(complemento)) {
            return;
        }
        custo -= complemento.getCusto();
        condimentos.remove(complemento);
    }
}
