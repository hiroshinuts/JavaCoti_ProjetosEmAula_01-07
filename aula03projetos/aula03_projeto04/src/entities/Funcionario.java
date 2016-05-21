package entities;

public class Funcionario implements Comparable<Funcionario>{

	private Integer idFuncionario;
	private String nome;
	private Double salario;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(Integer idFuncionario, String nome, Double salario) {
		super();
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
	
	@Override
	public int hashCode() {
		return idFuncionario.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {		

		if(obj instanceof Funcionario){
			Funcionario f = (Funcionario) obj;
			if(f.getIdFuncionario() != null){
				return f.getIdFuncionario().equals(idFuncionario);
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	@Override
	public int compareTo(Funcionario f) {		
		return idFuncionario.compareTo(f.getIdFuncionario());
	}
}





