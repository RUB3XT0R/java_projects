package exe02_genericos;

public class Stack <E>{

	private E[] elements;
	
	public Stack(int s){
		//...
		elements = (E[]) new Object[s];
	}
	
	//...
	public E pop(){
		E e = (E) new Object();
		//...
		return e;
	}
}
