package cap12_excecoes_erros;

public class TesteErro {
	public static void main(String[] args) {

		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}
	static void metodo1() {
		System.out.println("Início método 1");
		metodo2();
		System.out.println("Fim método 1");
	}
	
	/*
	 * Método 2 contém um erro proposital ao chegar ao indice i == 5
	 * ele passa a mudar a referência da variável cc que não aponta mais para
	 * um objeto Conta()
	 */

	static void metodo2() {
	      System.out.println("inicio do metodo2");
	      Conta cc = new Conta();
	      for (int i = 0; i <= 15; i++) {	
	          cc.depositar(i + 1000);
	          System.out.println(cc.getSaldo());
	          if (i == 5) {
	              cc = null;
	          }
	      }
	      System.out.println("fim do metodo2");
	  }
}


try { 
	for (int i = 0; i <= 15; i++) {
		cc.deposita(i + 1000);
		System.out.println(cc.getSaldo());
		if (i == 5) {
			cc = null; 
			} 
		} 
	} catch (NullPointerException e) {
		System.out.println("erro: " + e); 
	}