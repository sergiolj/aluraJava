package capitulo4_3;

public class Motor {
	int potencia;
	int cilindros;
	String tipo;
	
	void listarCaracteristicas() {
		
		// <string>.toLowerCase() ou <string>.toUpperCase
		System.out.println("Tipo motor: "+this.cilindros+" "+this.tipo.toLowerCase());

		System.out.println("Potencia: "+this.potencia+"cv");
	}

}
