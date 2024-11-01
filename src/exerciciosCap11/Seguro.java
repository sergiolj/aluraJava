package exerciciosCap11;

public abstract class Seguro {
	private int nroApolice;
	private double premio;
	private Cliente assegurado;
	private PessoaFisica beneficiario;
	
	public Seguro(int nroApolice, double premio, Cliente assegurado, PessoaFisica beneficiario) {
		this.nroApolice = nroApolice;
		this.premio = premio;
		this.assegurado = assegurado;
		this.beneficiario = beneficiario;
	}

	public PessoaFisica getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(PessoaFisica beneficiario) {
		this.beneficiario = beneficiario;
	}

	public double getPremio() {
		return premio;
	}

	public Cliente getAssegurado() {
		return assegurado;
	}
	
	
	
}
