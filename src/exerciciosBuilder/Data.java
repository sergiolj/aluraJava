package exerciciosBuilder;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private String data;

	Data() {}
	
	public Data(int dia, int mes, int ano) {
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;

		//método simples para concatenar inteiros em uma string
		this.data=dia+"/"+mes+"/"+ano;
	}
	
	public String getData() {
		return this.data;
	}
}
