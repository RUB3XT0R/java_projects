package exe08_threads;

public class Contadora implements Runnable {

	int num_thread; //representa o numero/nome da thread	
	
	public Contadora(int num_thread) {
		super();
		this.num_thread = num_thread;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) 
				System.out.println(num_thread + " - " + i);
			
	}
	

}

