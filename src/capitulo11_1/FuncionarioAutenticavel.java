package capitulo11_1;

public abstract class FuncionarioAutenticavel extends Funcionario {

	public FuncionarioAutenticavel(String name, String cpf) {
		super(name, cpf);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void autenticar();
	
}
