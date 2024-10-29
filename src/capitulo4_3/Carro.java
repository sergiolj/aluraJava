package capitulo4_3;
/**
 * Esse é minha primera documentação referente a um 
 * algoritmo que eu tenha feito
 * @author Sérgio Lopes Júnior
 * @version 1.0
 */

public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMax;
	Motor motor=new Motor();

	//liga o carro
	void ligar() {
		System.out.println("O carro está ligado");
	}
	
	//acelera o carro a uma certa quantidade
	void acelerar(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	/*resposta do controle do cambio automático para o mostrador
	 * do painel de instrumentos método retorna inteiro
	 */
	int pegarMarcha() {
		if(this.velocidadeAtual < 0) {
			return -1; // marcha à ré
		}
		if(this.velocidadeAtual >=0 && this.velocidadeAtual < 40) {
			return 1; //primeira marcha
		}
		if (this.velocidadeAtual >=40 && this.velocidadeAtual <80) {
			return 2;// marcha média
		}
		if(this.velocidadeAtual>=80) {
			return 3; //marcha máxima
		}
		return 4; //parking
	}

}

