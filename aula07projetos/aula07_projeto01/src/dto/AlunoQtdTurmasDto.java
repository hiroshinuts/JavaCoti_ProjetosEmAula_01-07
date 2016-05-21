package dto;

public class AlunoQtdTurmasDto {

	private Integer idAluno;
	private String nomeAluno;
	private String email;
	private Integer qtdTurmas;

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getQtdTurmas() {
		return qtdTurmas;
	}

	public void setQtdTurmas(Integer qtdTurmas) {
		this.qtdTurmas = qtdTurmas;
	}

	@Override
	public String toString() {
		return "AlunoQtdTurmasDto [idAluno=" + idAluno + ", nomeAluno=" + nomeAluno + ", email=" + email
				+ ", qtdTurmas=" + qtdTurmas + "]";
	}

}
