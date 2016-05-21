package entities;

//JavaBean
public class PessoaFisica extends Cliente{

	//Atributos...
	private String cpf;
	
	//construtores..
	//Primeiro: Construtor default (vazio)
	public PessoaFisica() {
	}

	//construtor com entrada de parametros..
	public PessoaFisica(Integer idCliente, String nome, String email, String cpf) {		
		super(idCliente, nome, email); //executando o construtor da superclasse..
		this.cpf = cpf;
	}

	//encapsulamento..
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	
	//sobrescrever o metodo ToString()
	@Override
	public String toString() {
		return super.toString() + ", " + cpf;
	}
		
	
}
