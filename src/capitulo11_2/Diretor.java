package capitulo11_2;

import java.util.ArrayList;

public class Diretor extends Funcionario implements Autenticavel{
	private int senha;
	private ArrayList<String> department = new ArrayList<>();

	public Diretor () {
		super();
		this.department  = new ArrayList<String>();
	}
	
	public Diretor(String name, String cpf) {
		super(name, cpf);
		this.department  = new ArrayList<String>();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autenticar(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
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
	
	@Override
	public ArrayList<String> getDepartment() {
		return this.department;
	}

}
