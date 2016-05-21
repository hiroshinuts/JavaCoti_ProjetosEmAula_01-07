package entities;

import java.util.Arrays;

public class Aluno {

	private Integer idAluno;
	private String nome;
	private Double notas[]; // array

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(Integer idAluno, String nome, Double[] notas) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.notas = notas;
	}

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double[] getNotas() {
		return notas;
	}

	public void setNotas(Double[] notas) {
		this.notas = notas;
	}
	
	

	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nome=" + nome + ", notas=" + Arrays.toString(notas) + "]";
	}

}
