package dto;

//DTO - Data Transfer Object
public class TurmaAlunoDto {

	// atributos da consulta..
	private Integer idTurma;
	private String nomeTurma;
	private String periodo;
	private Integer idAluno;
	private String nomeAluno;
	private String email;

	public Integer getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

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

	@Override
	public String toString() {
		return "TurmaAlunoDto [idTurma=" + idTurma + ", nomeTurma=" + nomeTurma + ", periodo=" + periodo + ", idAluno="
				+ idAluno + ", nomeAluno=" + nomeAluno + ", email=" + email + "]";
	}

}
