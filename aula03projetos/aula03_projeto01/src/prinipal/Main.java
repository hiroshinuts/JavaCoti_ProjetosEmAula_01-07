package prinipal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import entities.Pessoa;
import entities.types.EstadoCivil;
import entities.types.Sexo;

public class Main {

	public static void main(String[] args) {
		
		//criando objetos..
		Pessoa p1 = new Pessoa(1, "Ana", Sexo.Feminino, EstadoCivil.Solteiro);
		Pessoa p2 = new Pessoa(2, "Rui", Sexo.Masculino, EstadoCivil.Casado);
		Pessoa p3 = new Pessoa(3, "Leo", Sexo.Masculino, EstadoCivil.Casado);
		Pessoa p4 = new Pessoa(4, "Bia", Sexo.Feminino, EstadoCivil.Divorciado);
		Pessoa p5 = new Pessoa(5, "Max", Sexo.Masculino, EstadoCivil.Solteiro);

		//declarando uma lista de pessoas..
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		//adicionando objetos na lista..
		lista.add(p1); //adicionando..
		lista.add(p2); //adicionando..
		lista.add(p3); //adicionando..
		lista.add(p4); //adicionando..
		lista.add(p5); //adicionando..
		
		//imprimindo a quantidade de pessoas na lista..
		System.out.println("Quantidade de pessoas: " + lista.size());
		
		
		//recurso de ordenação para listas..
		//em collections, temos um método de ordenação chamado de sort
		//para que a lista possa ser ordenada pelo metodo sort, é necessario
		//que a classe que define o tipo da lista implemente uma
		//interface chamada de Comparable
		Collections.sort(lista);				
		
		//percorrendo a lista..
		System.out.println("\nimprimindo com for..");
		for(int i = 0; i < lista.size(); i++){			
			//recuperar uma pessoa dentro da lista..
			Pessoa p = lista.get(i);
			//imprimindo..
			System.out.println("Pessoa: " + p); //toString()
		}
		
		System.out.println("\nimprimindo com foreach");
		for(Pessoa p : lista){
			//imprimindo..
			System.out.println("Pessoa: " + p); //toString()
		}
		
		//podemos transformar a lista em um iterator (cursor)...
		//e imprimi-la de uma forma diferente (mais antigo no java)
		
		//colocar a lista em ordem inversa..
		Collections.reverse(lista);
		
		//convertendo a lista em um interator..
		Iterator<Pessoa> iterator = lista.iterator();
		
		//um iterator nao é percorrido com for ou foreach, mas sim com while..
		System.out.println("\nimprimindo com iterator");
		while(iterator.hasNext()){			
			//obter o elemento do iterator..
			Pessoa p = iterator.next();
			//imprimindo..
			System.out.println("Pessoa: " + p); //toString()			
		}
		
	}

}





