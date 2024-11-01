package exerciciosCap11;

public class TesteTributavelMain {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Corrente cc = new Corrente(cliente, 123, 1000d);
		
		PessoaFisica beneficiario = new PessoaFisica();
		SeguroVida  seguroVida = new SeguroVida(123, 10000, cliente, beneficiario);
	
		System.out.println("Imposto Seguro de Vida (taxa + 2%) " + seguroVida.getPremio() + " = "+ seguroVida.getValorImposto());
		
		System.out.println("Imposto Conta Corrente (1%) " + cc.getSaldo() + " = "+ cc.getValorImposto());
	}

}
