package controls;

import java.io.File;
import java.io.FileWriter;

import contracts.IControle;
import entities.Turma;

public class ControleTurma implements IControle<Turma>{

	@Override
	public void exportarDados(Turma obj) throws Exception {
		
		//abrindo um arquivo para escrita..
		FileWriter arq = new FileWriter(new File("c:\\temp\\turmas.txt"), true);
		
		arq.write(obj.toString()); //gravando o toString() da turma..
		arq.write("\r\n");
		
		//verificar se a turma tem Professor instanciado..
		if(obj.getProfessor() != null){
			arq.write(obj.getProfessor().toString()); //toString() do professor..
			arq.write("\r\n\r\n");
		}
		
		arq.close(); //fechar o arquivo..
	}	
}






