package entities;

public class Professor extends Pessoa{

	private String especializacao;
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public Professor(Integer idPessoa, String nome, String especializacao) {
		super(idPessoa, nome);
		this.especializacao = especializacao;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", especialização = " + especializacao;
	}
	
}
