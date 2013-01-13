package modelo;

public class Livro {

    private String titulo;
    private String isbn;
    private String autor;
    private int numeroPaginas;
    private String edicao;
    private String editora;
    private String imagem;
    private double preco;

    public Livro(String titulo, String isbn, String autor, int numeroPaginas, String edicao, String editora, String imagem, double preco) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.edicao = edicao;
        this.editora = editora;
        this.imagem = imagem;
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
