package listas;

import java.util.List;
import java.util.Random;

public class Pessoa {
	String nome;
	int idade;
	
	
	public Pessoa(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa() {
		// construtor vazio
	}
	
	
	public void sortearPessoa(List<Pessoa> p) {
		Random r = new Random(); // instancio o metodo para aleatorio
		
		int aleatorio = r.nextInt(p.size()); // defino a lista a ser trabalhada
		
		// verifica a maioridade, se for menor tem uma mensagem padrão no else
		if(p.get(aleatorio).idade >= 18) {
			System.out.println(p.get(aleatorio).nome + " tem "+ p.get(aleatorio).idade+ " anos."); 
		}else {
			System.out.println("Nenhuma pessoa! Ela é menor de idade.");
		}
		
				
	} // fim do metodo
	
} // fim da classe
