package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import entities.Cliente;

public class ControleCliente extends ControlePessoa<Cliente> {

	@Override
	public void exportarXml(List<Cliente> lista) throws Exception {
		
		//instanciando a biblioteca para geração XML..
		XStream xstream = new XStream(new StaxDriver());
		
		//definir o nomeda <tag> raiz do xml
		xstream.alias("dados", List.class); //conter uma listagem..
		xstream.alias("cliente", Cliente.class); //conter objetos de Cliente..
		
		//gravar o arquivo xml..
		FileWriter arquivo = new FileWriter(new File(PATH + "clientes.xml"));
		arquivo.write(xstream.toXML(lista)); //gerando um XML da lista de clientes..
		arquivo.close(); //fechar o arquivo..
	}

	@Override
	public List<Cliente> importarXml() throws Exception {
		
		//declarando uma lista de clientes...
		List<Cliente> lista = new ArrayList<Cliente>();
		
		XStream xstream = new XStream(new Dom4JDriver());
		xstream.alias("dados", List.class);
		xstream.alias("cliente", Cliente.class);
		
		BufferedReader arquivo = new BufferedReader(new FileReader(PATH + "clientes.xml"));
		lista = (List<Cliente>) xstream.fromXML(arquivo);
		arquivo.close();
		
		return lista; //retornando a lista..
	}	
	
}








