package exercicio01Ate23;

import java.util.Scanner;

public class Exe01 {

	
	public static void main(String[] args) {
		// resposta do exercicio 01.
		
		//a.	Declare as variáveis c, thisIsAvariable, q76354 e number como sendo do tipo int;
		
		int c, thisIsAvariable, q76354,number;
		
		//b.	Solicite que o usuário insira um inteiro;
		
		System.out.println("Entre com um número");
		
		//c.	Insira um inteiro e atribua o resultado á variável int value. 
		//Suponha que a variável Scanner input possa ser utilizada para ler um valor digitado pelo usuário.
		
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		
		//d.	Se a variável number  não for igual a 7, exiba ” a variável não é igual  a 7”.
		
		number = 7;
		if( number !=7 ) System.out.println("a variável não é igual a 7");
		
		//e.	Imprima “Isso é um programa Java” em uma linha na janela de comando.
		
		System.out.println("Isso é um programa Java");
		
		//f.	Imprima “Isso é um programa Java” em duas linhas na janela de comando. 
		//A primeira linha deve terminar com “um”. Utilize  o método System.out.println.
		
		System.out.println("Isso é um\nprograma Java");
		
		//g.	Declare que um programa calculará o produto de três inteiros.
		
		//calculará o produto de três inteiros
		
		//h.	Crie um Scanner que lê valores a partir da entrada-padrão.
		
		Scanner sc = new Scanner(System.in);
		
		//i.	Declare as variáveis x,y,z e result como do tipo int.
		
		int x,y,z,result;
		
		//j.	Solicite que o usuário insira o primeiro inteiro.
		
		System.out.println("Insira o primeiro inteiro"); 
		
		//k.	Leia o primeiro inteiro digitado pelo usuário e armazene-o na variável x.
		
		x = sc.nextInt();
		
		//l.	Solicite que o usuário insira o segundo inteiro.
		
		System.out.println("Insira o segundo inteiro");
		
		//m.	Leia o segundo inteiro digitado pelo usuário e armazene-o na variável y.

		y = sc.nextInt();
		
		//n.	Solicite que o usuário insira o terceiro inteiro.
		
		System.out.println("Insira o terceiro inteiro");
		
		//o.	Leia o terceiro inteiro digitado pelo usuário e armazene-o na variável z.
		
		z = sc.nextInt();
		
		//p.	Compute o produto dos três inteiros contidos nas variáveis x,y,z e atribua o resultado a variável result.
		
		result = x*y*z;
		
		//q.	Exiba a mensagem “o produto custa “ e exiba o valor da avriavel result.
		
		System.out.println("O produto custa R$"+result);
		
		//r.	Some os inteiros impares entre 1 e 9 utilizando for. Assuma que as variáveis de inteiro sum e count foram declaradas.
		
		int sum = 0;
		for (int count=1; count<=9; count=count+2) sum +=count;
		
		//s.	Calcule o valor 2.5 elevado á potência de 3, utilizando o método Math.pow().
		
		Math.pow(2.5,3); //2.5 ^ 3
		
		//t.	Imprima os inteiros de 1 a 20, utilizando um loop while e a variável contadora q, 
		//assuma que a variável q foi declarada mas não inicializada. Imprima apenas 5 inteiros por linha.

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
		
		//w.	Teste se a variável contador é maior que 10, se for imprima “contador é maior que 10”.
		
		int contador =11;
		if(contador > 10)System.out.println("contador é maior que 10");
		
		//x.	Decremente a variável x por 1, então subtraia o resultado da variável total.
		int total=7;
		
		x--;
		total=total-x;
		
		//y.	Calcule o resto após q ser dividido por divisor e atribua o resultado a q.
		int divisor=4;
		q=2;
		
		q = q%divisor;
		
		//z.	Declare variáveis sum e x que serão do tipo int.
		
		//int sum;
		//int x;  
		//já foram criada em outro exercicio.
		
		//aa.	Atribua 1 a variável x.
		
		x=1;
		
		//bb.	Atribua 0 a variável sum.
		
		sum=0;
		
		//cc.	Adicione a variável x a variável sum e atribua o resultado a variável sum.
		
		sum += x;
		//ou
		sum  = sum+x;
		
		//dd.	Imprima “a soma é: “ seguido pelo valor da variável sum.
		
		System.out.println("A soma é:"+sum);

	}

}
