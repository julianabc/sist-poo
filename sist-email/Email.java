import java.util.Arrays;

public class Email {
	String remetente;
	String [] destinatario = new String [1];
	String assunto, mensagem;
	
	public Email(String remetente, String[] destinatario, String assunto, String mensagem) {
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.assunto = assunto;
		this.mensagem = mensagem;
	}

	

	
} // fim da classe email
