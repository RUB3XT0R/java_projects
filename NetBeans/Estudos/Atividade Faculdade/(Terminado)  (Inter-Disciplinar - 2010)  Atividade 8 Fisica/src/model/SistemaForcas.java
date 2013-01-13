package model;

import java.util.LinkedList;

public class SistemaForcas {

    private LinkedList<Forca> f1;
    private LinkedList<Forca> f2;
    private LinkedList<Forca> f3;
    private LinkedList<Forca> ft;

    public SistemaForcas() {
        f1 = new LinkedList<Forca>();
        f2 = new LinkedList<Forca>();
        f3 = new LinkedList<Forca>();
        ft = new LinkedList<Forca>();
    }

    public void fill(double a, double inicio, double fim, double Q, double q, double escala) {
        clear();
        for (double i = inicio; i <= fim; i = i + escala) {
            f1.add(new Forca(i, (9 * Math.pow(10, 9) * q * Q * Math.cos(360 - a) * (180 / Math.PI) / (a * a / 4 + i * i)), (9 * Math.pow(10, 9) * q * Q * Math.sin(360 - a) * (180 / Math.PI) / (a * a / 4 + i * i))));
            f2.add(new Forca(i, (-9 * Math.pow(10, 9) * q * Q / Math.pow(a * Math.sqrt(3) / 2 + i, 2)), 0));
            f3.add(new Forca(i, (9 * Math.pow(10, 9) * q * Q * Math.cos(a) * (180 / Math.PI) / (a * a / 4 + i * i)), (9 * Math.pow(10, 9) * q * Q * Math.sin(a) * (180 / Math.PI) / (a * a / 4 + i * i))));
            ft.add(new Forca(i, ((9 * Math.pow(10, 9) * q * Q) * ((Math.cos(a) * (180 / Math.PI) + Math.cos(360 - a) * (180 / Math.PI)) / (a * a / 4 + i * i) - 1 / Math.pow(a * Math.sqrt(3) / 2 + i, 2))), 0));
        }
    }

    public void clear(){
        f1.clear();
        f2.clear();
        f3.clear();
        ft.clear();
    };

    public LinkedList<Forca> getF1() {
        return f1;
    }

    public LinkedList<Forca> getF2() {
        return f2;
    }

    public LinkedList<Forca> getF3() {
        return f3;
    }

    public LinkedList<Forca> getFt() {
        return ft;
    }

    public Forca buscarForca(double s, LinkedList<Forca> f) {
        for (Forca aux : f) {
            if (aux.getName() == s) {
                return aux;
            }
        }
        return null;
    }
}
