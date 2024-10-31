package capitulo11_2;

import java.util.ArrayList;

public interface Autenticavel {
	
	/**
	 * Declara o método autenticar que deve ser implementado nas classes
	 * que implementarem a interface - Gerente e Diretor
	 * @param senha
	 * @return
	 */
	boolean autenticar (int senha);
	
	/**
	 * Declara o método que define a senha da Classe
	 * @param senha
	 */
	void setSenha(int senha);
	
	/**
	 * Método que retorna o ArrayList de departamentos ao qual Gerentes e Diretores
	 * estão vinculados
	 * @return
	 */
	ArrayList<String> getDepartment();
	
	/**
	 * Método para adicionar departamentos à lista de departamentos
	 * que Gerentes e Diretores estão vinculados
	 * @param department
	 */
	public void addDepartment(String department);
	
	/**
	 * Método para listar os departamentos que Gerentes e Diretores
	 * são responsáveis
	 */
	public void listDepartment();
	
}
