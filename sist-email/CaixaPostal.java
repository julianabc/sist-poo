import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaixaPostal {
	String nome;
	List <Email> emails = new ArrayList<Email>();
	
	public CaixaPostal(String nome) {
		this.nome = nome;
	}
	
	// adicionar na lista
	public void adicionaEmail(Email e){
		emails.add(e);
	}
	

	@Override
	public String toString() {
		String retorno;
		retorno = ">>> Caixa Postal de " + nome + " <<<\n\n";
		
		// percorrendo lista para impressão correta
		for (int i = 0; i < emails.size(); i++) {
				if(this.nome == emails.get(i).destinatario[0] || this.nome == emails.get(i).destinatario[1] || this.nome == nome) {
					
					retorno += "De: " + emails.get(i).remetente + "\nPara: " + Arrays.toString(emails.get(i).destinatario) + "\n"
							+ emails.get(i).assunto + "\n" + emails.get(i).mensagem + "\n\n";
				}else {
					retorno += "\n\n";
				}
		} // fim do for
		
		return retorno;
	}
	
	


}
