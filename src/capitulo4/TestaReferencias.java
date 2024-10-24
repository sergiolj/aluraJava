package capitulo4;

public class TestaReferencias {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.depositar(200);
		
		/*
		 * como as variáveis apenas referenciam um objeto do tipo conta 
		 * a instrução abaixo indica que a referencia de c2 é igual a referencia de c1
		 * ou seja, ambos apontam para o mesmo objeto ou instância 
		 */
		Conta c2 = c1;
		
		/* 
		 * um novo objeto ou instância da classe Conta só pode ser criado
		 * através da instrução new. Essa instrução executa várias tarefas
		 * e por fim devolve um valor de referência para o objeto.
		 */
		Conta c3 = new Conta();
		
		c2.depositar(200);
		c3.depositar(500);
		
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		System.out.println(c3.saldo);
		
		
		Conta conta1 = new Conta();
		conta1.numero=101;
		conta1.titular="João";
		conta1.saldo=1000;
		
		Conta conta2 = new Conta();
		conta2.numero=101;
		conta2.titular="João";
		conta2.saldo=1000;
		
		if(conta1 == conta2) {
			System.out.println("As contas são iguais");
		}else {
			System.out.println("As contas são DIFERENTES!");
		}
		
		conta1.transferir(conta2, 500);
		
		System.out.println(conta1.saldo);
		System.out.println(conta2.saldo);
		
		if(conta2.transferirPara(conta1, 1300)) {
			System.out.println("Transferência concluída com sucesso");
		}else {
			System.out.println("Transferência NÃO concluída.");
		}
		
		System.out.println(conta1.saldo);
		
		conta1.transferirPara(conta2, 100);
	}
}
