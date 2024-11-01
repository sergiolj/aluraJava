package cap11_interfaces;

public class SistemaInterno {

	public void login(Funcionario f) {
		/*
		 * Alguns funcionários não terão acesso ao sistema, logo 
		 * suas classes não implementam o método autentica
		 */
		f.autenticar();
	}
}
