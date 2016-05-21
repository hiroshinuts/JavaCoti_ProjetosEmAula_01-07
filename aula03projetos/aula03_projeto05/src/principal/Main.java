package principal;

import java.util.ArrayList;

import entities.Filme;
import entities.Genero;
import output.OutputGenero;

public class Main {

	public static void main(String[] args) {
		
		Genero g1 = new Genero(1, "Ação"); //instanciando a entidade..
		g1.setFilmes(new ArrayList<Filme>()); //instanciando a lista..
		
		Genero g2 = new Genero(2, "Aventura"); //instanciando a entidade..
		g2.setFilmes(new ArrayList<Filme>()); //instanciando a lista..
		
		//adicionar filmes aos generos..
		g1.getFilmes().add(new Filme(1, "Guerra Civil"));
		g1.getFilmes().add(new Filme(2, "Batman v Superman"));
		
		g2.getFilmes().add(new Filme(3, "Star Wars - Rogue One"));
		g2.getFilmes().add(new Filme(4, "X-men Apocalipse"));
		g2.getFilmes().add(new Filme(5, "Doutor Estranho"));
		
		//imprimindo..
		OutputGenero out = new OutputGenero();
		out.imprimir(g1); //imprimindo..
		out.imprimir(g2); //imprimindo..
	}
	
}






