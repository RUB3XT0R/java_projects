package exe02_genericos;

import java.util.Calendar;
import java.util.Date;

public class Genericos {

	public static <E> void printArray (E[] inputArray){
		for (E e : inputArray)
			System.out.println(" "+e);
		System.out.println();
	}
	
}


