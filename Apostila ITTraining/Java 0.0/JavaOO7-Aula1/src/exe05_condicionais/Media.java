package exe05_condicionais;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
	      Scanner input = new Scanner(System.in);
		  
	      System.out.println("Entre com a primeira nota do aluno..:");
		  float n1 = input.nextInt();
		  
		  System.out.println("Entre com a segunda nota do aluno...:");
		  float n2 = input.nextInt();
		  
		  System.out.println("Entre com a terceira nota do aluno..:");
		  float n3 = input.nextInt();
		  
		  float media = (n1+n2+n3)/3;
		  System.out.println("A média do aluno foi..:"+ media);
		  
		  //condicionais simples
		  if(media >=7){
		        System.out.println("EBA! O aluno foi aprovado!");
		  }else{
		        System.out.println("Opis...o aluno não foi aprovado.");
		  }
		  
		  //Condicionais encadeados
		  if(media >=7){
              System.out.println("EBA! O aluno foi aprovado!");
          }else{
               System.out.println("Opis...o aluno não foi aprovado.");     	
               System.out.println("Entre com a nota do exame .....:");
               media = input.nextFloat();
               if(media >=5){
                     System.out.println("O aluno foi aprovado em exame.");
               }else{
                     System.out.println("O aluno não foi aprovado.");
               }
          }
		  
		  //Operador ?
		  System.out.println( media>=7 ?
                  "O aluno foi aprovado em exame."
                  : "O aluno não foi aprovado.");

          //condicionais encadeados
		  String str="";
			if(media >= 9){
		                         str="classe A";
			}else if(media >= 8){
			        str="classe B";
			}else if(media >= 7){
			        str="classe C";
			}else if(media >=6){
			         str="classe D";
			}else{
			         str="classe E";
			}
		  System.out.println(str);
		  
		  //Switch
		  str="";
          switch( (int) media){
                  case 10: case 9:
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
