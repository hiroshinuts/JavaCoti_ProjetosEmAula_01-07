package control;

import entities.Aluno;
import types.SituacaoAluno;

public class ControleAluno {

	//método para calcular a media de um aluno baseado nas notas..
	public Double obterMedia(Aluno a) throws Exception{
		
		//somar as notas do aluno..
		double somatorio = 0.0;
		
		//varrendo cada nota contida no vetor..
		for(Double nota : a.getNotas()){
			//verificar se a nota percorrido no vetor é valida..
			if(nota >= 0 && nota <= 10){
				somatorio += nota; //acumulador..
			}
			else{
				throw new Exception("Nota invalida: " + nota);
			}			
		}
		
		//calcular a media e retornar o valor..
		return somatorio / a.getNotas().length;	
	}
	
	//método para retornar a situação do aluno, baseado na media..
	public SituacaoAluno obterSituacao(Aluno a) throws Exception{
		
		//calcular a media do aluno...
		Double media = obterMedia(a);
		
		if(media >= 7){
			return SituacaoAluno.Aprovado;
		}
		else if(media >= 5){
			return SituacaoAluno.Recuperacao;
		}
		else{
			return SituacaoAluno.Reprovado;
		}
	}
	
	
}





