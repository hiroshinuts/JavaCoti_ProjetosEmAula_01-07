package principal;

import contracts.IControleArquivo;
import controls.ControleArquivoXml;
import entities.Funcionario;
import factory.FactoryArquivo;
import input.InputFuncionario;
import types.TipoArquivo;

public class Main {

	public static void main(String[] args) {

		//ler os dados do funcionario..
		Funcionario f = new Funcionario(); //entidade (javabean)
		
		f.setIdFuncionario(1);
		f.setNome("Sergio Mendes");
		f.setSalario(1000.);
		
		//imprimindo..
		System.out.println(f); //toString()
		
		FactoryArquivo factory = new FactoryArquivo(TipoArquivo.CSV);
		factory.gerarArquivo(f);
		
		System.out.println("Dados gravados.");		
	}
}









