package servivces;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

import entities.Mensagem;

//classe para serviços de envio de email..
public class EmailService {

	//parametros de configuração (constantes)
	private static final String CONTA = "cotiexemplo@gmail.com";
	private static final String SENHA = "@coticoti@";
	private static final String SMTP = "smtp.gmail.com";
	private static final Integer PORTA = 465;
	
	//método para enviar email..
	public void EnviarEmail(Mensagem msg) throws Exception{
		
		//configurar o envio do email..
		Email e = new SimpleEmail();
		
		e.setHostName(SMTP); //protocolo de envio de email.
		e.setSmtpPort(PORTA); //porta para envio de email
		e.setAuthentication(CONTA, SENHA); //conta que fara o envio
		e.setTLS(true); //segurança..
		e.setSSL(true); //segurança..
		e.setFrom(CONTA, "COTI INFORMATICA"); //remetente
		
		e.addTo(msg.getEmailDest()); //destinatario do email..
		e.setSubject(msg.getAssunto()); //assunto do email..
		e.setMsg(msg.getConteudo()); //conteudo da mensagem..
		
		//enviar o email..
		e.send(); //disparando o email..
	}
	
}






