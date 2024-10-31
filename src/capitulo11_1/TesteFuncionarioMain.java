package capitulo11_1;

public class TesteFuncionarioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaInterno sistemaInterno = new SistemaInterno();
		
		Gerente gerente = new Gerente("Marcos Aurélio", "4242421", 1234);
		gerente.addDepartment("Comercio");
		gerente.addDepartment("Serviços");
		gerente.addDepartment("Pessoa Física de acima 10 SM");
	
		
		gerente.listDepartment();
		gerente.autenticar();
		
		Engenheiro engenheiro = new Engenheiro("Oscar Niemeyer", "221233");
		//método abstrato não se aplica ao engenheiro, logo não há como implementar autenticar()
		

	}

}
