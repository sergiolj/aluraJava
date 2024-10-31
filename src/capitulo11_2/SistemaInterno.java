package capitulo11_2;

import java.util.Scanner;

public class SistemaInterno {

	public void login(Autenticavel a) {
		int senha;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a senha: ");
		senha = sc.nextInt();
		sc.nextLine();
		System.out.println("Informe o departamento: ");
		String department = sc.nextLine();
			if(a.autenticar(senha)) {
				for(String s : a.getDepartment()) {
					if(s.equals(department)) {
						System.out.println("Acesso Autorizado");
						sc.close();
						return;
					}
				}
			}
			System.out.println("Acesso Negado");
			sc.close();
	}
}

