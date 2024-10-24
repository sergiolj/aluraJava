package capitulo3;

import java.util.Scanner;

public class ExercCap3 {

	public static void main(String[] args) {
		//menu(1);
		//menu(2);
		mostraExercicio();
	}
	
	//menu de apresentação dos exercícios
	public static void mostraExercicio() {
		boolean sair=false;
		int escolha=0;
		Scanner input=new Scanner(System.in);
		
		while(!sair) {
			System.out.print("Escolha um exercício de (1-9) (0 - Sair): ");
				escolha=input.nextInt();
				input.nextLine();

			if((escolha>=1) && (escolha<=9)) {
				switch(escolha) {
				case 1:
					numerosDoIntervalo(150,300);
					System.out.println();
					break;
				case 2:
					somaDosNumeros(1,1000);
					System.out.println();
					break;
				case 3:
					multiplosNIntervalo(3,1,100);
					System.out.println();
					break;		
				case 4:
					fatorialNM(1,10);
					System.out.println();
					break;				
				case 5:
					fatorialNMGrandesNum(1,20);
					System.out.println();
					break;
				case 6:
					fibbonacci();
					System.out.println();
					break;
				}

			}else {
				if(escolha==0) {
					sair=true;
				}
			}
		}
		input.close();
	}
	
	// Exercício 1 imprima os números de 150 a 300
	public static void numerosDoIntervalo(int menorNumSequencia, int maiorNumSequencia) {
		System.out.println("Sequencia de "+menorNumSequencia+" até "+maiorNumSequencia);
		for(int i=menorNumSequencia;i<=maiorNumSequencia;i++) {
			if(i<maiorNumSequencia) {
				System.out.print(i+"-");
			}else {
				System.out.println(i);
			}
		}
	}
	
	//Exercício 2 imprima a soma de 1 até 1000
	public static void somaDosNumeros(int menorNum, int maiorNum) {
		int soma=0;
		for(int i=menorNum; i<=maiorNum; i++) {
			soma+=i;
		}
		System.out.println("A soma de todos os números de "+menorNum+" até "+maiorNum+" é \n"+soma);
	}
	
	/*
	 * Exercício 3 imprima todos os múltiplos de 3 entre 1 e 100
	 * Os múltiplos (m) de um número (n) são o resultado da multiplicação de n * x = m, onde x>=1
	 */
	public static void multiplosNIntervalo(int multiplo, int menorIntervalo, int maiorIntervalo) {
		System.out.print("São multiplos de M("+multiplo+") = {");
		for(int i=menorIntervalo ; i<=maiorIntervalo ; i++) {
			if(i<maiorIntervalo) {
				System.out.print((multiplo*i)+";");
			}else {
				System.out.println(multiplo*i+"}");
			}							
		}
	}
	
	//Exercício 4 imprima os fatoriais de 1 a 10
	public static void fatorialNM(int menorIntervalo, int maiorIntervalo) {
		int f=0;
		int fat=1;
		
		System.out.println("O fatorial de 0 é 1");
		for(int i=1; i<=maiorIntervalo;i++) {
			fat=i*fat;
			System.out.println("O fatorial de "+i+" é ("+f+"!) * "+i+" = "+fat);
			f++;
		}
	}
	
	/*
	 * Exercício 5 imprima os fatorias de 1 a 20, 30, 40
	 * Até 20 é possível fatorar usando long que é um inteiro com 19 casas
	 */
	public static void fatorialNMGrandesNum(int menorIntervalo, int maiorIntervalo) {
		int f=0;
		long fat=1;
		
		System.out.println("O fatorial de 0 é 1");
		for(int i=1; i<=maiorIntervalo;i++) {
			fat=i*fat;
			System.out.println("O fatorial de "+i+" é ("+f+"!) * "+i+" = "+fat);
			f++;
		}
	}
	
	
	public static void fibbonacci() {
		
	}
}
