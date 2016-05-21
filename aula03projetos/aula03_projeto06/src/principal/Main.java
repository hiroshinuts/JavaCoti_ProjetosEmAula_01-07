package principal;

import java.util.PriorityQueue;
import java.util.Queue;

import entities.Cliente;

public class Main {

	public static void main(String[] args) {
		
		//Queue -> manipulando fila (FIFO)
		
		//Existem 2 tipos de fila: LinkedList e PriorityQueue
		
		//PriorityQueue -> precisa que o objeto implemente Comparable!
		
		//LinkedList -> não precisa da implementação de Comparable...
		//mostra os elementos da fila na ordem em que entraram na fila
		
		//FILA - FIFO (First In First Out)
		Queue<Cliente> fila = new PriorityQueue<Cliente>();
		
		//adicionar elementos na fila..
		fila.add(new Cliente(1, "Ana"));
		fila.add(new Cliente(4, "Rui"));
		fila.add(new Cliente(3, "Bia"));
		fila.add(new Cliente(2, "Leo"));
		
		//exibir o primeiro elemento da fila..
		
		//peek() -> retorna o primeiro elemento da fila, sem remove-lo da fila..
		//poll() -> retorna o primeiro elemento da fila, removemdo-o da fila..
		Cliente cli = fila.poll();
		System.out.println("Primeiro da fila: " + cli);
				
		//imprimir a fila..
		System.out.println("\nImprimindo a Fila:");
		for(Cliente c : fila){
			System.out.println(c);
		}

	}

}





