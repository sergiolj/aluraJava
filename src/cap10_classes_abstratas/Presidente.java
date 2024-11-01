package cap10_classes_abstratas;

public class Presidente extends Funcionario{
	
	public Presidente(String name, String cpf, double salary) {
		super(name, cpf, salary);
	}
	
	@Override
	public double getBonificacao() {
		double bonus = 50000d;
		return bonus;
	}

	@Override
	public double setTotalRemuneration() {
		return (super.getSalary() + this.getBonificacao());
	}
	
	
}
