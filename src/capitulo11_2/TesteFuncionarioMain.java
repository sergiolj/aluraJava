package capitulo11_2;

public class TesteFuncionarioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Autenticavel authDiretor = new Diretor();
		Autenticavel authGerente = new Gerente();
		
		authDiretor.setSenha(124);
		authDiretor.addDepartment("Comércio");
		authDiretor.addDepartment("Serviços");
		
		System.out.println(authDiretor.autenticar(1234));
		System.out.println(authGerente.autenticar(222));
		
		authGerente.setSenha(222);
		
		authDiretor.listDepartment();
		
		Diretor diretor = new Diretor();
		
		diretor.setSenha(111);
		diretor.addDepartment("Comércio");
		
		SistemaInterno si = new SistemaInterno();
		si.login(diretor);

	}

}
