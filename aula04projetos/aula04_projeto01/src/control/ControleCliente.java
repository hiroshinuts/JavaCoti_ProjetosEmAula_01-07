package control;

import java.util.Scanner;

import control.types.Menu;
import entities.Cliente;
import input.InputCliente;
import persistence.ClienteDao;

public class ControleCliente {

	// atributo para a classe de entrada de dados..
	private InputCliente input; // null

	// construtor..
	public ControleCliente() {
		input = new InputCliente(); // instanciando..
	}

	// método para executar o cadastro de um cliente..
	private void cadastrarCliente() {
		try {

			Cliente c = new Cliente(); // entidade.
			c.setNome(input.lerNome());
			c.setEmail(input.lerEmail());

			ClienteDao d = new ClienteDao();
			d.insert(c); // cadastrando.

			System.out.println("Cliente cadastrado com sucesso.");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	// método para executar a edição de um cliente..
	private void atualizarCliente() {
		try {

			ClienteDao d = new ClienteDao(); //persistencia..
			
			//buscar o cliente pelo id..
			Cliente c = d.findById(input.lerIdCliente());
			
			//verificar se o cliente foi encontrado..
			if(c != null){
				
				c.setNome(input.lerNome());
				c.setEmail(input.lerEmail());
				
				d.update(c); //atualizando..
				
				System.out.println("Cliente atualizado com sucesso.");
			}
			else{
				throw new Exception("Cliente não encontrado.");
			}			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	//método para excluir o cliente..
	private void excluirCliente(){
		
		try{
			
			//buscar o cliente pelo id..
			ClienteDao d = new ClienteDao();			
			Cliente c = d.findById(input.lerIdCliente());
			
			if(c != null){ //cliente foi encontrado.
				d.delete(c.getIdCliente());
				
				System.out.println("Cliente excluido com sucesso: " + c);
			}
			else{
				throw new Exception("Cliente não encontrado.");
			}
		}
		catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}		
	}
	
	//método para imprimir todos os clientes..
	private void consultarClientes(){
		
		try{
			
			ClienteDao d = new ClienteDao(); //persistencia..
			//varrendo a lista de clientes obtida do banco..
			for(Cliente c : d.findAll()){
				System.out.println("Cliente: " + c); //toString()
			}
			
		}
		catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	//Menu..
	public void manterClientes(){
		
		System.out.println("\nManter Clientes:");
		System.out.println("\tCADASTRAR,");
		System.out.println("\tATUALIZAR,");
		System.out.println("\tEXCLUIR,");
		System.out.println("\tCONSULTAR,");
		System.out.println("\tSAIR");
		
		System.out.print("Digite a operação desejada: ");
		Menu menu = Menu.valueOf(new Scanner(System.in).nextLine().toUpperCase());
		
		switch(menu){
			case CADASTRAR:
				cadastrarCliente();
				break;
			case ATUALIZAR:
				atualizarCliente();
				break;
			case EXCLUIR:
				excluirCliente();
				break;
			case CONSULTAR:
				consultarClientes();
				break;
			case SAIR:
				System.out.println("\nFIM DO PROGRAMA.");
				break;
		}
	}

}














