package controls;

import java.io.File;
import java.io.FileWriter;

import contracts.IControle;
import entities.Professor;

public class ControleProfessor implements IControle<Professor>{

	@Override
	public void exportarDados(Professor obj) throws Exception {

		//abrindo um arqivo para escrita...
		FileWriter arq = new FileWriter(new File("c:\\temp\\professores.txt"), true);		
		
		arq.write(obj.toString()); //toString() do Professor..
		arq.write("\r\n"); //quebra de linha..
		
		arq.close(); //fechar o arquivo
	}
	
}
