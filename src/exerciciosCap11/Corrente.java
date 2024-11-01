package exerciciosCap11;

public class Corrente extends Conta implements Tributavel{

	public Corrente(Cliente cliente, int numero, double saldo) {
		super(cliente, numero, saldo);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
	

}
