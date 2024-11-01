package cap5_modificadores_acesso;

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

	
	void sacarVoid(double valorDoSaque) { 
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
		this.saldo = this.saldo - valor;
		destinatario.saldo = destinatario.saldo + valor;
	}
	
	boolean transferirPara(Conta destinatario, double valor) {
		boolean saldoSuficiente = this.sacarBoolean(valor);
		if(saldoSuficiente) {
			destinatario.depositar(valor);
			return true;
		}else {
			return false;
		}
	}
	
	
}
