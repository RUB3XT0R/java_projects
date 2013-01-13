
package modelo;

import visao.Exe11;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import visao.*;


public class Algoritmos {
    public Algoritmos(){}

    public void exe01(){
        Exe01 a=new Exe01();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public double calculaExe01(float x1, float x2, float y1, float y2){
            double dist=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
            return dist;
    }

    public void exe02(){
        Exe02 a=new Exe02();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public double calculaExe02(float a, float b, float c){
            double r =Math.pow(a+b,2);
            double s =Math.pow(b+c,2);
            return (r+s)/2;
    }

    public void exe03(){
        Exe03 a=new Exe03();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public int  calculaExe03(int anos, int meses, int dias){
        return anos*365+meses*30+dias;
    }

    public void exe04(){
        Exe04 a=new Exe04();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public int[] calculaExe04(int dia){
            int []t= {
                 dia/365,
                 (dia%365)/30,
                 (dia%365)%30
            };
            return t;
    }

    public void exe05(){
        Exe05 a=new Exe05();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public double calculaExe05(float nota1, float nota2, float nota3){
        return ((nota1*2)+(nota2*3)+(nota3*5))/10;
    }

    public void exe06(){
        Exe06 a=new Exe06();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public int[] calculaExe06(int tempo){
            int []t= {
                 tempo/3600,
                 (tempo%3600)/30,
                 (tempo%3600)%30
            };
            return t;
    }

    public void exe07(){
        Exe07 a=new Exe07();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public double calculaExe07(double custo){
        return (custo*1.25)*1.45;
    }

    public void exe08(){
        Exe08 a=new Exe08();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public double calculaExe08(float nota1, float nota2, float nota3){
        double media=(nota1+nota2+nota3)/3;
        if(media>=6) {
                JOptionPane.showMessageDialog(null,"O Aluno foi Aprovado!","Resultado",JOptionPane.INFORMATION_MESSAGE);}
            else {
                JOptionPane.showMessageDialog(null,"O Aluno foi Reprovado!","Resultado",JOptionPane.INFORMATION_MESSAGE);}
        return media;
    }

    public void exe09(){
        Exe09 a=new Exe09();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public double calculaExe09(float x, float y, float z){
            double maior;
            if((x>=y)&&(x>=z)){maior=x;} else{
                if(y>=z){maior=y;} else {maior=z;}
            }
            return maior;
    }

    public void exe10(){
        Exe10 a=new Exe10();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public void calculaExe10(int x, int y){
            int resto;
            if(x>=y) {resto=x%y;} else {resto=y%x;}
            if(resto==0) {
                JOptionPane.showMessageDialog(null,"Os números são múltiplos!","Resultado",JOptionPane.INFORMATION_MESSAGE);}
            else {
                JOptionPane.showMessageDialog(null,"Os números não são múltiplos!","Resultado",JOptionPane.INFORMATION_MESSAGE);}
    }

    public void exe11(){
        Exe11 a=new Exe11();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public String calculaExe11(int idade){
           String cat="";
           switch(idade){
                    case 5: case 6: case 7:
                        cat=" Infantil A";
                        break;
                    case 8: case 9: case 10:
                        cat=" Infantil B";
                        break;
                    case 11: case 12: case 13:
                        cat=" Juvenil A";
                        break;
                    case 14: case 15: case 16: case 17:
                        cat=" Juvenil B";
                        break;
               case 18: case 99:
                        cat="Adulto";
                        break;
            }
            return cat;
    }

    public void exe12(){
        Exe12 a=new Exe12();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public double calculaExe12(float x, float y, float z){
            double m;
            if((x>=y)&&(x>=z)){m=((x*4)+(y*3)+(z*3))/10;} else{
                if(y>=z){m=((y*4)+(x*3)+(z*3))/10;} else {m=((z*4)+(x*3)+(y*3))/10;}
            }
           return m;
    }

    public void exe13(){
        Exe13 a=new Exe13();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public String calculaExe13(int num){
        String resp="";
        if(num>=0) {resp+="positivo e ";}
        else {resp+="negativo e ";}

        if((num%2)==0) {resp+="par.";}
        else {resp+="ímpar.";}
        return resp;
    }

    public void exe14(){
        Exe14 a=new Exe14();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public double calculaExe14(int sexo, double peso, float altura){
        if(sexo==0) {peso=(72.7*altura)-58;}
        else {peso=(62.1*altura)-44.7;}
        return peso;
    }

    public void exe15(){
        Exe15 a=new Exe15();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public String calculaExe15(float salario){
            DecimalFormat df =new DecimalFormat("#,###.00");
            String cre="";
            if(salario<=200)
                cre="0";
            if((salario>200)&&(salario<401))
                cre=df.format(salario*0.2);
            if((salario>400)&&(salario<601))
                cre=df.format(salario*0.3);
            if(salario>600)
                cre=df.format(salario*0.4);
            return cre;
    }

    public void exe16(){
        Exe16 a=new Exe16();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public float calculaExe16(float nota1,float nota2,float nota3, int op){
            float m=0;
            switch(op){
                case 0: m=(nota1+nota2+nota3)/3;
                break;
                case 1: m= (nota1*3 + nota2*3 + nota3*4)/10;
                break;
                case 2: m=3/(1/nota1 +1/nota2 +1/nota3);
                break;
            }
           return m;
    }

    public void exe17(){
        Exe17 a=new Exe17();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
    public double calculaExe17(float a, float b, float c){
        float p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public boolean verificaExe17(float a, float b, float c){
        float aux;
            String  tipo="",imagem="";
            if(a>b){
                aux=a;
                a=b;
                b=aux;
            }
            if(a>c){
                aux=a;
                a=c;
                c=aux;
            }
            if(b>c){
                aux=b;
                b=c;
                c=aux;
            }
            if((a<b+c)&&(b<a+c)&&(c<a+b)){
                return true;
            }else{
                return false;
            }
    }
    public void sobre(){
        Sobre a=new Sobre();
        a.setLocationRelativeTo(null);
        a.getContentPane().setBackground(Color.black);
        a.setVisible(true);
    }
}
