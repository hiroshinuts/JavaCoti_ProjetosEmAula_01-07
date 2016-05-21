package controls;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import contracts.IControleArquivo;
import entities.Funcionario;

public class ControleArquivoCsv implements IControleArquivo{

	private FileWriter arquivo; //null
	
	@Override
	public void abrirArquivo() {
		try {
			arquivo = new FileWriter(new File("c:\\temp\\funcionario.csv"), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void gravarDados(Funcionario f){
		
		try {			
			arquivo.write(f.getIdFuncionario() + ";" + f.getNome() + ";"
							+ f.getSalario() + "\n");	
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void fecharArquivo() {
		try {
			arquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}	
}
