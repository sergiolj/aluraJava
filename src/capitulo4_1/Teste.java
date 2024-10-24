package capitulo4_1;

public class Teste {

	public static void main(String[] args) {
		// cria uma variável conta1 que referencia uma nova Conta
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		//cria uma variável cliente que referencia um novo Cliente
		Cliente cliente = new Cliente();
		
		/*
		 * a referência de cliente é armazenada no atributo de titular.
		 * Em outras palavras, conta1 tem como referência o mesmo Cliente, 
		 * ao qual cliente se refere do mesmo modo que se passaram as referências entre
		 * ponteiros de memória em TestaReferencias.java
		 */
		
		conta1.titular = cliente;
		
		conta1.titular.nome = "Sérgio";
		conta1.titular.sobrenome = "Lopes";
		conta1.titular.cpf = "54554";
		conta1.numero = 101;
		conta1.saldo = 1000;
		
		/*
		 * essa instrução irá gerar um erro de ponteiro pois o 
		 * cliente2 não possui referência a um objeto
		 */
//		Cliente cliente2 = conta2.titular;
//		cliente2.nome = "Anderson";
		
		/*
		 * uma das funções do new é criar essa referência
		 */
		Cliente cliente3 = new Cliente();
		cliente3.nome = "Anderson";
		Conta conta3 = new Conta();
		conta3.titular = cliente3;
		
		/*
		 * cria uma instância de Conta com referência armazenada na variável conta4.
		 * Mas na criação os Atributos são inicializados com valores padrão e no caso o
		 * valor padrão para Cliente titular = null
		 */
		Conta conta4= new Conta();
		/*
		 *  por esse motivo, tentar atribuir um valor ao objeto titular retornará um erro
		 * 	de execução. Os atributos da Classe cliente precisam de uma referência para serem
		 * armazedados por isso é necessária a criação de uma variável para armazenar essa
		 * referência.
		 */
//		conta4.titular.nome="Carlos";
		Cliente cliente4 = new Cliente();
		conta4.titular=cliente4;
		conta4.titular.nome="Carlos";
	}

}
