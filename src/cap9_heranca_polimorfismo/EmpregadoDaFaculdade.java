package cap9_heranca_polimorfismo;

public class EmpregadoDaFaculdade {
	private String nome;
	private double salario;
	
	public EmpregadoDaFaculdade(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
		
	public void setSalario(double salario) {
		this.salario= salario;
	}
	public double getSalario() {
		return this.salario;
	}
	
	/*
	 *  O funcionário comum tem os métodos getGastos e getSalario iguais,
	 *  mas esse método precisa existir na superclasse
	 *  para que possa ser sobreescrito nas sub classes
	 */
	public double getGastos() {
		return this.salario;
	}
	
	public String getInfo() {
		return ("Nome: " + this.nome + " com salário de R$ " + this.salario); 
	}
}
