package capitulo7_1;

public class EmpregadoDaFaculdade {
	private String nome;
	private double salario;
	
	public void setNome(String nome){
		this.nome = nome;
	}
		
	public void setSalario(double salario) {
		this.salario= salario;
	}
	public double getSalario() {
		return this.salario;
	}
	public double getGastos() {
		return this.salario;
	}
	
	public String getInfo() {
		return ("Nome:  = " + this.nome + " com salário de R$ " + this.salario); 
	}
}
