package output;

import control.ControleProduto;
import entities.Produto;

public class OutputProduto {

	//método para receber produtos e imprimir no prompt..
	//varargs -> parametro do tipo vetor...
	public void imprimirDados(Produto... vetor){
		
		System.out.println("*** Relatorio de Produtos ***");
		System.out.println("-----------------------------");
		
		ControleProduto c = new ControleProduto(); //serviços..
		
		//pecorrer o vetor de produtos..
		//for each
		for(Produto p : vetor){
			System.out.println("Id do Produto.......: " + p.getIdProduto());
			System.out.println("Nome do Produto.....: " + p.getNome());
			System.out.println("Preco...............: " + p.getPreco());
			System.out.println("Quantidade..........: " + p.getQuantidade());
			System.out.println("Total...............: " + c.obterTotal(p));
			System.out.println("Total com Desconto..: " + c.obterTotalComDesconto(p));
			System.out.println("---");
		}		
	}
	
}
