package exerciciosCap11;

public class SeguroVida extends Seguro implements Tributavel {
	private double taxaFixaSeguro;
	
	
	public SeguroVida(int nroApolice, double  premio, Cliente assegurado, PessoaFisica beneficiario) {
		super(nroApolice, premio, assegurado, beneficiario);
		this.taxaFixaSeguro = 42d;
	}

	@Override
	public double getValorImposto() {
		double valorImposto;
		valorImposto = this.taxaFixaSeguro + super.getPremio() * 0.02;
		return valorImposto;
	}

}
