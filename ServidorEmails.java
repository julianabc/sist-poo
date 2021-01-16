import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServidorEmails {
	List <CaixaPostal> caixap = new ArrayList<CaixaPostal>();
		
		
	public void adicionaCaixa(CaixaPostal cp) { 
		// adicionando a lista
		caixap.add(cp);
			
	} // fim de adcionaCaixa
		
	
	public void enviaEmail(Email e1) {
		
		for (int i = 0; i < caixap.size(); i++) {
			// verificar destinatarios
			if(e1.destinatario[0] == caixap.get(i).nome|| e1.destinatario[1] == caixap.get(i).nome) {
				caixap.get(i).adicionaEmail(e1); // chamar metodo
				
			}
			
		} // fim do for
			
	} // fim do envia email
	
	
	public void encaminhaEmail(Email e1, String dest) {
		
		for(int i = 0; i < caixap.size(); i++) {
			if(caixap.get(i).nome == dest) {
				
				caixap.get(i).adicionaEmail(e1);
			}
			
		} // fim do for
		
		
	} // fim do metodo
	
	
} // fim da classe servidorEmails
