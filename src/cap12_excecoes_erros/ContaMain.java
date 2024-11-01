package cap12_excecoes_erros;

/*
 * Modelo de implantação de erros apenas 
 * tratando o boolean de retorno do método, esse é um modelo pouco efetivo
 * Pois esse tratamento pode não ser implementado pela chamada do método
 */
public class ContaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta cc = new Conta("Sérgio Lopes" , 0);
		
		cc.depositar(-200);
		cc.setLimite(200);
		
		System.out.println(cc.getDisponivel());
		cc.depositar(300);
		
		System.out.println(cc.getDisponivel());
		
		/*
		 * O if funciona com o inverso do resultado da instrução, caso sacar(600) retorne false
		 * ou seja, não foi possível de ser efetuado o if será true retornando Saque não efetuado.
		 */
		
		if(!cc.sacar(600)) {
			//instruções para não efetuar o saque
			System.out.println("Saque não efetuado");
		}else {
			//instruções para o caixa eletronico contar as cédulas e disponibilizar
			System.out.println("Saque efetuado");
		}
		
		System.out.println(cc.getSaldo());
		System.out.println(cc.getDisponivel());
		
	}

}
