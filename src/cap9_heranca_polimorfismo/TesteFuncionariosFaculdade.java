package cap9_heranca_polimorfismo;

public class TesteFuncionariosFaculdade {

	public static void main(String[] args) {
		ProfessorDaFaculdade professor = new ProfessorDaFaculdade("Sergio Lopes", 10000d, 20);
		EmpregadoDaFaculdade zelador = new EmpregadoDaFaculdade("Daniel de Azevedo", 2800d);
		EmpregadoDaFaculdade recepcionista = new EmpregadoDaFaculdade("Maria da Trindade",3400d);
		Reitor reitor = new Reitor("Agostinho de Jesus", 15000d);
		
		GeradorDeRelatorio gerador = new GeradorDeRelatorio();
	
		gerador.adicionar(professor);
		gerador.adicionar(recepcionista);
		gerador.adicionar(zelador);
		gerador.adicionar(reitor);
		
		
		gerador.listar();
		gerador.totalGastos();
	}
}
