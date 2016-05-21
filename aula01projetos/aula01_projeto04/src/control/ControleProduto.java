package control;

import entities.Produto;

//serviços com a entidade Produto..
public class ControleProduto {

	//VO (Value Object..)
	public Double obterTotal(Produto p){
		return p.getPreco() * p.getQuantidade();
	}
	
	//VO (Value Object..)
	public Double obterTotalComDesconto(Produto p){
		
		//calculando o total..
		double total = obterTotal(p);
		
		if(p.getQuantidade() > 10){
			return total - (total * 0.10); //desconto de 10%
		}
		else{
			return total - (total * 0.04); //desconto de 4%
		}
	}
	
}
