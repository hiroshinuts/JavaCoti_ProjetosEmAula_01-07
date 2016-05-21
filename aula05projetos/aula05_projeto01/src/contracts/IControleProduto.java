package contracts;

import entities.Produto;

public interface IControleProduto {

	//método para adicionar um produto em um mapa..
	void adicionarProduto(Produto p) throws Exception;
	
	//método para obter 1 produto do mapa..
	Produto obterProduto(Integer idProduto) throws Exception;
	
}
