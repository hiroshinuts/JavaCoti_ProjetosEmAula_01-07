package controls;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import contracts.IControleArquivo;
import entities.Funcionario;

//Regra: quando uma classe implementa uma interface, a classe é obrigada
//a programar (fornecer implementação) para todos os métodos da interface
public class ControleArquivoTxt implements IControleArquivo{

	//atributo..
	private FileWriter arquivo; //null
	
	@Override
	public void abrirArquivo() {
		try {
			arquivo = new FileWriter(new File("c:\\temp\\funcionario.txt"), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void gravarDados(Funcionario f){
		
		try {			
			arquivo.write("\nDados do Funcionario:");
			arquivo.write("\nId do Funcionario........: " + f.getIdFuncionario());
			arquivo.write("\nNome.....................: " + f.getNome());
			arquivo.write("\nSalario..................: " + f.getSalario());
			arquivo.write("\n");
			
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
