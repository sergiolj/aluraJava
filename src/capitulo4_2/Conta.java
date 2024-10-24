package capitulo4_2;

/*
 * As diferentes nomenclaturas para variáveis a depender do que representam.
 * ATRIBUTOS, PARÂMETROS OU ARGUMENTOS E VARIÁVEIS SIMPLES
 * Os atributos quando declarados recebem valores padrão, por isso não precisam ser
 * declarados inicialmente
 */


public class Conta {
	/*
	 * Esses são ATRIBUTOS da classe. Para se referenciar a atributos de uma
	 * usamos a expressão (this)
	 */
	int numero;
	
	// com a criação da Classe Cliente o atributo titular deixa de ser do tipo String
	//String titular;
	//para ser um atributo do tipo Cliente.
	//Cliente titular;
	double saldo;
	Cliente titular = new Cliente();

	/*
	 * void significa que quem solicitou a execução do método não irá receber
	 * informação alguma de volta
	 */
	
	void sacarVoid(double valorDoSaque) { //aqui valorDoSaque é classificado como parâmetro ou argumento do método
		/*
		 * no caso o novoSaldo é classificado como uma variável simples temporária por estar sendo
		 * usada dento de um método
		 */
		double novoSaldo = this.saldo - valorDoSaque;
		this.saldo = novoSaldo;
	}
	
	void depositar(double valorDoDeposito){
		this.saldo += valorDoDeposito;
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
	
	void transferir(Conta destinatario, double valor) {
		
		/*
		 * neste caso this se refere ao objeto que chama o método, ou seja a conta de onde
		 * será feita a transferência
		 */
		this.saldo = this.saldo - valor;
		destinatario.saldo = destinatario.saldo + valor;
	}
	
	boolean transferirPara(Conta destinatario, double valor) {
		boolean saldoSuficiente = this.sacarBoolean(valor);
		if(saldoSuficiente) {
			destinatario.depositar(valor);
			return true;
		}else {
			// saque impossível por Saldo Insuficiente
			return false;
		}
	}
	
	
}
