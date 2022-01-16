package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeMap {
	
	public TreeMap() {
		// construtor vazio, apenas para chamar o metodo a ser trabalhado
	}
	
	// metodo de decriptação de mensagem
	public void decriptarMsg(Map<Integer, String> map, List<Integer> lista) {
		String frase = ""; // declara a variavel que irá imprimir o que foi pedido
		
		// varre a lista passada como parametro, buscando os valores
		for(int i = 0; i < lista.size(); i++) {
			
			frase += map.get(lista.get(i)); // os valores são alocados na variável já declarada
			
		} // fim do for
		
		// impressão do resultado
		System.out.println("A mensagem é: "+ frase);
		
	} // fim do metodo
	
	
	/* Inicio do main: */
	public static void main (String[] args) {
		Map<Integer, String> mapaChar = new HashMap<>();
	
		//List<Integer> listaMsg = Arrays.asList(new Integer[mapaChar.size()]); 
		
		List<Integer> listaMsg = new ArrayList<Integer>(Arrays.asList(new Integer[mapaChar.size()])); // o tamanho max da lista será o tamanho que ficará o map
		
		// criação da tabela (de acordo com o exemplo da atividade)
		mapaChar.put(0, " ");
		mapaChar.put(1, "a");
		mapaChar.put(2, "b");
		mapaChar.put(3, "c");
		mapaChar.put(4, "d");
		mapaChar.put(5, "e");
		mapaChar.put(6, "f");
		mapaChar.put(7, "g");
		mapaChar.put(8, "h");
		mapaChar.put(9, "i");
		mapaChar.put(10, "j");
		mapaChar.put(11, "k");
		mapaChar.put(12, "l");
		mapaChar.put(13, "m");
		mapaChar.put(14, "n");
		mapaChar.put(15, "o");
		mapaChar.put(16, "p");
		mapaChar.put(17, "q");
		mapaChar.put(18, "r");
		mapaChar.put(19, "s");
		mapaChar.put(20, "t");
		mapaChar.put(21, "u");
		mapaChar.put(22, "v");
		mapaChar.put(23, "w");
		mapaChar.put(24, "x");
		mapaChar.put(25, "y");
		mapaChar.put(26, "z");
		
		// adicionando numeros a lista (de acorod com o exemplo da atividade)
		listaMsg.add(19);
		listaMsg.add(13);
		listaMsg.add(5);
		listaMsg.add(12);
		listaMsg.add(12);
		listaMsg.add(19);
		listaMsg.add(0);
		listaMsg.add(12);
		listaMsg.add(9);
		listaMsg.add(11);
		listaMsg.add(5);
		listaMsg.add(0);
		listaMsg.add(19);
		listaMsg.add(16);
		listaMsg.add(9);
		listaMsg.add(18);
		listaMsg.add(9);
		listaMsg.add(20);
		
		
		// instanciando objeto para chamar o metodo
		TreeMap tm = new TreeMap();
		
		// chamada do metodo
		tm.decriptarMsg(mapaChar, listaMsg);
		
	} // fim do main
	
	
} // fim da classe

