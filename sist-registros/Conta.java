package ap2_2021_1;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	int num;  
	int quantidade_ocorrencias;
	List<Integer> linhas = new ArrayList<Integer>();
	
	public Conta(int num, int linha) {
		this.num = num;
		this.quantidade_ocorrencias = 1;
		linhas.add(new Integer(linha));
	
	}
	
	
	// metodos
	public void calcularOcorrencias() {
		this.quantidade_ocorrencias++;
	}
	
	
	public String toString(){    
		return num + " ";  
	}
	
	
} // fim da classe Conta
