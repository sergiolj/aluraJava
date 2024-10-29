package capitulo5_1;

/*
 * Ao tornar os atributos da classe PRIVATE eles se tornam invisíveis para
 * as outras classes, isso garante que apenas os métodos 
 * escritos na Classe de origem acessem esses atributos
 * Ao fazer essa modificação todos as instruções que acessavam esses atributos diretamente
 * na classe Teste retornaram erro de compilação.
 */

public class ContaConstrutores {	
	private int numero;
	private Cliente titular;
	private double saldo;
	private double limite;
	private boolean contaConjunta=false;

	
	//MÉTODOS GET/SET
	/*não é boa prática criar métodos get/set para todos os atributos da classe
	 * recem criada, esse tipo de método deve ser criado sob demanda*/
	
	/* Em métodos booleanos do tipo get é comum usar is ao invés de get
	 * deste modo a leitura do código faz mais sentido
	 */
	public boolean isContaConjunta() {
		return contaConjunta;
	}
	
	
	public int getNumero() {
		return this.numero;
	}
	
	/*
	 * A mesma lógica do método setSaldo pode ser aplicada para o setNumero
	 * que define o número da conta, esse deve ser implementado por um 
	 * método específico e talvez não por um setNumero simples.
	 */
	//public void setNumero(int numero) {
	//	this.numero = numero;
	//}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		//return this.saldo;
		return this.saldo + this.limite;
	}
	
	/*/
	 * O método setSaldo, por exemplo, não deveria ser criado uma vez que 
	 * queremos que as funções de mudança no saldo ocorram apenas
	 * com base nas funções de depósito, saques ou transferências de valores
	 */
	//public void setSaldo(double saldo) {
	//	this.saldo = saldo;
	//}
	
	
	//MÉTODOS CONVENCIONAIS
	void sacarVoid(double valorDoSaque) { 
		double novoSaldo = this.saldo - valorDoSaque;
		this.saldo = novoSaldo;
	}
	
	void depositar(double valorDoDeposito){
		if(valorDoDeposito > 0) {
			this.saldo += valorDoDeposito;
		}

	}
	
	boolean sacarBoolean(double valorDoSaque) {
		if(this.saldo > valorDoSaque) {
			double novoSaldo = this.saldo - valorDoSaque;
			this.saldo = novoSaldo;
			return true;
		}else {
			return false;
		}
	}
	
	void transferir(ContaConstrutores destinatario, double valor) {
		this.saldo = this.saldo - valor;
		destinatario.saldo = destinatario.saldo + valor;
	}
	
	boolean transferirPara(ContaConstrutores destinatario, double valor) {
		boolean saldoSuficiente = this.sacarBoolean(valor);
		if(saldoSuficiente) {
			destinatario.depositar(valor);
			return true;
		}else {
			return false;
		}
	}
	
	
}
