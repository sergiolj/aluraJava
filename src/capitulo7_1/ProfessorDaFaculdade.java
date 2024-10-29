package capitulo7_1;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
	private int horasDeAula;
	private double valorHora=10;
	
	public int getHorasDeAula() {
		return this.horasDeAula;
	}
	
	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}
	
	@Override
	public double getGastos() {
		return this.getSalario() + this.horasDeAula * this.valorHora;
	}
	
	@Override
	public String getInfo() {
		/**
		 * O método getInfo foi reescrito mas só parcialmente, o que levou a necessidade
		 * de usar o getInfo da classe super como referência
		 */
		String infromacaoBasica = super.getInfo();
		String informacao = infromacaoBasica + " e adicional de " + 
		this.horasDeAula +" h/aula no valor de R$ " + this.horasDeAula * this.valorHora + "\nTotal R$: "+
				getGastos();
		
		return informacao;
	}
}
