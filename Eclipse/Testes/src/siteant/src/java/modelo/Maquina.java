
package modelo;

import java.io.Serializable;
import javax.persistence.*;

@Entity(name = "maquinas")
public class Maquina implements Serializable {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(name = "id")
   private Integer id;
   @Column(name = "nome")
   private String nome;
   @Column(name = "IP")
   private String ip;
   @Column(name = "Status")
   private String status;
   @Column(name = "Internet")
   private Boolean internet;
   @Column(name = "Descricao")
   private String descricao;
   @Column(name = "Unidade")
   private String unidade;
   @Column(name = "sala")
   private Integer sala;

   public Maquina() {
   }

   public Maquina(Integer id) {
      this.id = id;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getIp() {
      return ip;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public Boolean getInternet() {
      return internet;
   }

   public void setInternet(Boolean internet) {
      this.internet = internet;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public String getUnidade() {
      return unidade;
   }

   public void setUnidade(String unidade) {
      this.unidade = unidade;
   }

   public Integer getSala() {
      return sala;
   }

   public void setSala(Integer sala) {
      this.sala = sala;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (id != null ? id.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof Maquina)) {
         return false;
      }
      Maquina other = (Maquina) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "modelo.Maquinas[ id=" + id + " ]";
   }
   
}
