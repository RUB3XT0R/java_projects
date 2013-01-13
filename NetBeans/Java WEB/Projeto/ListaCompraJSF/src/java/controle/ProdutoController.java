
package controle;

import dao.ProdutoDao;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;
import modelo.Produto;

@Named
@SessionScoped
public class ProdutoController implements Serializable{
    
    private ProdutoDao dao = new ProdutoDao(); //uma dao
    private Produto produto = new Produto(); //um objeto da entidade
    private DataModel<Produto> clientes; //coleção

    //manipulação jsf
    
    public void novo() {
        produto = new Produto();
    }
    public String inserir() {
        return (dao.addProduto(produto)) ? "produtos" : "falhou";
    }
    public void selecionar() {
        produto = clientes.getRowData();
    }
    public String alterar() {
        return (dao.addProduto(produto))? "produtos" : "falhou";
    }
    public String remover() {
        return (dao.delProduto(produto.getCodigo()))? "produtos" : "falhou";
    } 
    
    //getters and setters
    
    public DataModel<Produto> getProdutos() {
        List<Produto> plista = dao.getProdutos();
        clientes = new ListDataModel<Produto>(plista);
        return clientes;
    }

    public void setProdutos(DataModel<Produto> clientes) {
        this.clientes = clientes;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }  
    
}
