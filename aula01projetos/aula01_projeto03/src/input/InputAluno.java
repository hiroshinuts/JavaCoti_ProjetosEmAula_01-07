package input;

import java.util.Scanner;

//entrada de dados pelo console do Java..
public class InputAluno {

	//atributo..
	private Scanner s; //null
	
	public InputAluno() {
		s = new Scanner(System.in); //instanciando..
	}
	
	// método para ler e retornar o id de um aluno..
	public Integer lerIdAluno() {
		System.out.print("Informe o Id do Aluno.....: ");
		return Integer.parseInt(s.nextLine()); // ler o valor informado como inteiro
	}

	// método para ler e retornar o nome de um aluno..
	public String lerNome() {
		System.out.print("Informe o Nome do Aluno...: ");
		return s.nextLine(); // ler o valor informado como string
	}

	// método para ler e retornar a nota de um aluno..
	public Double lerNota() {
		System.out.print("Informe o Nota do Aluno...: ");
		return Double.parseDouble(s.nextLine()); // ler o valor informado como double
	}

}
