package input;

import javax.swing.JOptionPane;

import validators.ValidadorProduto;

public class InputProduto {

	//atributo..
	private ValidadorProduto validador;	//null
	
	//construtor..
	public InputProduto() {
		//inicializando o validador..
		validador = new ValidadorProduto(); //instanciando..
	}
	
	public Integer lerIdProduto(){
		
		//tratamento de exceções..
		try{
			int idProduto = Integer.parseInt(
					JOptionPane.showInputDialog("Informe o Id do Produto:"));
			
			if(validador.validarIdProduto(idProduto)){
				return idProduto;
			}
			else{
				//lançar uma exceção...
				throw new Exception("Id do Produto invalido.");
			}
		}
		catch(Exception e){			
			//exibir mensagem de erro..
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());			
			//recursividade..
			return lerIdProduto();
		}
		
	}
	
	public String lerNome(){
		
		try{			
			String nome = JOptionPane.showInputDialog("Informe o Nome do Produto:");
			
			if(validador.validarNome(nome)){
				return nome;
			}
			else{
				throw new Exception("Nome do Produto invalido.");
			}						
		}
		catch(Exception e){
			//exibir mensagem de erro..
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());			
			//recursividade..
			return lerNome();
		}		
	}
	
	
	public Double lerPreco(){
		
		try{
			Double preco = Double.parseDouble(
					JOptionPane.showInputDialog("Informe o Preço do Produto:"));
			
			if(validador.validarPreco(preco)){
				return preco;
			}
			else{
				throw new Exception("Preço do Produto invalido.");
			}			
		}
		catch(Exception e){
			//exibir mensagem de erro..
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());			
			//recursividade..
			return lerPreco();
		}	
		
	}	
}

