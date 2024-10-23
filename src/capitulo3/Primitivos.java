package capitulo3;
import java.util.Scanner;

public class Primitivos {
		public int idade;
		public String nome;
		
		public static void main(String[] args) {
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("O loop a seguir informa quais os elementos adjacentes em uma fila circular\n"
				+ "Informe um número de 0 até 4 (5- Sair)");
		System.out.println("O resto da divisão quando o dividendo (d/D) é menor que o divisor é o próprio dividendo");
		
		System.out.println("Fila circular sentido horário 0->1->2->3->4->0 ...");
		do{
			n=sc.nextInt();	
			if(n>=0 && n<=4) {
				System.out.println("Direita: ("+n+"+4) % 5="+(n+4) % 5);
				
				System.out.println("Esquerda: ("+n+"+1) % 5="+(n+1) % 5);
			}
		}while(n!=5);
		
		Primitivos teste=new Primitivos();
		teste.idade=30;
		teste.nome="Sérgio";
		boolean menorDeIdade = teste.idade<18;
		String menorDeIdadeS = String.valueOf(menorDeIdade);
		System.out.println(teste.nome+" é menor de idade? "+menorDeIdadeS.toUpperCase());
		sc.close();
		}

	}