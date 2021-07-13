package ap1_2021_1;

import java.util.ArrayList;
import java.util.List;

import ad12021.Post;

public class Imoveis {
	private int quant;
	private List <Imovel> imoveis = new ArrayList<Imovel>();
	
	public Imoveis(int quant) {
		this.quant = quant;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	public List<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(List<Imovel> imoveis) {
		this.imoveis = imoveis;
	}

	public void adicionaImovel(Imovel i) {
		this.getImoveis().add(i);
	}
	
	
	public double calculaIPTUTotal() {
		double total = 0;
		for(int i = 0; i < imoveis.size(); i++) {
			total += imoveis.get(i).getValorIPTU();
		}
		
		return total;
	}
	

} // fim da classe
