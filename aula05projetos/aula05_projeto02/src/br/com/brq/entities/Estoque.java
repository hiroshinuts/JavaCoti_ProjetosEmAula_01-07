package br.com.brq.entities;

import java.util.Collection;

/**
 * Classe de entidade: Estoque
 * 
 * @author Sergio Mendes
 * @version 1.0
 * @since Projeto Aula 05 - Treinamento BRQ/SP
 *
 */
public class Estoque {

	private Integer idEstoque;
	private String nome;
	private String descricao;
	private Collection<Produto> produtos;

	public Estoque() {
	}

	public Estoque(Integer idEstoque, String nome, String descricao) {
		this.idEstoque = idEstoque;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Estoque(Integer idEstoque, String nome, String descricao, Collection<Produto> produtos) {
		this(idEstoque, nome, descricao);
		this.produtos = produtos;
	}

	public Integer getIdEstoque() {
		return idEstoque;
	}

	public void setIdEstoque(Integer idEstoque) {
		this.idEstoque = idEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Collection<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Estoque [idEstoque=" + idEstoque + ", nome=" + nome + ", descricao=" + descricao + "]";
	}

}
