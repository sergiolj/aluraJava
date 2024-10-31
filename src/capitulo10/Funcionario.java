package capitulo10;

public abstract class Funcionario {
	protected String name;
	protected String cpf;
	protected double salary;
	protected double totalRemuneration;

	public Funcionario(String name, String cpf, double salary) {
		this.name = name;
		this.cpf = cpf;
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getTotalRemuneration() {
		return this.totalRemuneration;
	}
	
	public void setTotalRemuneration(double totalRemuneration) {
		this.totalRemuneration = totalRemuneration;
	}
	
	/**
	 * Na classe funcionário não teremos uma bonificação padrão para todos
	 * os funcionários, logo não faz sentido ter um método que calcule a bonificação,
	 * mas ao mesmo tempo precisamos de uma referência única a ser
	 * usada pelas classes filhas, logo o método é implementado como asbtract.
	 * Note que a declaração é um pouco diferente de um método convencional.
	 * Essa declaração resulta em que as subclasses são obrigadas a criar um método concreto de mesmo
	 * nome senão resulta em erro de compilação
	 * 
	 */
	public abstract double getBonificacao();

	public abstract double setTotalRemuneration();
}
