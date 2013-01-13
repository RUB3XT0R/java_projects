package modelos;

import java.util.LinkedList;
import java.util.List;

public class Categoria {

    private int codigo;
    private String nome;
    private List<Artigo> artigos = new LinkedList<Artigo>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(List<Artigo> artigos) {
        this.artigos = artigos;
    }

}
