package capitulo5_1;

/*
 * Ao tornar os atributos da classe PRIVATE eles se tornam invisíveis para
 * as outras classes, isso garante que apenas os métodos 
 * escritos na Classe de origem acessem esses atributos
 * Ao fazer essa modificação todos as instruções que acessavam esses atributos diretamente
 * na classe Teste retornaram erro de compilação.
 */

public class Conta {	
	private int numero;
	private Cliente titular;
	private double saldo;
	private double limite;
	
	/*
	 * declarar um objeto como static quer dizer que ele não é um atributo
	 * de instância mas sim um atributo de objeto
	 * para acessar esse objeto se usa o 
	 * NOME DA CLASSE.AtributoEstático ao invés de this.
	 */
	private static int totalDeContas;

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
		Conta.totalDeContas += 1;
	}
	Conta (Cliente titular){
		this.titular=titular;
		
	}
	Conta(int numero, Cliente titular){
		this(titular); //posso chamar um construtor dentro de outro
		this.numero=numero;
		this.saldo=0;
		this.limite=0;
		/*
		 * esse atributo da Classe irá armazenar a quantidade de instâncias
		 *	da classe criadas. Para acessa-lo será necessário criar um getter
		 */
		Conta.totalDeContas += 1;
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
		return this.numero;
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
