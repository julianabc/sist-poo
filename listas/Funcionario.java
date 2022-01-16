package listas;

import java.util.List;


//primeira quest�o
public class Funcionario { 
	String nome;
	double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	
	}

	public Funcionario() {
		// construtor vazio apenas para chamar os metodos sem necessidade de passar parametros
	}
	
	
	// metodos
	
	// c - imprima o nome do funcionario com o menor sal�rio:
	public void menorSalario(List<Funcionario> f) {
		double menor = f.get(0).salario; // defini��o de variavel com o primeiro salario da lista
		String nomeMenor = null;
		
		for(int i = 1; i < f.size(); i++) { // come�o a partir do 1 para comparar a partir disso
			
			// define o menor salario e o nome ao qual ele pertence
			if(menor > f.get(i).salario ) {
				menor = f.get(i).salario;
				nomeMenor = f.get(i).nome;
			}
		
		} // fim do for
		
		// impress�o do resultado
		System.out.println(nomeMenor + " recebe o menor sal�rio");
		
	} // fim do metodo
	
	
	// d - imprima o nome do funcionario com o maior sal�rio:
	public void maiorSalario(List<Funcionario> f) {
		double maior = f.get(0).salario; // definindo com o primeiro salario da lista
		String nomeMaior = null; 
		

		for(int i = 1; i < f.size(); i++) { // come�o a partir do 1 para comparar a partir disso
			
			// define o menor salario e o nome ao qual ele pertence
			if(maior < f.get(i).salario ) {
				maior = f.get(i).salario;
				nomeMaior = f.get(i).nome;
			}
		
		} // fim do for
		
		// impress�o do resultado
		System.out.println(nomeMaior + " recebe o maior sal�rio");
		
	} // fim do metodo
	
	
	// e - imprima a m�dia dos sal�rios informados
	public void definirMedia(List<Funcionario> f) {
		double soma = 0;
		
		for(int i = 0; i < f.size(); i++) {
			soma += f.get(i).salario;
		}
		
		double media = Math.round(soma/f.size()); // arrendodar m�dia para baixo, deixando apenas uma casa decimal 
		
		// impress�o do resultado
		System.out.println("A m�dia dos sal�rios �: "+ media);
	} // fim do metodo
	

} // fim da classe