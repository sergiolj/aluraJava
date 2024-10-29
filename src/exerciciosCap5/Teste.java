package exerciciosCap5;

class Teste {
	/*
	 * se um atributo não tiver nenhum modificador de acesso o mesmo
	 * não pode ser usado em um método estático
	 */
	// int x=37;
	static int x = 37;
	public static void main(String [] args) {
		System.out.println(x);
		
		Data data = new Data();

		System.out.println(data.isBissexto(2000));
		Data datac = new Data(29,02,2024);
		System.out.println(datac.getData());
		System.out.println(datac.toString());
	}
}