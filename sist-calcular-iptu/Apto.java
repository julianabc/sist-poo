package ap1_2021_1;

import java.time.LocalDate;
import java.util.Date;

public class Apto extends Imovel{
	private int quant_quartos;
	private String local_apt;
	
	public Apto(int metragem, String data, String localizacao, int quant_quartos, String local_apt) {
		super(metragem, data, localizacao);
		this.quant_quartos = quant_quartos;
		this.local_apt = local_apt;
	}
	

	// getters and setters 
	public int getQuant_quartos() {
		return quant_quartos;
	}

	public void setQuant_quartos(int quant_quartos) {
		this.quant_quartos = quant_quartos;
	}

	public String getLocal_apt() {
		return local_apt;
	}

	public void setLocal_apt(String local_apt) {
		this.local_apt = local_apt;
	}
	
	
	public double getValorIPTU() {
		double aliquota = 0.1;
		
		if(quant_quartos <= 2 && local_apt == "fundos") {
			aliquota = 0.05;
			super.setAliquota(aliquota);
		}
		
		return super.getValorIPTU();
					
	} 
	
	

} // fim da classe Apto
