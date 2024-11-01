package cap11_interfaces;

public abstract class Funcionario {
	private String name;
	private String cpf;
	
	public Funcionario(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}
}
