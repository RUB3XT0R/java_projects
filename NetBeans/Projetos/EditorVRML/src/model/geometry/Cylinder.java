
package model.geometry;

import java.io.Serializable;


public class Cylinder implements Geometry,Serializable{
   
   private Float height, radius;
   private boolean side, top, bottom;

   public boolean isBottom() {
      return bottom;
   }

   public void setBottom(boolean bottom) {
      this.bottom = bottom;
   }

   public Float getHeight() {
      return height;
   }

   public void setHeight(Float height) {
      this.height = height;
   }

   public Float getRadius() {
      return radius;
   }

   public void setRadius(Float radius) {
      this.radius = radius;
   }

   public boolean isSide() {
      return side;
   }

   public void setSide(boolean side) {
      this.side = side;
   }

   public boolean isTop() {
      return top;
   }

   public void setTop(boolean top) {
      this.top = top;
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
