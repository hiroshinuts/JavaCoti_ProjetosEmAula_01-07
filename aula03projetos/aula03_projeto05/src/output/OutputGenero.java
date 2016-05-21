package output;

import entities.Filme;
import entities.Genero;

public class OutputGenero {

	//impressão no console..
	public void imprimir(Genero g){
		
		System.out.println("Id Genero...: " + g.getIdGenero());
		System.out.println("Tipo........: " + g.getTipo());
		
		//verificando se o genero contem filmes..
		if(g.getFilmes() != null && g.getFilmes().size() > 0){
			
			System.out.println("\tFilmes:");
			
			for(Filme f : g.getFilmes()){
				
				System.out.println("\tId do Filme....: " + f.getIdFilme());
				System.out.println("\tTitulo.........: " + f.getTitulo());
				System.out.println("\t...");
			}
			
		}
		
	}
	
}
