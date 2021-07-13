package ap2_2021_1;

public class Exame extends Solicitar{
	static double custo = 20;
	
	public Exame(String nome, double tempoMedio) {
		super(nome, tempoMedio);
		
	}
	
	// metodos
	public double custo() {
		double total = this.custo * this.getTempoMedio();
		return total;
	}

} // fim da classe exame
