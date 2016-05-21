package principal;

import java.util.ArrayList;
import java.util.List;

import control.ControleFuncionario;
import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		/*
		List<Cliente> lista = new ArrayList<Cliente>();
		
		lista.add(new Cliente(1, "Ana", "1234567890", "ana@mail.com", "21 5555-5555"));
		lista.add(new Cliente(2, "Leo", "0987654321", "leo@mail.com", "21 2222-2222"));
		lista.add(new Cliente(3, "Bia", "9988776655", "bia@mail.com", "21 4444-4444"));
		lista.add(new Cliente(4, "Rui", "2233445566", "rui@mail.com", "21 9999-9999"));
		
		try{
			
			ControleCliente c = new ControleCliente();
			c.exportarXml(lista);
			
			System.out.println("XML gerado com sucesso.\n");
			
			for(Cliente cli : c.importarXml()){
				System.out.println(cli);
			}
		}
		catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
		*/
		
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		lista.add(new Funcionario(1, "Joao", 2000.0, "Programador"));
		lista.add(new Funcionario(2, "Pedro", 2000.0, "Programador"));
		lista.add(new Funcionario(3, "Maria", 4000.0, "Analista"));
		lista.add(new Funcionario(4, "Carlos", 5000.0, "DBA"));
		
		try{
			
			ControleFuncionario c = new ControleFuncionario();
			c.exportarXml(lista);
			
			System.out.println("XML gerado com sucesso.\n");
			
			for(Funcionario f : c.importarXml()){
				System.out.println(f);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
}









