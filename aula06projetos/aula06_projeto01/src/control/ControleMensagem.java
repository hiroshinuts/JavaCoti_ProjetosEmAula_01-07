package control;

import java.util.Date;

import contracts.IControleMensagem;
import entities.Mensagem;
import input.InputMensagem;
import persistence.MensagemDao;
import servivces.EmailService;

public class ControleMensagem implements IControleMensagem{

	//classe de leitura de dados..
	private InputMensagem input; //null
	
	//construtor..
	public ControleMensagem() {
		input = new InputMensagem(); //instanciando..
	}
	
	@Override
	public void EnviarMensagem() {
		
		try{			
			Mensagem msg = new Mensagem();
			
			msg.setEmailDest(input.lerEmailDest());
			msg.setAssunto(input.lerAssunto());
			msg.setConteudo(input.lerConteudo());
			msg.setDataEnvio(new Date()); //data atual..
			
			//enviar a mensagem..
			EmailService service = new EmailService(); //classe para envio da mensagem...
			service.EnviarEmail(msg); //executando o envio..
			
			//gravar na base de dados..
			MensagemDao d = new MensagemDao(); //classe de persistencia..
			d.insert(msg); //gravando no banco de dados..
			
			System.out.println("Mensagem enviada com sucesso.");
		}
		catch(Exception e){
			//imprimir mensagem de erro..
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

	@Override
	public void ImprimirMensagens() {
		
		try{
			
			//classe de persistencia..
			MensagemDao d = new MensagemDao();
			
			System.out.println("\nListagem de mensagens enviadas:");
			for(Mensagem msg : d.findAll()){
				//imrpimindo o objeto mensagem..
				System.out.println(msg); //ToString();				
			}			
		}
		catch(Exception e){
			//imprimir mensagem de erro..
			System.out.println("Erro:" + e.getMessage());
		}
		
	}	
	
}







