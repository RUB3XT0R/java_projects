package exe10_sleepingTheads;

public class TestaContadora {

		public static void main(String args[]){
			
				Contadora c = new Contadora(1); //nossa t
				Thread t = new Thread(c);
				t.start();
				
				Contadora c2 = new Contadora(2); //nossa t
				Thread t2 = new Thread(c2);
				t2.start();
				
		}
}
