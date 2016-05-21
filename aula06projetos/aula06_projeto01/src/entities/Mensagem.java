package entities;

import java.util.Date;

public class Mensagem {

	private Integer idMensagem;
	private String emailDest;
	private String assunto;
	private String conteudo;
	private Date dataEnvio;

	public Mensagem() {
		// TODO Auto-generated constructor stub
	}

	public Mensagem(Integer idMensagem, String emailDest, String assunto, String conteudo, Date dataEnvio) {
		this.idMensagem = idMensagem;
		this.emailDest = emailDest;
		this.assunto = assunto;
		this.conteudo = conteudo;
		this.dataEnvio = dataEnvio;
	}

	public Integer getIdMensagem() {
		return idMensagem;
	}

	public void setIdMensagem(Integer idMensagem) {
		this.idMensagem = idMensagem;
	}

	public String getEmailDest() {
		return emailDest;
	}

	public void setEmailDest(String emailDest) {
		this.emailDest = emailDest;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	@Override
	public String toString() {
		return "Mensagem [idMensagem=" + idMensagem + ", emailDest=" + emailDest + ", assunto=" + assunto
				+ ", conteudo=" + conteudo + ", dataEnvio=" + dataEnvio + "]";
	}

}
