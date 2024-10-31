package capitulo11_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerente extends FuncionarioAutenticavel{
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
	
	@Override
	public void autenticar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a senha: ");
		int senha = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe o departamento: ");
		String department = sc.nextLine();
		if(this.senha == senha) {
			for(String s : this.department) {
				/*
				 * para comparar duas strings a opção == não funciona, pois
				 * está comparando os objetos e não o conteúdo das strings, para isso é
				 * necessário usar String.equals(String)
				 */
				if(s.equals(department)) {
					System.out.println("Acesso Autorizado");
					return;
				}
			}
		}
		
		System.out.println("Acesso Negado");
		sc.close();
	}
}
