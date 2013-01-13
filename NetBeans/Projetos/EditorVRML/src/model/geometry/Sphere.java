
package model.geometry;

import java.io.Serializable;


public class Sphere implements Geometry,Serializable {
   
   private Float radius;

   public Float getRadius() {
      return radius;
   }

   public void setRadius(Float radius) {
      this.radius = radius;
   }
  
   @Override
   public void draw() {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public String gerarVRML() {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public void rotate(int x, int y) {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public void scale(int x, int y) {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public void translate(int x, int y) {
      throw new UnsupportedOperationException("Not supported yet.");
   }
   
}
