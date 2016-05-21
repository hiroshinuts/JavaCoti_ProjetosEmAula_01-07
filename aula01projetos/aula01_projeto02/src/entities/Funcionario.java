package entities;

//JavaBean (POJO)
public class Funcionario{

	// atributos..
	private Integer idFuncionario;
	private String nome;
	private Double salario;
	private Endereco endereco; //Associação (TER-1)

	// construtor default..
	public Funcionario() {
		// vazio..
	}

	// sobrecarga de construtores
	public Funcionario(Integer idFuncionario, String nome, Double salario) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.salario = salario;
	}
	
	//sobrecarga de construtores..
	public Funcionario(Integer idFuncionario, String nome, Double salario, Endereco endereco){
		this(idFuncionario, nome, salario);
		this.endereco = endereco;
	}

	// encapsulamento..
	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + nome + ", salario=" + salario + "]";
	}

}
