package exerciciosCap5;

/*O conceito de Singleton é um padrão de projeto de software que garante que uma classe 
 * tenha apenas uma única instância durante toda a execução do programa e fornece um ponto 
 * global de acesso a essa instância. Esse padrão é frequentemente usado em situações em que 
 * é importante garantir que apenas uma instância de um objeto seja criada, como para 
 * gerenciamento de recursos compartilhados ou controle de estado centralizado.
 * 
 */

public class Singleton {
	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}

