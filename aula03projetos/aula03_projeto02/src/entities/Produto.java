package entities;

import entities.types.Status;

public class Produto implements Comparable<Produto>{

	private Integer idProduto;
	private String nome;
	private Double preco;
	private Integer quantidade;
	private Status status;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Integer idProduto, String nome, Double preco, Integer quantidade, Status status) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.status = status;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override 
	public boolean equals(Object obj) {
		
		if(obj instanceof Produto){
			
			Produto p = (Produto) obj;
			
			if(p.getIdProduto() != null){
				return p.getIdProduto().equals(idProduto);
			}			
		}		
		return false;
	}
	
	@Override 
	public int hashCode() {
		return idProduto.hashCode(); 
	}
	
	@Override 
	public String toString() {
		return idProduto + ", " + nome + ", " + preco 
				+ ", " + quantidade + ", " + status;
	}

	@Override
	public int compareTo(Produto p) {
		return nome.compareTo(p.getNome());
	}
	
}
