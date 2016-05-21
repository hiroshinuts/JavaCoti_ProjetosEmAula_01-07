package principal;

import control.ControleProduto;
import entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		ControleProduto c = new ControleProduto(); //classe de controle..
		
		Produto p1 = new Produto(1, "Livro de Java", 80.0);
		Produto p2 = new Produto(3, "Livro de Oracle", 100.0);
		Produto p3 = new Produto(2, "Notebook", 2000.0);
		
		//adicionar os produtos no controle..
		c.adicionarProduto(p1);
		c.adicionarProduto(p2);
		c.adicionarProduto(p3);
		
		//ordenar a lista..
		c.ordenarListagemProdutos();
		
		//imprimir a listagem de produtos..
		for(Produto p : c.getListagemProdutos()){
			System.out.println(p); //toString()..
		}
		
		//buscar 1 produto pelo id..
		Produto prod = c.buscarPorId(1);
		if(prod != null){ //se produto foi encontrado..
			System.out.println("\n" + prod);
		}
		else{
			System.out.println("\nProduto não encontrado.");
		}
		
		System.out.println("\nProdutos com nome: Livro");
		//buscar produtos pelo nome..
		for(Produto p : c.buscarPorNome("Livro")){
			System.out.println(p); //imprimindo..
		}
		
	}

}





