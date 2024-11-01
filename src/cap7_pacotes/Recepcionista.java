package cap7_pacotes;

public class Recepcionista extends Funcionario{
	@Override
	public double getParticipacaoLucros() {
		// TODO Auto-generated method stub
		return this.salario * 0.01;
	}
}
