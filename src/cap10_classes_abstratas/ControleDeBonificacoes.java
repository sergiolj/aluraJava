package cap10_classes_abstratas;

public class ControleDeBonificacoes {
	
	private double totalDeBonificacoes = 0;
	
	public void registrar(Funcionario f) {
		
		// o atributo f.name pode ser invocado diretamente por ser protected
		System.out.println("Adicionando bonificação do " + f.name);
		
		/*
		 *  o f.getBonificacao() é a classe abstrata criada em Funcionario, que por
		 *  ser abstrata obriga as classes filhas a implementá-la
		 */
				this.totalDeBonificacoes += f.getBonificacao();
	}
	
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}

}
