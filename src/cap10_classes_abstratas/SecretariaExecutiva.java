package cap10_classes_abstratas;

public class SecretariaExecutiva extends Secretaria {

	public SecretariaExecutiva(String name, String cpf, double salary) {
		super(name, cpf, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double setTotalRemuneration() {
		// TODO Auto-generated method stub
		return 0;
	}

}
