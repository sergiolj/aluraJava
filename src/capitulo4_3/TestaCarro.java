package capitulo4_3;

public class TestaCarro {
	public static void main(String[] args) {
		Carro meuCarro;
		meuCarro = new Carro();
		
		Carro meuCarro1 =new Carro();
		
		meuCarro1.modelo="Fusca";
		meuCarro1.cor="Amarelo";
		meuCarro1.velocidadeAtual=0;
		meuCarro1.velocidadeMax=100;
		
		meuCarro1.ligar();
		
		meuCarro1.acelerar(60);
		System.out.println((int)meuCarro1.velocidadeAtual+" km/h");
		
		meuCarro1.motor.cilindros=4;
		meuCarro1.motor.tipo="CILINDROS em linha";
		meuCarro1.motor.potencia=72;
		
		meuCarro1.motor.listarCaracteristicas();
	}
	
	
}
