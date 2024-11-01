package cap11_interfaces;

public class Diretor extends Funcionario{
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

}
