package capitulo10;

public class Gerente extends Funcionario{

	public Gerente(String name, String cpf, double salary) {
		super(name, cpf, salary);

	}
	
	@Override
	public double getBonificacao() {
		return (super.getSalary() * 0.2);
	}

	@Override
	public double setTotalRemuneration() {
		return (super.getSalary() + this.getBonificacao());
	}
}
