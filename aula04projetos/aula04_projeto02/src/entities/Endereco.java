package entities;

public class Endereco {

	private Integer idEndereco;
	private String logradouro;
	private String cidade;
	private String estado;
	private String cep;

	// Relacionamento -> TER 1
	private Funcionario funcionario; // Associação

	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public Endereco(Integer idEndereco, String logradouro, String cidade, String estado, String cep) {
		this.idEndereco = idEndereco;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public Endereco(Integer idEndereco, String logradouro, String cidade, String estado, String cep,
			Funcionario funcionario) {
		this(idEndereco, logradouro, cidade, estado, cep);
		this.funcionario = funcionario;
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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", logradouro=" + logradouro + ", cidade=" + cidade + ", estado="
				+ estado + ", cep=" + cep + "]";
	}

}
