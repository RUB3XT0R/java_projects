package exercicio01Ate23;

import java.util.Scanner;

public class Exe01 {

	
	public static void main(String[] args) {
		// resposta do exercicio 01.
		
		//a.	Declare as vari�veis c, thisIsAvariable, q76354 e number como sendo do tipo int;
		
		int c, thisIsAvariable, q76354,number;
		
		//b.	Solicite que o usu�rio insira um inteiro;
		
		System.out.println("Entre com um n�mero");
		
		//c.	Insira um inteiro e atribua o resultado � vari�vel int value. 
		//Suponha que a vari�vel Scanner input possa ser utilizada para ler um valor digitado pelo usu�rio.
		
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		
		//d.	Se a vari�vel number  n�o for igual a 7, exiba � a vari�vel n�o � igual  a 7�.
		
		number = 7;
		if( number !=7 ) System.out.println("a vari�vel n�o � igual a 7");
		
		//e.	Imprima �Isso � um programa Java� em uma linha na janela de comando.
		
		System.out.println("Isso � um programa Java");
		
		//f.	Imprima �Isso � um programa Java� em duas linhas na janela de comando. 
		//A primeira linha deve terminar com �um�. Utilize  o m�todo System.out.println.
		
		System.out.println("Isso � um\nprograma Java");
		
		//g.	Declare que um programa calcular� o produto de tr�s inteiros.
		
		//calcular� o produto de tr�s inteiros
		
		//h.	Crie um Scanner que l� valores a partir da entrada-padr�o.
		
		Scanner sc = new Scanner(System.in);
		
		//i.	Declare as vari�veis x,y,z e result como do tipo int.
		
		int x,y,z,result;
		
		//j.	Solicite que o usu�rio insira o primeiro inteiro.
		
		System.out.println("Insira o primeiro inteiro"); 
		
		//k.	Leia o primeiro inteiro digitado pelo usu�rio e armazene-o na vari�vel x.
		
		x = sc.nextInt();
		
		//l.	Solicite que o usu�rio insira o segundo inteiro.
		
		System.out.println("Insira o segundo inteiro");
		
		//m.	Leia o segundo inteiro digitado pelo usu�rio e armazene-o na vari�vel y.

		y = sc.nextInt();
		
		//n.	Solicite que o usu�rio insira o terceiro inteiro.
		
		System.out.println("Insira o terceiro inteiro");
		
		//o.	Leia o terceiro inteiro digitado pelo usu�rio e armazene-o na vari�vel z.
		
		z = sc.nextInt();
		
		//p.	Compute o produto dos tr�s inteiros contidos nas vari�veis x,y,z e atribua o resultado a vari�vel result.
		
		result = x*y*z;
		
		//q.	Exiba a mensagem �o produto custa � e exiba o valor da avriavel result.
		
		System.out.println("O produto custa R$"+result);
		
		//r.	Some os inteiros impares entre 1 e 9 utilizando for. Assuma que as vari�veis de inteiro sum e count foram declaradas.
		
		int sum = 0;
		for (int count=1; count<=9; count=count+2) sum +=count;
		
		//s.	Calcule o valor 2.5 elevado � pot�ncia de 3, utilizando o m�todo Math.pow().
		
		Math.pow(2.5,3); //2.5 ^ 3
		
		//t.	Imprima os inteiros de 1 a 20, utilizando um loop while e a vari�vel contadora q, 
		//assuma que a vari�vel q foi declarada mas n�o inicializada. Imprima apenas 5 inteiros por linha.

		int q=1;
		while (q<=20){
			System.out.printf("%d\t",q);
			if( q%5 == 0 ) System.out.println();
			q++;
		}
		
		//u.	Repita a parte acima utilizando for, depois do.
		
		//for
			for(int i=1; i<=20; i++){
				System.out.printf("%d\t",i);
				if( i%5 == 0 ) System.out.println();
			}
					
		//do
		q=1;
		do{
			System.out.printf("%d\t",q);
			if( q%5 == 0 ) System.out.println();
			q++;
		}while (q<=20);
		
		//v.	Atribua a soma de x e y e z e incremente x por 1 depois do calculo.
		
		x = x+y+z;
		x++;
		
		//w.	Teste se a vari�vel contador � maior que 10, se for imprima �contador � maior que 10�.
		
		int contador =11;
		if(contador > 10)System.out.println("contador � maior que 10");
		
		//x.	Decremente a vari�vel x por 1, ent�o subtraia o resultado da vari�vel total.
		int total=7;
		
		x--;
		total=total-x;
		
		//y.	Calcule o resto ap�s q ser dividido por divisor e atribua o resultado a q.
		int divisor=4;
		q=2;
		
		q = q%divisor;
		
		//z.	Declare vari�veis sum e x que ser�o do tipo int.
		
		//int sum;
		//int x;  
		//j� foram criada em outro exercicio.
		
		//aa.	Atribua 1 a vari�vel x.
		
		x=1;
		
		//bb.	Atribua 0 a vari�vel sum.
		
		sum=0;
		
		//cc.	Adicione a vari�vel x a vari�vel sum e atribua o resultado a vari�vel sum.
		
		sum += x;
		//ou
		sum  = sum+x;
		
		//dd.	Imprima �a soma �: � seguido pelo valor da vari�vel sum.
		
		System.out.println("A soma �:"+sum);

	}

}
