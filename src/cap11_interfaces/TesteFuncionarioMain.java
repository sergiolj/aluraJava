package cap11_interfaces;

public class TesteFuncionarioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaInterno sistemaInterno = new SistemaInterno();
		
		Gerente gerente = new Gerente("Marcos Aurélio", "4242421", 1234);
		gerente.addDepartment("Comercio");
		gerente.addDepartment("Serviços");
		gerente.addDepartment("Pessoa Física de acima 10 SM");
	
		
		gerente.listDepartment();
		gerente.autenticar(1234, "Comercio");
		
		Engenheiro engenheiro = new Engenheiro("Oscar Niemeyer", "221233");
		sistemaInterno.login(engenheiro);

	}

}
