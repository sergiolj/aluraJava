package cap10_classes_abstratas;

public class TestePessoasMain {

	public static void main(String[] args) {
		/**
		 * Veja que não faz sentido aqui termos uma instância Pessoa
		 * mas sim as subclasses Pessoa Física e Pessoa Jurídica
		 * Neste caso poderíamos usar uma classe abstrata, pois essa classe
		 * apenas herda algumas coisas e permite o polimorfismo, mas não
		 * será instanciada, pois não faz sentido.
		 */
		
		// ao tornar a classe abstract pessoa não pode ser mais instanciada
		Pessoa pessoa = new Pessoa();
		
		
		PessoaFisica pf = new PessoaFisica();
		
		PessoaJuridica pj = new PessoaJuridica();
		
	}

}
