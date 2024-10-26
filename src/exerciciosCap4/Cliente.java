package exerciciosCap4;

public class Cliente extends PessoaFisica{
	

	public void solicitarCredito(double valor) {

	}

	public void exibirDadosCadastrais() {
		System.out.println("\nNome: "+this.nome+" "+this.sobrenome);
		System.out.println("CPF: "+this.CPF);
		System.out.println("Data Nascimento: "+this.dataNasc);
		System.out.println("Telefone de contato: "+this.telefone);
		System.out.println("Endereço: "+this.endereco);
	}
}