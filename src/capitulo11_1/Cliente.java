package capitulo11_1;

public class Cliente extends FuncionarioAutenticavel{

	public Cliente(String name, String cpf) {
		super(name, cpf);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Esse método de autenticação ao sistema é necessário ao cliente
	 * mas não faz sentido lógico o cliente extender Funcionário pois
	 * vários atributos desse não se aplicam
	 */
	@Override
	public void autenticar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
