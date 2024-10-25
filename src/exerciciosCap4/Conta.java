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
	Cliente primeiroTitular;
	Cliente segundoTitular;
	String dataAbertura;
	double saldo;
	Gerente gerente;
	ContaEspecial contaEspecial;
	ContaPoupanca contaPoupanca;

	public void sacar(double valor) {

	}

	public void depositar(double valor) {

	}

	public void consultarSaldo() {

	}

	public void transferirValores(Conta numero, double valor) {

	}

}
