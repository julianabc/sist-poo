package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vector {
	
	public Vector() {
		// construtor vazio, apenas para chamar o metodo
	}
	
	
	// metodo para remover nomes que tem letra passada por parametro
	public void removerNome(List<String> lista, String s) {
		// todo nome que iniciar com a letra passada por parâmetro, será removido da lista
		lista.removeIf(n -> n.startsWith(s));
		
	}
	
	public void addNome(List<String> lista, String nome) {
		// verifica o tamanho da lista, caso seja menor que 15 adiciona o nome
		if(lista.size() < 15) {
			lista.add(nome);
		} // fim do if
	} // fim do metodo
	
	
	
	
	/* INICIO DO MAIN: */
	public static void main(String[] args) {
		List<String> listaNomes = new ArrayList<String>(); // criação da lista
		Scanner scan = new Scanner(System.in); // pegar nomes do usuario 
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+"º nome: ");
			String nome = scan.nextLine();
			
			// encher lista com os nomes fornecidos
			listaNomes.add(nome);
			
		} // fim do for
		
		
		// imprimir nomes da lista
		System.out.println("\nLista de nomes: ");
		listaNomes.forEach(System.out::println);
		System.out.println();
		
		// instanciar objeto para chamar os metodos
		Vector v = new Vector();
		
		/* já que a lista foi feita de forma dinâmica, as chamadas aos metodos com os parametros também foi feita da mesma forma: */
		
		// o metodo remove da lista todos que iniciam com a letra passada por paramtro, que neste caso, a fim de exemplificar é a letra A
		System.out.println("Digite a inicial do nome(s) que deseja eliminar: ");
		String letra = scan.nextLine();
		v.removerNome(listaNomes, letra.toUpperCase()); // a letra sempre vai ser maiuscula visto que é a primeira letra do nome 
		
		// adicionar o nome caso a lista tenha menos que 15 elementos
		System.out.println("Digite um nome: ");
		String nome = scan.nextLine();
		v.addNome(listaNomes, nome);
		
		
		// repetir impressão para ver o resultado final:
		System.out.println("\nLista de nomes atualizada: ");
		listaNomes.forEach(System.out::println);
		
	} // fim do metodo main

	
	
} // fim da classe

