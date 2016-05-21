package principal;

import control.ControleProduto;
import entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(1, "Mouse", 30.0, 5);
		Produto p2 = new Produto(2, "Monitor", 400.0, 10);

		try{
			
			ControleProduto c = new ControleProduto();
			
			c.adicionarProduto(p1); //incluindo no mapa..
			c.adicionarProduto(p2); //incluindo no mapa..
			
			//imprimir os produtos do mapa..
			System.out.println("Produto -> " + c.obterProduto(1)); //toString()
			System.out.println("Produto -> " + c.obterProduto(2)); //toString()
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
