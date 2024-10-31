package exerciciosBuilder;

import exerciciosBuilder.Conta.Builder;

public class TesteContasMain {

	public static void main(String[] args) {
		
		Conta conta = new Conta.Builder()
				.numero(0)
				.agencia(001)
				.primeiroTitular(null)
				.abertura(null)
				.gerente(null)
				.saldo(0)
				;
	}
}