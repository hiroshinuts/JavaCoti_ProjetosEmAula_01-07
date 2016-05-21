package principal;

import control.ControleAluno;
import entities.Aluno;
import input.InputAluno;

public class Main {

	public static void main(String[] args) {

		Aluno a = new Aluno(); //entidade..
		InputAluno input = new InputAluno(); //entrada de dados..
		
		a.setIdAluno(input.lerIdAluno());
		a.setNome(input.lerNome());
		
		a.setNotas(new Double[4]); //vetor de 4 posições..
		
		for(int i = 0; i < a.getNotas().length; i++){
			
			//ler cada nota do aluno..
			a.getNotas()[i] = input.lerNota();			
		}
		
		System.out.println("\nDados do Aluno:");
		System.out.println(a); //toString()
		
		ControleAluno control = new ControleAluno();
		System.out.println("Media do Aluno...: " + control.obterMedia(a));
		System.out.println("Situacao.........: " + control.obterSituacao(a));
		
	}

}






