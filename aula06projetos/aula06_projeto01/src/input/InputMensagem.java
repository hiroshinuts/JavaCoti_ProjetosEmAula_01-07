package input;

import javax.swing.JOptionPane;

//classe para ler os dados da mensagem informados pelo usuario
public class InputMensagem {

	//ler o email do destinatario
	public String lerEmailDest(){
		return JOptionPane.showInputDialog("Informe o email do destinatario:");
	}
	
	//ler o assunto da mensagem
	public String lerAssunto(){
		return JOptionPane.showInputDialog("Informe o assunto:");
	}
	
	//ler o conteudo da mensagem
	public String lerConteudo(){
		return JOptionPane.showInputDialog("Conteudo da mensagem:");
	}
	
}
