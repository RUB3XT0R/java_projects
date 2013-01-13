
package model.geometry;

public interface Geometry{
   
   public void draw();
   public String gerarVRML();
   public void rotate(int x, int y);
   public void scale(int x, int y);
   public void translate(int x, int y);
   
}
