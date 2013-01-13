package exe05_Excecoes_tratamento;


public class TesteExcecoes {

	
	public static void main(String[] args) {
		
		
		try{

			//NegativeArraySizeException
			String[] teste = new String[-5];
			//ArrayIndexOutOfBoundsException
			teste[5]="";
			
			//NullPointerException
			String s = null;
			s.toString();
			
			//NumberFormatException
			int i = Integer.parseInt("oi");
			
		}catch(NegativeArraySizeException n){
			System.out.println("Foi lançada: "+n);
		}catch(ArrayIndexOutOfBoundsException n){
			System.out.println("Foi lançada: "+n);
		}catch(NullPointerException n){
			System.out.println("Foi lançada: "+n);
		}catch(NumberFormatException n){
			System.out.println("Foi lançada: "+n);
		}
		
		
		
	}

}
