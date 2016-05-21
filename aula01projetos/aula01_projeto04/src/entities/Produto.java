package entities;

//JavaBean..
public class Produto {

	//Atributos..
	private Integer idProduto;
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	//Construtores..
	public Produto() {
		// default (vazio..)
	}

	//Sobrecarga de metodos (Overloading)
	public Produto(Integer idProduto, String nome, Double preco, Integer quantidade) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade
				+ "]";
	}
		
}
