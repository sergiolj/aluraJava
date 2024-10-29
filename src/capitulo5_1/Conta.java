package capitulo5_1;

/*
 * Ao tornar os atributos da classe PRIVATE eles se tornam invisíveis para
 * as outras classes, isso garante que apenas os métodos 
 * escritos na Classe de origem acessem esses atributos
 * Ao fazer essa modificação todos as instruções que acessavam esses atributos diretamente
 * na classe Teste retornaram erro de compilação.
 */

public class Conta {	
	private int numeroConta;
	private Cliente titular;
	private double saldo;
	private double limite;
	private static int idConta=1;
	
	/*
	 * declarar um objeto como static quer dizer que ele não é um atributo
	 * de instância mas sim um atributo de CLASSE
	 * para acessar esse objeto se usa o 
	 * NOME DA CLASSE.AtributoEstático ao invés de this.
	 */
	private static int totalDeContas=0;

	//CONSTRUTOR
	/*
	 * O construtor não é considerado um método 
	 * Sua principal função é dar opções ou obrigar o usuário
	 * a passar algum argumento necessário para a criação da classe
	 * Ele só é acessado na construção de objetos
	 * É possível criar CONSTRUTORES que chamam outros CONSTRUTORES.
	 * Os construtores ainda podem ser facilitadores, desobrigando o usuário
	 * a ter que utilizar vários setter
	 * */
	
	Conta(){
		this.numeroConta = criarIdentificadorConta();
	}
	Conta (Cliente titular){
		this.numeroConta = criarIdentificadorConta();
		this.titular=titular;
		
	}
	Conta(int numero, Cliente titular){
		this.numeroConta = criarIdentificadorConta();
		/* posso chamar um construtor dentro de outro
		* mas isso pode causar problemas caso os construtores utilizem
		* atributos de classe
		*/ 
		//this(titular); // ao chamar esse construtor o incrementa conta será acionado 
		// uma vez a mais
		this.saldo=0;
		this.limite=0;
		}
	/* Esse método static é um metodo de Classe, por isso pode ser usado para controlar
	 * quantas instâncias estão sendo criadas, se for acionado antes de instanciar
	 * qualquer objeto sua informação será zero.
	 * métodos estáticos não necessitam de objetos criados para serem executados
	 */
	
	
	//metodo usado para criar um identificador unico para cada conta
	static int criarIdentificadorConta() {
		int numeroDaConta = idConta;
		idConta += 1;
		Conta.totalDeContas += 1;
		return numeroDaConta;
	}
	
	//MÉTODOS GET/SET
	
	/*
	 * uma vez que gostaríamos de saber quantas contas foram criadas,
	 * sem ter que criar uma instância o método getter para representar
	 * a Classe deve ser STATIC.
	 */
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	
	public int getNumero() {
		return this.numeroConta;
	}

	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return this.saldo + this.limite;
	}
	

	
	//MÉTODOS CONVENCIONAIS
	void depositar(double valorDoDeposito){
		if(valorDoDeposito > 0) {
			this.saldo += valorDoDeposito;
		}

	}
	
	boolean sacar(double valorDoSaque) {
		if(this.saldo > valorDoSaque) {
			double novoSaldo = this.saldo - valorDoSaque;
			this.saldo = novoSaldo;
			return true;
		}else {
			return false;
		}
	}
	
	void transferir(Conta destinatario, double valor) {
		this.saldo = this.saldo - valor;
		destinatario.saldo = destinatario.saldo + valor;
	}
	
	boolean transferirPara(Conta destinatario, double valor) {
		boolean saldoSuficiente = this.sacar(valor);
		if(saldoSuficiente) {
			destinatario.depositar(valor);
			return true;
		}else {
			return false;
		}
	}
	
	
}
