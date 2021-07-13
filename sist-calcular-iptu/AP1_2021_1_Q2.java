package ap1_2021_1;

public class AP1_2021_1_Q2 {
	public static void main(String[] args) {
		
		Imovel i1 = new Imovel(100, "1/1/1980", "centro");
		System.out.println("IPTU do imóvel "+ i1.getCodigo() + ": R$ "+ i1.getValorIPTU()); // ainda é necessario resolver em relação ao codigo
		
		Imovel i2 = new Apto(100, "1/1/1980", "periferia", 2, "fundos");
		Imovel i3 = new Loja(100, "1/1/1980", "centro", false);
	
		Imoveis propriedades = new Imoveis(1000);
		
		propriedades.adicionaImovel(i1);
		propriedades.adicionaImovel(i2);
		propriedades.adicionaImovel(i3);
		
		System.out.println("Total do IPTU a ser arrecadado: R$ "+ propriedades.calculaIPTUTotal());
		
	} // fim do main

}
