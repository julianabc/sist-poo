package ap2_2021_1;

abstract class Solicitar implements Solicitacao {
	private String nome; 
	private double tempoMedio;
	static double custo = 0; 
	
	public Solicitar(String nome, double tempoMedio) {
		this.nome = nome;
		this.tempoMedio = tempoMedio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTempoMedio() {
		return tempoMedio;
	}

	public void setTempoMedio(double tempoMedio) {
		this.tempoMedio = tempoMedio;
	}
	
	// metodos
	public double custo() {
		double total = this.custo * tempoMedio;
		return total;
	}
	
	@Override
	public String toString() {
		return nome+", "+ this.custo();
		
	}

} // fim da classe
