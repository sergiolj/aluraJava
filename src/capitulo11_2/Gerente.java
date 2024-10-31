package capitulo11_2;

import java.util.ArrayList;

public class Gerente extends Funcionario implements Autenticavel{
	private int senha;
	/**
	 * ArrayList para amazenar a lista de departamentos que o gerente é responsável
	 */
	private ArrayList<String> department = new ArrayList<>();

	public Gerente() {
		super();
	}
	
	public Gerente(String name, String cpf, int senha) {
		super(name, cpf);
		this.senha = senha;
	}
	
	public void addDepartment(String department) {
		this.department.add(department);
	}
	
	public void listDepartment() {
		for(String s: this.department) {
		System.out.print(s + " | ");
		}
		System.out.println();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean autenticar(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}

	@Override
	public ArrayList<String> getDepartment() {
		return this.department;
	}
}
