package exerciciosBuilder;

public class Conta {
	private int numero;
	private int agencia;
	private Cliente primeiroTitular = new Cliente();
	private Cliente segundoTitular;
	private Data abertura = new Data();
	private double saldo;
	private Gerente gerente = new Gerente();
	private ContaEspecial contaEspecial;
	private ContaPoupanca contaPoupanca;

	/**
	 * O Parâmetro Builder é usado para facilitar o processo de instânciar um objeto
	 * com muitos atributos
	 * @param builder
	 */
	private Conta(Builder builder) {
		this.numero = numero;
		this.agencia = agencia;
		this.primeiroTitular = primeiroTitular;
		this.abertura = abertura;
		this.saldo = 0;
		this.gerente = gerente;
	}
	
	/**
	 * O Padrão Builder é uma classe estática interna que serve para facilitar
	 * a criação de instâncias mais complexas e com muitos atributos permitindo que os atributos
	 * sejam configurados gradualmente
	 */
	public static class Builder{
		private int numero;
		private int agencia;
		private Cliente primeiroTitular = new Cliente();
		private Data abertura = new Data();
		private double saldo;
		private Gerente gerente = new Gerente();
		
		/**
		 * Esses métodos são setter utilizados pelo Builder para passar
		 * seus parâmetros
		 * @param numero
		 * @return
		 */
		public Builder numero(int numero) {
			this.numero = numero;
			//ao retornar this ao invés de this.numero estamos retornando o objeto builder completo
			return this;
		}
		
		public Builder agencia(int agencia) {
			this.agencia =  agencia;
			return this;
		}
		
		public Builder primeiroTitular(Cliente cliente) {
			this.primeiroTitular = cliente;
			return this;
		}
		public Builder abertura(Data abertura) {
			this.abertura = abertura;
			return this;
		}
		
		public Builder saldo(double saldo) {
			this.saldo = saldo;
			return this;
		}
		public Builder gerente(Gerente gerente) {
			this.gerente = gerente;
			return this;
		}
	}


	
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("\nSaque efetuado com sucesso");
			return true;
		}else {
			System.out.println("\nSaldo insuficiente para efetuar operação");
			return false;
		}
	}

	public void depositarValores(double valor) {
		this.saldo += valor;
	}

	public void consultarSaldo() {
		System.out.println("Seu saldo atual é de R$: "+this.saldo);
	}

	public void transferirValores(Conta numero, double valor) {
		if(this.sacar(valor)) {
			numero.depositarValores(valor);
			System.out.println("Transferência efetuada com sucesso!");
		}
	}
	
	public void consultarDadosConta() {
		System.out.println("\nAgência: "+this.agencia);
		System.out.println("Número da cta: "+this.numero);
		System.out.println("Primeiro Titular: "+this.primeiroTitular.nome);
		System.out.println("Gerente: "+this.gerente.nome);
		System.out.println("Abertura da conta: "+this.abertura.getData());
	}

}
