package ad12021;

import java.util.ArrayList;
import java.util.List;

public class Rede {
	private List<Amigo> amigo = new ArrayList<Amigo>();
	
	public Rede() {
		
	}
	
	 public List<Amigo> getAmigo() {
		return amigo;
	}

	public void setAmigo(List<Amigo> amigo) {
		this.amigo = amigo;
	}




	public void adicionarAmigo(Amigo a) {
		
		this.getAmigo().add(a);
		 
	 } // fim do metodo

	 
	  
	 public String timeline() {
		String retorno ="";
		
		// varrendo lista para a impressão
		for(int i = 0; i < this.getAmigo().size(); i++) {
			retorno += this.getAmigo().get(i).getNome()+":\n";
			
			for(int j = 0; j < this.getAmigo().get(i).getPosts().size(); j++ ) {
				retorno += this.getAmigo().get(i).getPosts().get(j).getMensagem()+": ";
				retorno += this.getAmigo().get(i).getPosts().get(j).getCurtidas()+" curtidas\n";
			} 
				
		} // fim do primeiro for
		
		return retorno;
		
	 } // fim do metodo
	

 
} // fim da classe rede
