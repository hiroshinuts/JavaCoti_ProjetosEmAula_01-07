package control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Produto;

public class ControleProduto {

	//atributo -> lista de produtos..
	private List<Produto> listagemProdutos; //null
	
	//construtor..
	public ControleProduto() {
		//inicializar o atributo da classe..
		listagemProdutos = new ArrayList<Produto>();
	}
	
	//método para adicionar um produto na lista..
	public void adicionarProduto(Produto p){
		listagemProdutos.add(p);
	}
	
	//método para buscar um produto dentro da lista pelo id..
	public Produto buscarPorId(Integer idProduto){
		//varrendo a lista.
		for(Produto p : listagemProdutos){
			//verificando se o produto da lista tem o mesmo id do parametro..
			if(p.getIdProduto().equals(idProduto)){
				return p; //retornando o produto..
			}
		}	
		return null; //vazio..
	}
	
	//método para retornar produtos pelo nome (contendo)..
	public List<Produto> buscarPorNome(String nome){
		
		//criando uma lista vazia..
		List<Produto> lista = new ArrayList<Produto>();
		
		//varrer a listagem de produtos da classe..
		for(Produto p : listagemProdutos){
			//verificar se o produto contem o nome passado no metodo..
			if(p.getNome().toLowerCase().contains(nome.toLowerCase())){
				lista.add(p); //adicionar na lista de resposta..
			}
		}
		
		//retornar a lista..
		return lista;
	}
	
	
	//método para limpar a lista..
	public void limparListagemProdutos(){
		listagemProdutos.clear();
	}
	
	
	//método para ordenar a lista..
	public void ordenarListagemProdutos(){
		Collections.sort(listagemProdutos);
	}

	
	//método para retornar a listagem de produtos..
	public List<Produto> getListagemProdutos() {
		return listagemProdutos;
	}
	
}







