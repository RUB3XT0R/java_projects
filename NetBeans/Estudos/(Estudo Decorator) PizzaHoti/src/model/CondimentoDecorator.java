
package model;

public abstract class CondimentoDecorator implements ProdutoAlimenticio {
	public abstract String getDescricaoDoComplemento();
	public String getDescricao() {
		return " " + getDescricaoDoComplemento();
	}
}
