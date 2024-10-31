package capitulo11_1;

public class Diretor extends FuncionarioAutenticavel{
	private int senha;

	public Diretor(String name, String cpf) {
		super(name, cpf);
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return this.senha;
	}
	
	public boolean autenticar(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}

	@Override
	public void autenticar() {
		// TODO Auto-generated method stub
		
	}

}
