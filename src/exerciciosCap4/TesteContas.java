package exerciciosCap4;

public class TesteContas {
	public static void main(String[] args) {
		
		//O cliente está sendo criado como subclasse da classe PessoaFisica e isso não está conceitualmente
		//correto, uma vez que eu poderia ter um cliente pessoa jurídica. Seria o caso de usar interfaces?
		//Neste primeiro exemplo vamos considerar apenas clientes PF
		Gerente gerente=new Gerente();
		gerente.nome="Marcos";
		
		Cliente cliente=new Cliente();
		
		cliente.CPF="535454";
		cliente.nome="Pedro";
		cliente.sobrenome="Musk";
		cliente.dataNasc="25/09/1973";
		cliente.endereco="Rua dos Pintasilvos, 543";
		cliente.telefone="71-99192-0091";
		
		Conta c1=new Conta();
		
		c1.primeiroTitular=cliente;
		c1.agencia="001";
		c1.numero=1;
		c1.saldo=1000d;
		Data data=new Data(25,10,2024);
		c1.abertura=data;
		c1.gerente=gerente;
		
		c1.consultarSaldo();
		c1.primeiroTitular.exibirDadosCadastrais();
		
		c1.sacar(200);
		c1.consultarSaldo();
		
		/*
		 * o método sacar executa corretamente o saque impedindo que se saque um valor
		 * maior do que existente na conta
		 */
		c1.sacar(900);
		
		/* mas o atributo da classe pode ser acessado de outras
		 * maneiras, como por exemplo diretamente! Esse é um problema potencialmente maior!
		 * Como resolver?
		 */
		c1.saldo=-100;
		
		Cliente cliente2=new Cliente();
		
		cliente2.nome="Anastácia";
		
		Conta c2=new Conta();
		c2.primeiroTitular=cliente2;
		c2.primeiroTitular.exibirDadosCadastrais();
		
		c1.transferirValores(c2,500);
		c2.consultarSaldo();
		c1.consultarSaldo();
		
		c1.consultarDadosConta();
	}
}
