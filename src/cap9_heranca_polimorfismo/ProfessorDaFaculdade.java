package cap9_heranca_polimorfismo;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
	private int horasDeAula;
	private double valorHora=10;
	
	public ProfessorDaFaculdade(String nome, double salario, int horasDeAula) {
		super(nome, salario);
		this.horasDeAula = horasDeAula;
	}
	
	public int getHorasDeAula() {
		return this.horasDeAula;
	}
	
	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}
	
	@Override
	public double getGastos() {
		return super.getSalario() + this.horasDeAula * this.valorHora;
	}
	
	@Override
	public String getInfo() {
		/**
		 * O método getInfo foi reescrito mas só parcialmente, o que levou a necessidade
		 * de usar o getInfo da classe super como referência
		 */
		String informacaoBasica = super.getInfo();
		String informacao = informacaoBasica + " e adicional de " + 
		this.horasDeAula +" h/aula no valor de R$ " + this.horasDeAula * this.valorHora + " Total R$: "+
				getGastos();
		
		return informacao;
	}
}
