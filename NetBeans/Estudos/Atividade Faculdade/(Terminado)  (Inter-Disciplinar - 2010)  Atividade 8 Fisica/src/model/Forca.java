
package model;

public class Forca{

        private double name;
        private double x;
        private double y;
        private double angle;
        private double module;

        public Forca(double name,double x, double y) {
            this.name = name;
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getModule() {
            return Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
        }

        public double getAngle() {
            return (Math.atan(y / x)) * (180 / Math.PI);
        }

        public double getName() {
            return name;
        }

    @Override
        public String toString() {
            return "F(" + name + ")= (" + x + " i," + y + " j)";
        }

    }