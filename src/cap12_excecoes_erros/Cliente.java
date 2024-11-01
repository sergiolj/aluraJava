package cap12_excecoes_erros;

import java.util.ArrayList;

public class Cliente {
	private Integer id;
	private String name;
	private static ArrayList<Integer> idClientes;
	
	public Cliente() {}
	
	public Cliente(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		idClientes.add(id);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	/**
	 * O método busca um cliente através do fornecimento de um identificador
	 * e caso encontre retorna o valor cliente, mas e se não for encontrado??
	 * Como trata essa exceção?
	 * @param id
	 * @return
	 */
	public Cliente procuraCliente(Integer id) {
		for(Integer i: idClientes) {
			if(i.equals(id)) {
				Cliente cliente = new Cliente();
				System.out.println(cliente.name);
				return cliente;
			}
			// Esse retorno em caso de erro não é o esperado pelo método e não poderá ser compilado
			return null;
		}
	}
	
	
}
