package capitulo4_2;

public class Teste {

	public static void main(String[] args) {
		
		// cria uma variável conta1 que referencia uma nova Conta
		Conta conta1 = new Conta();
		/* note que nesse caso o Cliente titular já foi instanciado como
		 * ATRIBUTO da classe conta e não é necessário que seja feita qualquer outra 
		 * adição, a referência entre eles foi criada na classe Conta.
		*/
		conta1.titular.nome = "Sérgio";
		conta1.titular.sobrenome = "Lopes Júnior";
		conta1.titular.cpf = "54554";
		conta1.numero = 101;
		conta1.saldo = 1000;

		System.out.println(conta1.titular.nome+" "
				+ ""+conta1.titular.sobrenome+"\nCPF: "+conta1.titular.cpf);
	}

}
