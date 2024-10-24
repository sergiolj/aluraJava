package capitulo3;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5; //atribui o valor de i (5)
		System.out.println("a= "+a);
		
		int x=a++; // atribui o valor de i (5) a x e depois incrementa i (6)
		System.out.println("a= "+a);
		
		int y=++a; // incrementa o valor de i (7) e depois atribui a y (7)
		System.out.println("a= "+a);
		
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		
		int[] vetorInt=new int[5];
		
		// usa um tipo de loop for para adicionar dados ao vetor com base no índice
		for(int i=0;i<vetorInt.length;i++) {
			vetorInt[i]=i;
		}
		list(vetorInt);
		
		// x = 5, então o for inicia com 5 e finaliza com y = 7
		x=5;
		y=18;
		
//		//teria como fazer esse loop de uma forma diferente sem utilizar o artifício do break?
//		for(int i=x;i<=y;i++) {
//			if(i % 19 == 0) {
//				System.out.println("\nEncontrei um número divisível por 19 entre x="+x+" e y="+y+"!!!");
//				
//				/*
//				 * nesse caso o uso do break não compromente a lógica de compreensão do loop e evita manter
//				 * o loop em funcionamento até o final pois já encontrou uma combinação, não sendo considerado
//				 * uma má prática.
//				 */
//				break;
//			}
//			if(i==y) {
//				System.out.println("\nNÃO encontrei um número divisível por 19 entre x="+x+" e y="+y);
//			}
//		}
		
		/*
		 * Ao invés de usar o break pode ser usada uma variável boleana o que torna o 
		 * código mais legível
		 */
		x=5;
		y=20;
		
		boolean encontrei=false; // O uso do boolean torna o código mais compreensível
		for(int i=x;i<=y && !encontrei;i++) {
			if(i % 19 == 0) {
				System.out.println("\nEncontrei o número ("+i+") divisível por 19 entre x="+x+" e y="+y+"!!!");
				encontrei=true;
			}
			if(i==y) {
				System.out.println("\nNÃO encontrei um número divisível por 19 entre x="+x+" e y="+y);
			}
			
		}
	}
	
	/* usa um tipo de loop for que itera todo o vetor em sequência sem se preocupar com
	 * o índice ou o tamanho do vetor
	 */
	private static void list(int[] vetorInt) {
		for(int j:vetorInt) {
			System.out.print(j+" - ");
		}
		
	}

}
