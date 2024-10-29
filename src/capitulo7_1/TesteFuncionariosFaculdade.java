package capitulo7_1;

public class TesteFuncionariosFaculdade {

	public static void main(String[] args) {
		ProfessorDaFaculdade professor = new ProfessorDaFaculdade();
		professor.setSalario(10000d);
		professor.setHorasDeAula(20);
		professor.setNome("Sergio Lopes");
		
		System.out.println(professor.getInfo());

	}

}
