package ad12021;

import java.util.ArrayList;
import java.util.List;

public class Post {
	private String mensagem;
	private int curtidas;
	private List<String> quemCurtiu = new ArrayList<String>();
	

	public Post(String mensagem) {
		this.mensagem = mensagem;
		this.curtidas = 0;
	}
	
	public Post() {
		
	}
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas += curtidas;
	}
	
		
	public List<String> getQuemCurtiu() {
		return quemCurtiu;
	}

	public void setQuemCurtiu(List<String> quemCurtiu) {
		this.quemCurtiu = quemCurtiu;
	}
	

	// metodo para descobrir qual post teve mais curtidas
	public void setMaiorCurtida(int n) {
		this.curtidas = n;
	}
	
	
	public String retornaNomesQueCurtiram() {
		String nomes = "";
		for(int i = 0; i < this.getQuemCurtiu().size(); i++) {
			nomes += this.getQuemCurtiu().get(i);
		}
		
		return nomes;
		
	} // fim do metodo
	
	
	
	@Override
	public String toString() {
		
		return mensagem+ ": " +curtidas+" curtidas";
		
	}
	

} // fim da classe
