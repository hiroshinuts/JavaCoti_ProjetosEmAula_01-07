package contracts;

import entities.Produto;

public interface IControleProduto {

	//m�todo para adicionar um produto em um mapa..
	void adicionarProduto(Produto p) throws Exception;
	
	//m�todo para obter 1 produto do mapa..
	Produto obterProduto(Integer idProduto) throws Exception;
	
}
