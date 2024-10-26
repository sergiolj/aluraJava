package capitulo5;

public class Teste {

	public static void main(String[] args) {
		
		//continuo podendo criar uma referência e uma instância daquela classe
		Conta conta1;
		conta1 = new Conta();
		
		Conta conta2 = new Conta();
		
		Cliente cliente = new Cliente();
		/*
		 * ao modificar o atributo para PRIVATE de modo a ter um controle eficiente
		 * e seguro de como esses serão modificados todas as instruções que faziam isso a
		 * partir dessa classe foram desabilitadas.
		 * Isso garante que os dados não serão alterados descontroladamente
		 */
		conta1.titular = cliente;
		
		/*
		 * note que mesmo que a classe Cliente não tenha seus atibutos protegidos ela não pode ser
		 * modificada através da classe Conta que a utiliza
		 */
		conta1.titular.nome = "Sérgio";
		conta1.titular.sobrenome = "Lopes";
		conta1.titular.cpf = "54554";
		
		conta1.numero = 101;
		conta1.saldo = 1000;
		
		/*
		 * continuo podendo criar uma referência e uma instância da Classe, 
		 * já que apenas seus atributos são protegidos
		 */
		Cliente cliente3 = new Cliente();
		
		/*
		 *  como a classe Cliente está sendo acessada diretamente e seus atributos não são privados
		 *  as alteraçoes desse modo ainda são possíveis
		 */
		cliente3.nome = "Anderson";
		
		Conta conta3 = new Conta();
		
		conta3.titular = cliente3;
		
		Conta conta4= new Conta();
		Cliente cliente4 = new Cliente();
		
		conta4.titular=cliente4;
		conta4.titular.nome="Carlos";
	}

}
