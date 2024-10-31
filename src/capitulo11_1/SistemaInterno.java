package capitulo11_1;

public class SistemaInterno {

	public void login(FuncionarioAutenticavel f) {
		/*
		 * Alguns funcionários não terão acesso ao sistema, logo 
		 * suas classes não implementam o método autentica
		 */
		f.autenticar();
	}
}
