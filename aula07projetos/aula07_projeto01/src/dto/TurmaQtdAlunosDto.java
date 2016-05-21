package dto;

public class TurmaQtdAlunosDto {

	private Integer idTurma;
	private String nomeTurma;
	private String periodo;
	private Integer qtdAlunos;

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

	public Integer getQtdAlunos() {
		return qtdAlunos;
	}

	public void setQtdAlunos(Integer qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	@Override
	public String toString() {
		return "TurmaQtdAlunosDto [idTurma=" + idTurma + ", nomeTurma=" + nomeTurma + ", periodo=" + periodo
				+ ", qtdAlunos=" + qtdAlunos + "]";
	}

}
