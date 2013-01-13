package exe03_controleDeFluxo;

import java.util.Scanner;

public class Media {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota do aluno:");
		int n1 = input.nextInt();
		System.out.println("Entre com a segunda nota do aluno:");
		int n2 = input.nextInt();
		System.out.println("Entre com a terceira nota do aluno:");
		int n3 = input.nextInt();
		
		float media = (n1+n2+n3)/3;
				
		if(media >=7){
			System.out.println("O aluno foi aprovado.");			
		}else{
			System.out.println("O aluno não foi aprovado.");
			
			//segunda alteração
			System.out.println("Entre com a nota do exame:");
			media = input.nextFloat();
			if(media >=5 )
				System.out.println("O aluno foi aprovado em exame.");
			else
				System.out.println("O aluno não foi aprovado.");
			
		}
		
		//terceira alteração
		System.out.println( (media >= 7) ? "O aluno foi aprovado." :
			"O aluno não foi aprovado");
		
		//quarta alteração
		String str="";
		if(media >= 9){
			str="classe A";
		}else if(media >= 8){
			str="classe B";
		}else if(media >= 7){
			str="classe C";
		}else if(media >= 6){
			str="classe D";
		}else{
			str="classe E";
		}
		System.out.println(str);
		
		//quinta alteração
		str="";
		switch( (int) media){
			case 10:
			case 9:
				str="classe A"; break;
			case 8:
				str="classe B"; break;
			case 7:
				str="classe C"; break;
			case 6:
				str="classe D"; break;
			default:
				str="classe E";
		}
		System.out.println(str);
	}

}
