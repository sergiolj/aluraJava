/*
 * Antes da criação das classes propriamente ditas
 * eu criei com auxílio do ASTAH um diagrama de classes que pode
 * inclusive ser exportado para .java criando as estruturas automaticamente
 * ele criou todas com encapsulamento, mas optei por manter sem por enquanto.
 */

package exerciciosCap4;

public class Conta {
	int numero;
	String agencia;
	Cliente primeiroTitular=new Cliente();
	Cliente segundoTitular;
	Data abertura;
	double saldo;
	Gerente gerente=new Gerente();
	ContaEspecial contaEspecial;
	ContaPoupanca contaPoupanca;

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
		System.out.println("Abertura da conta: "+this.abertura.data);
	}

}
