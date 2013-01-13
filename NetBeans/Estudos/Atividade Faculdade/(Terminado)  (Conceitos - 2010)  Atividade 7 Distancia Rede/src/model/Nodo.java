package model;

public class Nodo {
    private int x;
    private int y;
    public Nodo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {return x;}
    public void setX(int x) {this.x=x;}
    public int getY() {return y;}
    public void setY(int y) {this.y=y;}
    public double DistOrigem() {return getDistancia(new Nodo(0, 0));}
    public double getDistancia(Nodo n) {
        return Math.sqrt(
                Math.pow(n.getX()-x, 2) +
                Math.pow(n.getY()-y, 2));
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
    public boolean equals(Nodo n){
        return (x == n.getX() && y == n.getY());
    }
}
