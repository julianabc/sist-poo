package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Funcionario> cadastroFun = new ArrayList<Funcionario>();
		int maxCadastro = 5; 
		
		// come�a a encher com os dados do funcionario
		System.out.println("Digite as informa��es do funcion�rio: ");
		for (int i = 0; i < maxCadastro; i++) {
			
			System.out.println("Digite o nome "+(i+1)+"� funcion�rio: ");
			String nome = scan.nextLine();
			
			System.out.println("Digite o sal�rio "+(i+1)+"� funcion�rio: ");
			double salario = Double.parseDouble(scan.nextLine());	// necessario convers�o pois o que o usuario digita � uma string e estamos trabalhando com double
			
			
			// encher lista (o objeto foi criado dentro da lista para encher com o for)
			cadastroFun.add(new Funcionario(nome, salario));
			
		} // fim do for
		
		// instanciei objeto para chamar os metodos e imprimir na tela
		Funcionario chamarImpressao = new Funcionario();
		
		System.out.println("Impress�es: ");
		// nome do menor sal�rio
		chamarImpressao.menorSalario(cadastroFun);
		
		// nome do maior sal�rio
		chamarImpressao.maiorSalario(cadastroFun);
		
		// media dos sal�rios
		chamarImpressao.definirMedia(cadastroFun);
		
		
	} // fim do main

} // fim da classe

