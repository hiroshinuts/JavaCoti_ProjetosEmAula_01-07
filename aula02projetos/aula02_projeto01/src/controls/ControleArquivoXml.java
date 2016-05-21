package controls;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import contracts.IControleArquivo;
import entities.Funcionario;

public class ControleArquivoXml implements IControleArquivo {

	private FileWriter arquivo;
	
	@Override
	public void abrirArquivo() {
		try {
			arquivo = new FileWriter(new File("c:\\temp\\funcionario.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void gravarDados(Funcionario f) {
		
		try {
			
			arquivo.write("<?xml version='1.0' encoding='iso-8859-1'?>");
			
			arquivo.write("<aula>");
				arquivo.write("<funcionario>");
					arquivo.write("<idfuncionario>" + f.getIdFuncionario() + "</idfuncionario>");
					arquivo.write("<nome>" + f.getNome() + "</nome>");
					arquivo.write("<salario>" + f.getSalario() + "</salario>");
				arquivo.write("</funcionario>");
			arquivo.write("</aula>");
			
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
