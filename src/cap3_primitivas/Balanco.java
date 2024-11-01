package cap3_primitivas;

import java.util.Scanner;

//import java.util.ArrayList;
//
//public class Balanco{
//	public ArrayList<Double>[] gasto;
//	
//	public Balanco(ArrayList<Double>[] vetor) {
//		this.gasto=vetor;
//		
//	}
//	public static void main(String[] args) {
//		Balanco ano2024 = new Balanco(gasto);
//		
//	}
//
//}

public class Balanco{
	public static void main(String[] args) {
		int[] gasto= new int[3];
		preenche(gasto);
		relatorio(gasto);
	}
	
	
	public static void preenche(int[] gasto) {
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<gasto.length;i++) {
			System.out.print("Gastos mês "+mes(i)+": ");
			gasto[i]=sc.nextInt();
		}
		sc.close();
	}
	public static String mes(int i) {
		String m="";
		switch (i) {
		case 0:
			m="Janeiro";
			break;
		case 1:
			m="Fevereiro";
			break;
		case 2:
			m="Marco";
			break;
		case 3:
			m="Abril";
			break;
		case 4:
			m="Maio";
			break;
		case 5:
			m="Junho";
			break;
		case 6:
			m="Julho";
			break;
		case 7:
			m="Agosto";
			break;
		case 8:
			m="Setembro";
			break;
		case 9:
			m="Outubro";
			break;
		case 10:
			m="Novembro";
			break;
		case 11:
			m="Dezembro";
			break;
		}
	return m;
	}
	public static void relatorio(int [] vetor) {
		int totalTrimestre=0;
		for(int i=0; i<vetor.length;i++) {
			totalTrimestre+=vetor[i];
		}
		System.out.println("Gasto total: "+totalTrimestre);
		System.out.println("Média mensal: "+totalTrimestre/3);
	}
}
