package cap7_pacotes;
/**
 * Uma classe pode ter várias filhas, mas apenas uma mãe, 
 * ou seja a classe só pode extender uma classe.
 */

	public class Gerente extends Funcionario {
			private int senha;
			private int numeroDeFuncionariosGerenciados;
			
			public int getSenha() {
				return this.senha;
			}
			
			public void setSenha(int senha) {
				this.senha=senha;
			}
			
			public boolean autenticar(int senha) {
				if (this.senha == senha) {
					System.out.println("Acesso Permitido.");
					return true;
				}else {
					System.out.println("Acesso Negado!");
					return false;
				}
			}
			/**
			 * Ao usar a anotação Override estamos indicando que estamos sobreescrevendo
			 * o método de mesmo nome que seria herdado da superclasse
			 * e personalizando ele para a particularidade do gerente
			 * que tem um percentual maior de participação nos lucros.
			 * 
			 * O compilador verifica o método indicado como Override, caso
			 * ele não corresponda em nome e tipo exatamente o compilador gerará um erro.
			 * Seu uso é considerado boa prática e melhora a legibiliadde do código
			 * 
			 * O Override permite um retorno mais específico do que o da superclasse
			 * se a superclasse retorna um Animal o override pode retornar Cachorro.
			 * Assim como pode ter um modificador de acesso menos restritivo.
			 */
			@Override
			public double getParticipacaoLucros() {
				return this.salario * 0.15;
			}
			/**
			 * Também é possível usar o identificador super antes do método
			 * para indicar que o mesmo irá usar o método da superclasse
			 * e não o método que foi sobreescrito
			 * @return
			 */
			
			public double getBonificacaoGerente() {
				return super.getParticipacaoLucros() + 1000;
			}
	}
