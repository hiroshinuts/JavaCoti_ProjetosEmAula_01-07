package entities;

public class Endereco {

	// Atributos
	private Integer idEndereco;
	private String logradouro;
	private String cidade;
	private String estado;

	// Construtor default..
	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	// sobrecarga de construtores..
	public Endereco(Integer idEndereco, String logradouro, String cidade, String estado) {
		this.idEndereco = idEndereco;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", logradouro=" + logradouro + ", cidade=" + cidade + ", estado="
				+ estado + "]";
	}

}
