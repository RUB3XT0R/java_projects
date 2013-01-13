package exe01_sobrecarga;

public class Genericos {

	public static void printArray(Integer[] inputArray){
		for(Integer e: inputArray) 
			System.out.print(" "+e);
		System.out.println();
	}
	
	public static void printArray(Double[] inputArray){
		for(Double e: inputArray) 
			System.out.print(" "+e);
		System.out.println();
	}
	
	public static void printArray(Character[] inputArray){
		for(Character e: inputArray) 
			System.out.print(" "+e);
		System.out.println();
	}
	
}
