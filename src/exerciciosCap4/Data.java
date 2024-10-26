package exerciciosCap4;

public class Data {
	int dia;
	int mes;
	int ano;
	String data;

	Data() {}
	
	public Data(int dia, int mes, int ano) {
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
		
		//método simples para concatenar inteiros em uma string
		data=dia+"/"+mes+"/"+ano;
	}
}
