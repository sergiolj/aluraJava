package cap7_pacotes;

public class TestaTiposFuncionariosHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		
		gerente.setNome("João da Silva");
		
		gerente.setSenha(4231);
		gerente.setSalario(5000);
		
		System.out.println(gerente.getParticipacaoLucros());
		System.out.println(gerente.getParticipacaoLucros());
		System.out.println(gerente.getBonificacaoGerente());
	
	/**
	 * Polimorfismo é a capadidade de um objeto 
	 * ser referenciado de várias formas
	 * 
	 */
		Gerente gerente1 = new Gerente();
		Funcionario funcionario = gerente;
		funcionario.setSalario(5000);
		
		gerente1.setSenha(123);
		
		System.out.println(funcionario.getParticipacaoLucros());
	
		System.out.println("****************************");
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(5000d);
		
		/**
		 * O método registra(Funcionario funcionario) pede como parâmetro
		 * um objeto da classe Funcionário e como Gerente extends Funcionario
		 * ele é considerado um funcionário também sendo permitido passar ele
		 * como referência.
		 */
		controle.registra(funcionario1);
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(1000d);
		
		/**
		 * Aqui o objeto passado é um funcionario mesmo
		 * Mesmo assim o resultado do valor das bonificações é diferente
		 * pois os métodos acionados são os das classes.
		 */
		controle.registra(funcionario2);
		
		/**
		 * Ao selecionar o método o eclipse já informa que o método
		 * pertence à classe do objeto que o chamou
		 */
		System.out.println(funcionario1.getParticipacaoLucros());
		
		System.out.println(funcionario2.getParticipacaoLucros());
		
		System.out.println(controle.getTotalDeBonificacoes());
		
		Recepcionista recepcionista=new Recepcionista();
		/**
		 * A ordem das instruções altera o resultado, pois
		 * se o controle de registro for feito antes da definição do
		 * valor do salario da recepcionista o total de bonidicações não
		 * será afetado.
		 * 
		 * Essa aplicação poderia ser feita na classe funcionário como um método e atributos
		 * estáticos? Qual seria o impacto? Faz sentido do ponto de vista de boas práticas?
		 */
		recepcionista.setSalario(500);
		controle.registra(recepcionista);

		
		System.out.println("*****");
		System.out.println(recepcionista.getParticipacaoLucros());
		System.out.println(controle.getTotalDeBonificacoes());
	}

}
