package entities;

public class Aluno extends Pessoa{

	private Integer matricula;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(Integer idPessoa, String nome, Integer matricula) {
		super(idPessoa, nome);
		this.matricula = matricula;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return super.toString() + ", matricula = " + matricula;
	}
	
}
