package exerciciosCap5;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private String data;

	Data() {}
	
	public Data(int dia, int mes, int ano) {
		if(isDataValida(dia,mes,ano)) {
			this.dia=dia;
			this.mes=mes;
			this.ano=ano;
			this.data=this.toString();
		}else {
			System.out.println("Data inválida!");
		}
	}
	
	private boolean isDataValida(int dia, int mes, int ano) {
		if((mes < 1) || (mes > 12)) {
			return false;
		}
		if(dia < 1 || dia > diasNoMes(mes,ano)) {
			return false;
		}
		return true;
	}
	
	private int diasNoMes(int mes, int ano) {
		switch(mes) {
		case 2:
			return (isBissexto(ano))? 29:28;
		case 4: case 6: case 9: case 11:
			return 30;
		default:
			return 31;
		}
	}
	
	public boolean isBissexto(int ano){
		return(ano % 4==0 && ano % 100 !=0) || (ano%400 == 0);
	}
	
	public String toString() {
		this.data = this.dia + "/" + this.mes + "/" + this.ano;
		return this.data;
	}
	public String getData() {
		return this.data;
	}
}
