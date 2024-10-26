package capitulo5_1;

public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	private Data nascimento;
	private int idade;
	
	//CONSTRUTOR
	Cliente(){}
	Cliente(String nome, String sobrenome, String cpf, Data nascimento){
		if(validarCPF(cpf)) {
			this.cpf=cpf;
			this.nome=nome;
			this.sobrenome=sobrenome;
			this.nascimento=nascimento;
		}
	}
	
	//MÉTODOS
	public void mudarCPF(String cpf) {
		if(this.idade <= 60) {
			validarCPF(cpf);
		}
		this.cpf=cpf;
	}
	
	public boolean validarCPF(String cpf) {
		//regras de validação
		return true;
	}
	
	public void atualizarIdade(Data nascimento) {
		//this.idade = 
		
	}
}
