package capitulo7;

public class Funcionario {

	/**
	 *  o protected, o qual fica entre o private e o public. 
	 *  Um atributo protected só pode ser acessado (visível) 
	 *  pela própria classe, suas subclasses e classes 
	 *  encontradas no mesmo pacote.
	 *  O protected é um modificador MENOS RESTRITIVO do que private
	 * 
	 *  NÍVEIS DE RESTRIÇÃO
	 *  sem modificador > public > protected > private
	 */
		protected String nome;
		protected String cpf;
		protected double salario;
		
		/**
		 * O percentual de participação de funcionários é
		 * de 10% enquanto o de Gerente é de 15%, mas como o
		 * Gerente herda todos os métodos vai herdar esse também.
		 * 
		 */
		public double getParticipacaoLucros() {
			return this.salario * 0.10;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		
	}
