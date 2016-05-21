package entities;

import java.util.List;

public class Genero {

	private Integer idGenero;
	private String tipo;
	private List<Filme> filmes; //Associação (muitos)
	
	public Genero() {
		// TODO Auto-generated constructor stub
	}

	public Genero(Integer idGenero, String tipo) {
		this.idGenero = idGenero;
		this.tipo = tipo;
	}

	public Genero(Integer idGenero, String tipo, List<Filme> filmes) {
		this(idGenero, tipo);
		this.filmes = filmes;
	}

	public Integer getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

	@Override
	public String toString() {
		return "Genero [idGenero=" + idGenero + ", tipo=" + tipo + "]";
	}
	
}
