package entities;

import java.util.Collection;

import entities.types.Periodo;

public class Turma {

	private Integer idTurma;
	private String nome;
	private Periodo periodo;

	private Collection<Aluno> alunos;

	public Turma() {
		// TODO Auto-generated constructor stub
	}

	public Turma(Integer idTurma, String nome, Periodo periodo) {
		super();
		this.idTurma = idTurma;
		this.nome = nome;
		this.periodo = periodo;
	}

	public Turma(Integer idTurma, String nome, Periodo periodo, Collection<Aluno> alunos) {
		this(idTurma, nome, periodo);
		this.alunos = alunos;
	}

	public Integer getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public Collection<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Collection<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		return "Turma [idTurma=" + idTurma + ", nome=" + nome + ", periodo=" + periodo + "]";
	}

}
