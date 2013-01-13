
package Modelo;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;

public class Mesa {
	LinkedList<Produto>[] vet;
        double []totalpormesa;

	public Mesa(int length){
                totalpormesa = new double[length];

		vet = new LinkedList [length];
		for (int i = 0; i < length; ++i){
			vet [i] = new LinkedList();
                        totalpormesa[i]=0;
                }
	}//fim construtor

        public LinkedList<Produto> getElement(int i)
		{return vet[i];}

        public String totalLista(int nuMesa){
            double price=0;
            Iterator<Produto> i =(getElement(nuMesa)).iterator();
            while(i.hasNext()){price +=i.next().getQTDE();}
            totalpormesa[nuMesa]=price;
            DecimalFormat df = new DecimalFormat("#,###.00");
            return df.format(price);
        }
        public double getTotalMesa(int i)
                {return totalpormesa[i];}

        public Produto getInnerElement(int i, int y)
		{return vet[i].get(y);}

	public int getLength()
		{return vet.length;}

	public void clearTable(int position)
		{vet[position].clear();}

	public void insert (Produto item, int positionVet)
		{vet[positionVet].addLast(item);}

	public void withdraw (int positionVet,int item)
		{vet[positionVet].remove(item);}

	public String toString(int i)
		{return vet[i].toString();}

}