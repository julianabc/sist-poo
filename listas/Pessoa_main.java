package listas;

import java.util.ArrayList;
import java.util.List;

public class Pessoa_main {
	public static void main(String[] args) {
		List<Pessoa> listaP = new ArrayList<Pessoa>();
		
		// enchendo a lista manualmente, sem inserção de dados do usuario 
		listaP.add(new Pessoa("Marisa", 54));
		listaP.add(new Pessoa("Carlos", 10));
		listaP.add(new Pessoa("Danielle", 20));
		listaP.add(new Pessoa("Pedro", 32));
		listaP.add(new Pessoa("Clara", 12));
		
		// instanciei o objeto para chamar o metodo criado em pessoa
		Pessoa p = new Pessoa();
		p.sortearPessoa(listaP);

	} // fim do main

} // fim da classe