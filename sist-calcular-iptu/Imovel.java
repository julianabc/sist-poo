package ap1_2021_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Imovel { 
	private int metragem;
	private String data; 
	private String localizacao;
	private double aliquota; 
	static int id = 1;
	private int codigo;
		
	public Imovel(int metragem, String data, String localizacao) {
		this.metragem = metragem;
		this.data = data;
		this.localizacao = localizacao;
		this.aliquota = 0.1;
		this.codigo = id++;
	}

	public int getMetragem() {
		return metragem;
	}

	public void setMetragem(int metragem) {
		this.metragem = metragem;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	} 
	
	public double getAliquota() {
		return aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}
	
	
	public int getCodigo() {
		return codigo;
	}

	

	public int calcularIdade(){
		Period periodo = null;
		int idade = 0;
		// converte para data para poder calcular a idade
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/M/yyyy");
					
		periodo = periodo.between(LocalDate.parse(this.data, formato), LocalDate.now());
					
		idade = periodo.getYears();
		
		return idade;
	}

	
	public double getValorIPTU() {
		double valorVenal = 0;
		double valorIPTU = 0;
		
		// calcular idade
		if(this.calcularIdade() >= 10 && this.calcularIdade() <= 30) {
			valorVenal = 0.8;
		}else if(this.calcularIdade() > 30){
			valorVenal = 0.6;
		}else {
			valorVenal = 0;
		}
	
		// saber qual é a localização 
		if(this.localizacao.equals("centro")) {
			double centro = 1000; 
			valorVenal *= this.metragem * centro;
			valorIPTU = valorVenal * aliquota;
					
		}else if(this.localizacao.equals("periferia")) {
			double periferia = 500;
			valorVenal *= this.metragem * periferia;
			valorIPTU = valorVenal * aliquota;
			
		}else {
			return 0.0;
		}
		
		return valorIPTU;
		
			
	} // fim do getValorIptu
	
	
	
} // fim da classe Imovel
