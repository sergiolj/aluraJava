package capitulo5_1;

public class TesteContasStatic {
	public static void main(String[] args) {
		
		System.out.println(Conta.getTotalDeContas());
		Conta c1 = new Conta();
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Conta c2 = new Conta(1, cliente1);
		
		Conta c3 = new Conta(cliente2);
		
		
		int totalContas=Conta.getTotalDeContas();
		System.out.println(totalContas);
	}

}	
