package capitulo5_1;

public class TesteContasStatic {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		Cliente cliente = new Cliente();
		Conta c2 = new Conta(1, cliente);
		
		int totalContas=Conta.getTotalDeContas();
		System.out.println(totalContas);
	}

}	
