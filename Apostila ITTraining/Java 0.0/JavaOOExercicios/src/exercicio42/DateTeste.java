package exercicio42;

public class DateTeste {

	public static void main(String[] args) {

        Date d = new Date();
        d.setAno(2011);
		d.setMes(03);
		
		//primeiro erro
        d.setDia(-34);
		System.out.println(d.displayDate()); // -> 3/1/2011
		
		//mes 1,3,5,7,8,10,12 vão até 31
		d.setMes(1);
		d.setDia(33);
		System.out.println(d.displayDate()); // -> 3/31/2011
		d.setMes(7);
		d.setDia(33);
		System.out.println(d.displayDate()); // -> 7/31/2011
		d.setMes(12);
		d.setDia(33);
		System.out.println(d.displayDate()); // -> 12/31/2011
	    //definindo uma data válida
		d.setMes(5);
		d.setDia(15);
		System.out.println(d.displayDate()); // -> 5/15/2011
		
		//mes 4,6,9,11 vão até 30
		d.setMes(4);
		d.setDia(33);
		System.out.println(d.displayDate()); // -> 4/30/2011
		d.setMes(9);
		d.setDia(33);
		System.out.println(d.displayDate()); // -> 9/30/2011
		d.setMes(11);
		d.setDia(33);
		System.out.println(d.displayDate()); // -> 11/30/2011
	    //definindo uma data válida
		d.setMes(4);
		d.setDia(27);
		System.out.println(d.displayDate()); // -> 4/27/2011
		
		//mes 2 vai até 28, não trataremos bissexto
		d.setMes(2);
		d.setDia(33);
		System.out.println(d.displayDate()); // -> 2/28/2011
		//definindo uma data válida
		d.setMes(2);
		d.setDia(13);
		System.out.println(d.displayDate()); // -> 2/13/2011
		
	}

}
