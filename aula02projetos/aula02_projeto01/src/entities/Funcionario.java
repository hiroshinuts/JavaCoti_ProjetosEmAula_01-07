package entities;

//JavaBean
public class Funcionario {

	// Atributos
	private Integer idFuncionario;
	private String nome;
	private Double salario;

	// Construtores
	// 1) Construtor default (vazio) -> sem entrada de argumentos
	public Funcionario() {
		// vazio...
	}

	// 2) Sobrecarga de construtores (overloading)
	public Funcionario(Integer idFuncionario, String nome, Double salario) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.salario = salario;
	}

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

	// Sobrescrever o método toString() da classe Object..
	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + nome + ", salario=" + salario + "]";
	}
}
