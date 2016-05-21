package entities;

public class Filme {

	private Integer idFilme;
	private String titulo;
	private Genero genero; //associação (TER-1)
	
	public Filme() {
		// TODO Auto-generated constructor stub
	}

	public Filme(Integer idFilme, String titulo) {
		this.idFilme = idFilme;
		this.titulo = titulo;
	}

	public Filme(Integer idFilme, String titulo, Genero genero) {
		this(idFilme, titulo);
		this.genero = genero;
	}

	public Integer getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(Integer idFilme) {
		this.idFilme = idFilme;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Filme [idFilme=" + idFilme + ", titulo=" + titulo + "]";
	}
	
}
