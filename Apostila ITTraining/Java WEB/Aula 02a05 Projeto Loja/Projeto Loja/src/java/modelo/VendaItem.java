
package modelo;

public class VendaItem {
   
   private Venda venda;
   private Produto produto;
   private int qtde;

   public Produto getProduto() {
      return produto;
   }

   public void setProduto(Produto produto) {
      this.produto = produto;
   }

   public int getQtde() {
      return qtde;
   }

   public void setQtde(int qtde) {
      this.qtde = qtde;
   }

   public Venda getVenda() {
      return venda;
   }

   public void setVenda(Venda venda) {
      this.venda = venda;
   }

   
   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      final VendaItem other = (VendaItem) obj;
      if (this.venda != other.venda && (this.venda == null || !this.venda.equals(other.venda))) {
         return false;
      }
      if (this.produto != other.produto && (this.produto == null || !this.produto.equals(other.produto))) {
         return false;
      }
      return true;
   }

   @Override
   public int hashCode() {
      int hash = 5;
      hash = 79 * hash + (this.venda != null ? this.venda.hashCode() : 0);
      hash = 79 * hash + (this.produto != null ? this.produto.hashCode() : 0);
      return hash;
   }

   @Override
   public String toString() {
      return "VendaItem{" + "venda=" + venda + ", produto=" + produto + ", qtde=" + qtde + '}';
   }

   
   
   
}
