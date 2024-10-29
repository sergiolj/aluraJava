package capitulo7;

public class ControleDeBonificacoes {
	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getParticipacaoLucros();
	}
	
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
