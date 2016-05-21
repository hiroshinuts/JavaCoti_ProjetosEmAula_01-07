package principal;

import entities.Produto;
import output.OutputProduto;

public class Main {

	public static void main(String[] args) {
		
		//vetor de produtos..
		Produto[] vetor = new Produto[4];
		
		vetor[0] = new Produto(1, "Mouse", 30.0, 10);
		vetor[1] = new Produto(2, "Celular", 250.0, 5);		
		vetor[2] = new Produto(3, "PenDrive", 50.0, 15);
		vetor[3] = new Produto(4, "Caderno", 20.0, 10);
		
		OutputProduto out = new OutputProduto();
		out.imprimirDados(vetor);
		
	}

}
