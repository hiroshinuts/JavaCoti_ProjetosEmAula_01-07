package entities;

//PessoaJuridica É UM Correntista
public class PessoaJuridica extends Correntista{

	private String cnpj;
	
	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
	}

	public PessoaJuridica(Integer idCorrentista, String nome, String cnpj) {
		super(idCorrentista, nome);
		this.cnpj = cnpj;
	}

	public PessoaJuridica(Integer idCorrentista, String nome, Conta conta, String cnpj) {
		super(idCorrentista, nome, conta);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", cnpj: " + cnpj;
	}
}
