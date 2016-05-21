package entities;

public class PessoaJuridica extends Cliente{

	private String cnpj;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(Integer idCliente, String nome, String email, String cnpj) {
		super(idCliente, nome, email);
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
		return super.toString() + ", " + cnpj;
	}
	
}
