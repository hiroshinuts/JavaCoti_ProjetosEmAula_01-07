package entities;

public class PessoaFisica extends Correntista{

	private String cpf;
	
	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica(Integer idCorrentista, String nome, String cpf) {
		super(idCorrentista, nome);
		this.cpf = cpf;
	}

	public PessoaFisica(Integer idCorrentista, String nome, Conta conta, String cpf) {
		super(idCorrentista, nome, conta);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", cpf: " + cpf;
	}
	
}
