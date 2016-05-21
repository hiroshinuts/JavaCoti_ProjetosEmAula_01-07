package entities;

public class Funcionario extends Pessoa{

	private Double salario;
	private String funcao;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(Integer idPessoa, String nome, Double salario, String funcao) {
		super(idPessoa, nome);
		this.salario = salario;
		this.funcao = funcao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + salario + ", " + funcao;
	}
}
