
package model;

import java.io.Serializable;
import java.util.HashMap;


public class VRML implements Serializable{
   
   private HashMap<String,Shape> children;
   private String nome, autor, data;
   private String[] info;

   public boolean gravar(){return false;}
   public void resetar(){}
   public String gerarVRML(){return null;}
   
   public void addChild(Shape Child){
      //children.put(Child.getNome(),Child);
   }
   public void delChild(Shape Child){
      //children.remove(Child.getNome());
   }
   public void delChild(String nome){
      children.remove(nome);
   }
   public Shape getChild(String nome){
      return children.get(nome);
   }
   
   
   public String getAutor() {
      return autor;
   }

   public void setAutor(String autor) {
      this.autor = autor;
   }

   public HashMap<String, Shape> getChildren() {
      return children;
   }

   public void setChildren(HashMap<String, Shape> children) {
      this.children = children;
   }

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }

   public String[] getInfo() {
      return info;
   }

   public void setInfo(String[] info) {
      this.info = info;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   } 
   
   
}
