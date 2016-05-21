package entities;

public class Produto implements Comparable<Produto>{

	private Integer idProduto;
	private String nome;
	private Double preco;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Integer idProduto, String nome, Double preco) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
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

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	@Override
	public int hashCode() {
		return idProduto.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//assertiva -> condição ? entao : senao
		return obj instanceof Produto 
				? ((Produto)obj).getIdProduto() != null 
				? ((Produto)obj).getIdProduto().equals(idProduto)
				: false : false;
	}

	@Override
	public int compareTo(Produto p) {		
		return idProduto.compareTo(p.getIdProduto());
	}
	
}




