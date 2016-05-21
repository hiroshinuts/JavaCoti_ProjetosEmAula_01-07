package control;

import java.util.LinkedHashMap;
import java.util.Map;

import contracts.IControleProduto;
import entities.Produto;

public class ControleProduto implements IControleProduto{

	//declarando um mapa de produtos..
	private Map<Integer, Produto> mapa;
	
	//construtor..
	public ControleProduto() {
		//inicializando o mapa..
		mapa = new LinkedHashMap<Integer, Produto>();
	}
	
	@Override
	public void adicionarProduto(Produto p) throws Exception  {
		
		//verificar se o mapa não possui um produto com a chave informada..
		if( ! mapa.containsKey(p.getIdProduto())){
			//adicionar o produto dentro do mapa..
			mapa.put(p.getIdProduto(), p);
		}
		else{
			throw new Exception("Erro. Este produto ja foi adicionado ao mapa.");
		}
	}

	@Override
	public Produto obterProduto(Integer idProduto) throws Exception {
		
		//verificando se o produto ja existe dentro do mapa..
		if(mapa.containsKey(idProduto)){
			//retornando o produto..
			return mapa.get(idProduto);
		}
		else{
			throw new Exception("Erro. Produto não encontrado no mapa.");
		}
	}	
	
}





