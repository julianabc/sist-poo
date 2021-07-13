package ap2_2021_1;

import java.util.Comparator;

public class CompararCustos implements Comparator<Solicitacao> {
	
	public int compare(Solicitacao s1, Solicitacao s2) {
		if(s1.custo() > s2.custo()) {
			return -1;
			
		}else if(s1.custo() < s2.custo()) {
			return 1; 
			
		}else {
			return 0; 
		}
	 
	} // fim do metodo

} // fim da classe
