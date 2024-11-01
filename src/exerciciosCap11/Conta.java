package exerciciosCap11;

public abstract class Conta {
	private static int totalDeContas;
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	
	public Conta(Cliente cliente, int numero, double saldo) {
		this.cliente = cliente;
		this.numero = numero;
		this.saldo = saldo;
	
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}


	public double getSaldo() {
		return saldo;
	}
}
