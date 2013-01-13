

package modelo;

public class Destaque {
    private int id;
    private String titulo;
    private String link;
    private String imagem;
    private int ativo;

    public Destaque() {
    }

    public Destaque(int id) {
        this.id = id;
    }

    public Destaque(int id, String titulo, String link, String imagem, int ativo) {
        this.id = id;
        this.titulo = titulo;
        this.link = link;
        this.imagem = imagem;
        this.ativo = ativo;
    }

    public Destaque(String titulo, String link, String imagem, int ativo) {
        this.titulo = titulo;
        this.link = link;
        this.imagem = imagem;
        this.ativo = ativo;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
}
