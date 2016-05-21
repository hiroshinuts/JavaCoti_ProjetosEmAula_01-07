package principal;

import entities.Aluno;
import entities.Pessoa;
import entities.Professor;

public class Main {

	public static void main(String[] args) {
		
		//vetor...
		Pessoa[] vetor = new Pessoa[5];

		vetor[0] = new Aluno(1, "Diego", 12345);
		vetor[1] = new Aluno(2, "Anderson", 13579);
		vetor[2] = new Aluno(3, "Janaina", 98765);
		vetor[3] = new Aluno(4, "Artur", 56789);
		vetor[4] = new Professor(5, "Sergio", "Java");
		
		//varrendo o vetor..
		System.out.println("\nImprimindo com while:");
		int i = 0;
		while(i < vetor.length){
			System.out.println(vetor[i]); //toString()
			i++;
		}
		
		System.out.println("\nImprimindo com for:");
		for(int j = 0; j < vetor.length; j++){
			System.out.println(vetor[j]); //toString()
		}
		
		System.out.println("\nImprimindo com foreach:");
		for(Pessoa p : vetor){
			
			System.out.println(p); //toString()
			
			// se p (Pessoa) é um Aluno
			if(p instanceof Aluno){
				System.out.println("Este é um Aluno.\n");
			}
			else if(p instanceof Professor){
				System.out.println("Este é um Professor.\n");
			}
		}
		
	}

}





