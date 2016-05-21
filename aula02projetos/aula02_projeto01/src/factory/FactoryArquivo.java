package factory;

import contracts.IControleArquivo;
import controls.ControleArquivoCsv;
import controls.ControleArquivoTxt;
import controls.ControleArquivoXml;
import entities.Funcionario;
import types.TipoArquivo;

//f�brica de arquivos...
public class FactoryArquivo {

	//atributo..
	private IControleArquivo controle; //null
	
	//construtor..
	public FactoryArquivo(TipoArquivo opcao) {
		switch(opcao){
			case TXT:
				controle = new ControleArquivoTxt(); //polimorfismo!
				break;
			case XML:
				controle = new ControleArquivoXml(); //polimorfismo!
				break;
			case CSV:
				controle = new ControleArquivoCsv(); //polimorfismo!
				break;
		}
	}
	
	//m�todo para executar a grava��o de um arquivo..
	public void gerarArquivo(Funcionario f){
		
		controle.abrirArquivo();
		controle.gravarDados(f);
		controle.fecharArquivo();
	}
	
}
