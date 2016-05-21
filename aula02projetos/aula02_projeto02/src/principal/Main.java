package principal;

import entities.Produto;
import input.InputProduto;

public class Main {

	public static void main(String[] args) {

		Produto p = new Produto(); //entidade..		
		InputProduto input = new InputProduto(); //entrada de dados..
		
		//ler os dados do produto..
		p.setIdProduto(input.lerIdProduto());
		p.setNome(input.lerNome());
		p.setPreco(input.lerPreco());
		
		//imprimir..
		System.out.println(p);
	}

}
