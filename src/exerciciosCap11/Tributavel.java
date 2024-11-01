package exerciciosCap11;

public interface Tributavel {
	
	/**
	 * Método referencia a característica de que alguns tipos de aplicações
	 * ou operações financeiras que são sucetíveis a tributação, mas como essas
	 * implementações são muito diferentes cada caso deve ser tratado de forma
	 * diferente. O que todos tem em comum é o valor de imposto recolhido que o métod
	 * deve retornar
	 * @return
	 */
	double getValorImposto();

}
