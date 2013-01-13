package exe02_genericos;

public class TestaGenericos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Genericos g = new Genericos();
		
		Integer[] ints = { 1 , 2 , 3 , 4 , 5 , 6 };
		g.printArray(ints);

		Double[] doubles = { 1.3 , 2.56 , 3.56 , 4.56 };
		g.printArray(doubles);
		
		Character[] characters = { 'a' , 'b' , 'v' , 'o' };
		g.printArray(characters);
	}

}
