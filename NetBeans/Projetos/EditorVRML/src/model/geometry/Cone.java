
package model.geometry;

import java.io.Serializable;

public class Cone implements Geometry,Serializable {
   
   private Float bottomRadius, height;
   private boolean side, bottom;

   public boolean isBottom() {
      return bottom;
   }

   public void setBottom(boolean bottom) {
      this.bottom = bottom;
   }

   public Float getBottomRadius() {
      return bottomRadius;
   }

   public void setBottomRadius(Float bottomRadius) {
      this.bottomRadius = bottomRadius;
   }

   public Float getHeight() {
      return height;
   }

   public void setHeight(Float height) {
      this.height = height;
   }

   public boolean isSide() {
      return side;
   }

   public void setSide(boolean side) {
      this.side = side;
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
