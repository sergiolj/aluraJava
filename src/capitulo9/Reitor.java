package capitulo9;

public class Reitor extends EmpregadoDaFaculdade {
	
	
	public Reitor(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public double getGastos() {
		double adicional = 2;
		return super.getSalario() * adicional;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + " com salário total de " + this.getGastos() + " e ele é o REITOR";
	}

}
