package input;

import java.util.Scanner;

public class InputCliente {

	// atributo..
	private Scanner scanner;

	// construtor..
	public InputCliente() {
		// inicializando..
		scanner = new Scanner(System.in);
	}

	// método para ler o id do cliente..
	public Integer lerIdCliente() {
		System.out.print("Informe o Id do Cliente......: ");
		return Integer.parseInt(scanner.nextLine());
	}

	// método para ler o id do cliente..
	public String lerNome() {
		System.out.print("Informe o Nome do Cliente....: ");
		return scanner.nextLine();
	}

	// método para ler o id do cliente..
	public String lerEmail() {
		System.out.print("Informe o Email do Cliente...: ");
		return scanner.nextLine();
	}

}
