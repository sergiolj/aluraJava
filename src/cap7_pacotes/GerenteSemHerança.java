package cap7_pacotes;

public class GerenteSemHerança {
		private String nome;
		private String cpf;
		private double salario;
		private int senha;
		private int numeroDeFuncionariosGerenciados;
		
		public boolean autenticar(int senha) {
			if (this.senha == senha) {
				System.out.println("Acesso Permitido.");
				return true;
			}else {
				System.out.println("Acesso Negado!");
				return false;
			}
		}

}
