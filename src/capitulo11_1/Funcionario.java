package capitulo11_1;

public abstract class Funcionario {
	private String name;
	private String cpf;
	private double bonus;
	private double salary;
	private String department;
	
	public Funcionario(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
		this.bonus = getBonificacao();
	}
	
	public double getBonificacao() {
		this.bonus = this.salary * 0.2;
		return this.bonus;
	}
}
