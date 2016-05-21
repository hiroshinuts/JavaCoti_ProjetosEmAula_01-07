package entities;

import entities.types.Turno;

public class Turma {

	private Integer idTurma;
	private String nome;
	private Turno turno; // enum..
	private Professor professor; // entidade (Associação)

	public Turma() {
		// construtor default..
	}

	// sobrecarga de construtores..
	public Turma(Integer idTurma, String nome, Turno turno) {
		this.idTurma = idTurma;
		this.nome = nome;
		this.turno = turno;
	}

	// sobrecarga de construtores..
	public Turma(Integer idTurma, String nome, Turno turno, Professor professor) {
		this(idTurma, nome, turno);
		this.professor = professor;
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

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Turma [idTurma=" + idTurma + ", nome=" + nome + ", turno=" + turno + "]";
	}

}
