package ap1_2021_1;

import java.time.LocalDate;
import java.util.Date;

public class Loja extends Imovel {
	private boolean shopping;

	public Loja(int metragem, String data, String localizacao, boolean shopping) {
		super(metragem, data, localizacao);
		this.shopping = shopping;
	}

	public boolean isShopping() {
		return shopping;
	}

	public void setShopping(boolean shopping) {
		this.shopping = shopping;
	} 
	
	public double getValorIPTU() {
		double aliquota = 0.1;
		if(shopping == false) {
			aliquota = 0.08;
			super.setAliquota(aliquota);
		}
		
		return super.getValorIPTU();
		
	} 
	
} // fim da classe Loja
