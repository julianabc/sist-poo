package ap2_2021_1;

public class Medicamento implements Solicitacao {
	private String principioAtv;
	private double custo;
	
	public Medicamento(String principioAtv, double custo) {
		this.principioAtv = principioAtv;
		this.custo = custo;
	}

	
	// getters and setters
	public String getPrincipioAtv() {
		return principioAtv;
	}

	public void setPrincipioAtv(String principioAtv) {
		this.principioAtv = principioAtv;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	// metodos
	public double custo() {
		
		return this.custo;
	}
	
	@Override
	public String toString() {
		return principioAtv +", "+ this.custo();
		
	}
	


} // fim da classe medicamento
