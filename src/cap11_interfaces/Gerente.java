package cap11_interfaces;

import java.util.ArrayList;

public class Gerente extends Funcionario{
	private int senha;
	private ArrayList<String> department = new ArrayList<>();

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
	
	public int getSenha() {
		return this.senha;
	}
	
	public boolean autenticar(int senha, String department) {
		if(this.senha == senha) {
			for(String s : this.department) {
				if(s == department) {
					System.out.println("Acesso Autorizado");
					return true;
				}
			}
		}
		System.out.println("Acesso Negado");
		return false;
	}
}
