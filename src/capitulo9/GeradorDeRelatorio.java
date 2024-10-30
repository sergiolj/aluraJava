package capitulo9;

import java.util.ArrayList;

public class GeradorDeRelatorio {
	private ArrayList<String> nome = new ArrayList<>();
	private ArrayList<Double> gastos = new ArrayList<>();
	
	public void adicionar(EmpregadoDaFaculdade e) {
		nome.add(e.getInfo());
		gastos.add(e.getGastos());
	}
	
	
	public ArrayList<String> getNome() {
		return nome;
	}


	public void setNome(ArrayList<String> nome) {
		this.nome = nome;
	}


	public ArrayList<Double> getGastos() {
		return gastos;
	}


	public void setGastos(ArrayList<Double> gastos) {
		this.gastos = gastos;
	}

	public void listar() {
		System.out.println("Listagem de Funcionários");
		for(String s : this.nome) {
			System.out.print(s+" | \n");
		}
	}
	
	public void totalGastos() {
		double sum=0;
		for(Double d: gastos) {
			sum += (double) d;
		}
		System.out.println("\nTotal de gastos com folha de pagamento R$: " + sum);
	}
}

