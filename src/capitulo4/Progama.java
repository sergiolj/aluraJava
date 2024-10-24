package capitulo4;

public class Progama {
	public static void main(String[] args) {
		
		Conta minhaConta; // cria uma variável de referência do tipo Conta
		
		/*
		 * cria uma instância de uma Conta vinculada à variável de 
		 * referência minhaConta. 
		 * É comum chamar essa referência de objeto ou instância, mas na realidade
		 * ela só referencia um objeto do tipo Conta.
		 */
		minhaConta = new Conta(); 
		
		minhaConta.titular="Sérgio Lopes Júnior";
		minhaConta.saldo=1000d;
		minhaConta.numero=10524;
		
		//neste caso o método não retorna informação alguma
		minhaConta.sacarVoid(200);
		
		minhaConta.depositar(500);
		
		System.out.println(minhaConta.saldo);
		
		/*
		 * usando um if boleano com a informação que retorna do método
		 * embora funcione a lógica não parece muito clara, pois pode não
		 * haver indicação no nome do método de que ele retorna algo
		 */
		if(minhaConta.sacarBoolean(1500)) {
			System.out.println("Saque efetivado com sucesso.");
		}else {
			System.out.println("Saque não permitido. Saldo Insuficiente.");
		}
	}
}
