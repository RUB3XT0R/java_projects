
package modelo;


public class Livro {
   
   private String titulo;
   private String Assunto;
   private float preco;
   
   //getters and setters

   public Livro(String titulo, String Assunto, float preco) {
      this.titulo = titulo;
      this.Assunto = Assunto;
      this.preco = preco;
   }

   public Livro() {
   }
   
   public String getAssunto() {
      return Assunto;
   }

   public void setAssunto(String Assunto) {
      this.Assunto = Assunto;
   }

   public float getPreco() {
      return preco;
   }

   public void setPreco(float preco) {
      this.preco = preco;
   }

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }
   
   
}
