package ad12021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Amigo {
	private String nome;
	private List <Post> posts = new ArrayList<Post>();

	public Amigo(String nome) {
		this.nome = nome;
	} 
	
	public Amigo() {
		
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	
	public void postar(Post p) {
		this.getPosts().add(p);	
	
	}
	

	public void curtir(Post p) {
		p.setCurtidas(1);
		
		// adicionando nomes na lista
		p.getQuemCurtiu().add(this.nome);
		
	} // fim do metodo
	

	public Post retornaPostMaisCurtido() {
		int max = 0;
		Post p = new Post();
		List<String> pessoasCurtiram = new ArrayList<String>();
		String nome = "";
		
		for(int i = 0; i < posts.size(); i++) {
			// verifica se o post teve curtida
			if(this.getPosts().get(i).getCurtidas() > 0) {	
				// verifica qual post tem o maior número de curtidas
				if(max < this.getPosts().get(i).getCurtidas() || max == this.getPosts().get(i).getCurtidas()) {
					max = this.getPosts().get(i).getCurtidas();
					p.setMensagem(posts.get(i).getMensagem());
					p.setMaiorCurtida(max);
					
					// setando lista de nomes
					for(int j = 0; j < this.getPosts().get(i).getCurtidas(); j++) {
						nome += this.getPosts().get(i).getQuemCurtiu().get(j)+" ";
					}
					pessoasCurtiram.add(nome);
					p.setQuemCurtiu(pessoasCurtiram);
					
				} // fim do if
				
			}else {
				return null; 
			}

		} // fim do for
		 
		return p;
		
	} // fim do metodo

	
	@Override
	public String toString() {
		return "Nomes de amigo(s): " +nome;
	}
	
} // fim da classe
