package ap2_2021_1;

public class Cirurgia extends Solicitar{
	static double custo = 100;

	public Cirurgia(String nome, double tempoMedio) {
		super(nome, tempoMedio);
	}

	// metodos
	public double custo() {
		double total = this.custo * this.getTempoMedio();
		return total;
	}
	

	
} // fim da classe cirurgia
