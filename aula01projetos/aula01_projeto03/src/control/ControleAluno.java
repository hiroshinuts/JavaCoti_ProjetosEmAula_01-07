package control;

import entities.Aluno;

public class ControleAluno {

	//m�todo para calcular e retornar a media do aluno..
	//VO -> Value Object (passagem de objeto por parametro..)
	public Double obterMedia(Aluno a){
		
		double somatorioNotas = 0.0; //variavel local..
		
		//somando as notas do aluno.. (foreach)
		for(Double nota : a.getNotas()){
			somatorioNotas += nota; //acumulador..
		}
		
		//retornando o calculo da media..
		return somatorioNotas / a.getNotas().length;
	}
	
	//M�todo para calcular a situa��o do aluno..
	public String obterSituacao(Aluno a){
		
		//executando o metodo obterMedia()
		double media = obterMedia(a);
		
		if(media >= 7){
			return "Aprovado";
		}
		else if(media >= 5){
			return "Recupera��o";
		}
		else{
			return "Reprovado";
		}
	}
	
}







