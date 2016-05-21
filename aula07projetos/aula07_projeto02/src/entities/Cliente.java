package entities;

public class Cliente extends Pessoa{

	//atributos..
	private String cpf;
	private String email;
	private String telefone;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(Integer idPessoa, String nome, String cpf, String email, String telefone) {
		super(idPessoa, nome);
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + cpf + ", " + email + ", " + telefone;
	}
	
}
