package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Funcionario> cadastroFun = new ArrayList<Funcionario>();
		int maxCadastro = 5; 
		
		// começa a encher com os dados do funcionario
		System.out.println("Digite as informações do funcionário: ");
		for (int i = 0; i < maxCadastro; i++) {
			
			System.out.println("Digite o nome "+(i+1)+"º funcionário: ");
			String nome = scan.nextLine();
			
			System.out.println("Digite o salário "+(i+1)+"º funcionário: ");
			double salario = Double.parseDouble(scan.nextLine());	// necessario conversão pois o que o usuario digita é uma string e estamos trabalhando com double
			
			
			// encher lista (o objeto foi criado dentro da lista para encher com o for)
			cadastroFun.add(new Funcionario(nome, salario));
			
		} // fim do for
		
		// instanciei objeto para chamar os metodos e imprimir na tela
		Funcionario chamarImpressao = new Funcionario();
		
		System.out.println("Impressões: ");
		// nome do menor salário
		chamarImpressao.menorSalario(cadastroFun);
		
		// nome do maior salário
		chamarImpressao.maiorSalario(cadastroFun);
		
		// media dos salários
		chamarImpressao.definirMedia(cadastroFun);
		
		
	} // fim do main

} // fim da classe

