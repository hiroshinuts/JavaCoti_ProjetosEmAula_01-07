package entities;

//JavaBean (POJO)
public class Professor {

	private Integer idProfessor;
	private String nome;
	private String cpf;

	public Professor() {
		// construtor default..
	}

	// Sobrecarga de construtores..
	public Professor(Integer idProfessor, String nome, String cpf) {
		this.idProfessor = idProfessor;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Integer getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Professor [idProfessor=" + idProfessor + ", nome=" + nome + ", cpf=" + cpf + "]";
	}

}
