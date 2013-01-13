package exe09_threads;

public class TestaContadora {

		public static void main(String args[]){
			
				Contadora c = new Contadora(1); //nossa t
				Thread t = new Thread(c);
				t.start();
				
				Contadora c2 = new Contadora(2); //nossa t
				Thread t2 = new Thread(c2);
				t2.start();
				
				Contadora c3 = new Contadora(3); //nossa t
				Thread t3 = new Thread(c3);
				t3.start();
				
		}
}
