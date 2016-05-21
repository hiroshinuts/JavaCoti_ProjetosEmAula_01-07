package entities;

//Correntista é uma Classe Abstrata..
public abstract class Correntista {

	// atributos..
	private Integer idCorrentista;
	private String nome;
	private Conta conta; // Associação (TER-1)

	// construtor vazio..
	public Correntista() {
		// TODO Auto-generated constructor stub
	}

	// sobrecarga de construtores (passagem de argumentos)
	public Correntista(Integer idCorrentista, String nome) {
		this.idCorrentista = idCorrentista;
		this.nome = nome;
	}

	// sobrecarga de construtores (passagem de argumentos)
	public Correntista(Integer idCorrentista, String nome, Conta conta) {
		this(idCorrentista, nome);
		this.conta = conta;
	}

	public Integer getIdCorrentista() {
		return idCorrentista;
	}

	public void setIdCorrentista(Integer idCorrentista) {
		this.idCorrentista = idCorrentista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "Correntista [idCorrentista=" + idCorrentista + ", nome=" + nome + "]";
	}

}
