

package modelos;

import java.sql.Date;

public class Artigo {
    private int codigo;
    private String titulo;
    private String resumo;
    private java.sql.Date dataHora;
    private Categoria categoria;
    private String autor;
    private String conteudo;

    public Artigo() {
        java.util.Date data = new java.util.Date();
         this.dataHora= new java.sql.Date(data.getTime());
    }

    public Artigo(int codigo) {
        this.codigo = codigo;
    }

    public Artigo(int codigo, String titulo, String resumo, Date dataHora, Categoria categoria, String autor, String conteudo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.resumo = resumo;
        this.dataHora = dataHora;
        this.categoria = categoria;
        this.autor = autor;
        this.conteudo = conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo + ", por :"+ autor;
    }




}
