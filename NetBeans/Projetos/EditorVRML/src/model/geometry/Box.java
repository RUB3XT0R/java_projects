

package model.geometry;

import java.io.Serializable;


public class Box implements Geometry,Serializable{
   
   private Float sizeX, sizeY, sizeZ;

   public Float getSizeX() {
      return sizeX;
   }

   public void setSizeX(Float sizeX) {
      this.sizeX = sizeX;
   }

   public Float getSizeY() {
      return sizeY;
   }

   public void setSizeY(Float sizeY) {
      this.sizeY = sizeY;
   }

   public Float getSizeZ() {
      return sizeZ;
   }

   public void setSizeZ(Float sizeZ) {
      this.sizeZ = sizeZ;
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
