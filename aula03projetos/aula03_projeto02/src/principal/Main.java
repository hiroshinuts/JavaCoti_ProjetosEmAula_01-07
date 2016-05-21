package principal;

import java.util.LinkedHashSet;
import java.util.Set;

import entities.Produto;
import entities.types.Status;

public class Main {

	public static void main(String[] args) {

		//criando objetos...
		Produto p1 = new Produto(4, "Mouse", 30.0, 5, Status.Disponivel);
		Produto p2 = new Produto(3, "Celular", 250.0, 0, Status.Esgotado);
		Produto p3 = new Produto(1, "PenDrive", 20.0, 10, Status.Disponivel);
		Produto p4 = new Produto(2, "Mochila", 100.0, 0, Status.Esgotado);
		
		//Set -> tipo de collection que não permite objetos duplicados..
		//utiliza o equals para verificar se 2 objetos são iguais..
		
		//HashSet -> organiza os objetos pelo criterio do hashCode
		//TreeSet -> organiza os objetos pelo criterio do compareTo (Comparable)
		//LinkedHashSet -> mantem a ordem de entrada dos objetos no Set
		
		Set<Produto> lista = new LinkedHashSet<Produto>();
		
		lista.add(p1); //adicionando..
		lista.add(p2); //adicionando..
		lista.add(p3); //adicionando..
		lista.add(p4); //adicionando..

		//imprimindo..
		for(Produto p : lista){ //foreach
			System.out.println("Produto -> " + p); //toString()
		}
		
	}

}






