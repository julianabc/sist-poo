package ap2_2021_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tratamento implements Solicitacao{
	List <Solicitacao> solicitacao;
	static int id = 0;
	int cont;
	double custo = 0;
	
	public Tratamento() {
		solicitacao = new ArrayList<Solicitacao>();
		this.cont = id++; 
		
	}
	
	// metodos
	public void adicionaSolicitacao(List lista) {
		solicitacao.addAll(lista);
		this.ordenarLista();	
		
	}
	
	public void adicionaSolicitacao(Solicitacao s) {
		solicitacao.add(s);
		this.ordenarLista();
	}

	
	// chamar classe que ordena lista
	public void ordenarLista() {
		Collections.sort(solicitacao, new CompararCustos());
	}
	
	
	public double custo() {
		return this.custo;
	}
	
	@Override
	public String toString() {
		String retorno = "\nTratamento "+ cont +"{";
		
		for(int i = 0; i < solicitacao.size(); i++) {
			retorno += "\n" + solicitacao.get(i);
		}
		retorno += "\n}";
		return retorno;
		
	} // fim do toString
	
} // fim da classe tratamento
