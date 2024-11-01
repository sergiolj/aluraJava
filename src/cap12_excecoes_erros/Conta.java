package cap12_excecoes_erros;

public class Conta {
	private String cliente;
	private double saldo;
	private double limite;
	private double disponivel;
	
	public Conta() {}
	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
		this.limite = 0;
		this.saldo = 0;
		this.disponivel = this.saldo + this.limite;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getCliente() {
		return cliente;
	}

	public double getDisponivel() {
		this.disponivel = this.saldo + this.limite;
		return disponivel;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public boolean sacar(int valor) {
		if((this.disponivel - valor) >= 0) {
			this.saldo -= valor;
			System.out.println("Valor disponibilizado");
			return true;
		}
		System.out.println("Saldo insuficiente");
		return false;
	}

	public boolean depositar(double deposito) {
		if(deposito > 0) {
			this.saldo += deposito;
			System.out.println("Operação efetuada com sucesso!");
			return true;
		}
		System.out.println("Valor inválido!");
		return false;
	}
	
}
