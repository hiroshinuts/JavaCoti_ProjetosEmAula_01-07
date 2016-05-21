package control;

import java.util.List;

import entities.Pessoa;

//<T> tipo generico que devera ser uma herança da classe Pessoa..
public abstract class ControlePessoa<T extends Pessoa> {

	/*
	 * Classes abstratas podem ter atributos, construtores e metodos
	 * tal qual uma classe concreta, mas tambem podem ter metodos abstratos
	 * similar aos de uma interface..
	 */
	
	//constante..
	protected static final String PATH = "c:\\temp\\";
	
	//método para receber uma lista e gravar os dados em XML..
	public abstract void exportarXml(List<T> lista) throws Exception;
	
	//método para retornar uma lista de objetos de um arquivo XML..
	public abstract List<T> importarXml() throws Exception;
	
}
