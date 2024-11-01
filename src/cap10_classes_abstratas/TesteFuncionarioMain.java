package cap10_classes_abstratas;

public class TesteFuncionarioMain {

	public static void main(String[] args) {
		//Funcionario funcionario = new Funcionario();
		Gerente gerente = new Gerente("Marcelo Madureira", "54545454" , 20000);
		
		Presidente presidente = new Presidente("Helio Dell a Penha", "3232323", 50000);
		
		Diretor diretor = new Diretor("Ney Latorraca", "323424453", 10000);
		
		ControleDeBonificacoes totalBonus = new ControleDeBonificacoes();
		
		totalBonus.registrar(diretor);
		totalBonus.registrar(presidente);
		totalBonus.registrar(gerente);
		
		System.out.println(diretor.getBonificacao());
		System.out.println(gerente.getBonificacao());
		System.out.println(presidente.getBonificacao());
		
		System.out.println(totalBonus.getTotalDeBonificacoes());
		

		
	}

}
