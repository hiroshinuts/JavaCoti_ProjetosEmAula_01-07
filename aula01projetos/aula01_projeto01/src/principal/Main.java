package principal;

import entities.Cliente;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	// ctrl + shift + O -> imports
	// ctrl + shift + F -> tabulação

	public static void main(String[] args) {

		//Classe -> Objeto
		Cliente c1 = new Cliente(1, "Sergio Mendes", "sergio.coti@gmail.com"); 
		Cliente c2 = new Cliente(1, "Yuri", "yuri@gmail.com"); 

		//c.setIdCliente(1); //entrada
		//c.setNome("Sergio Mendes"); //entrada
		//c.setEmail("sergio.coti@gmail.com"); //entrada
		
		//System.out.println("IdCliente..: " + c.getIdCliente());
		//System.out.println("Nome.......: " + c.getNome());
		//System.out.println("Email......: " + c.getEmail());
		
		if(c1.equals(c2)){
			System.out.println("Clientes iguais");
		}
		else{
			System.out.println("Clientes diferentes");
		}
		
		System.out.println("Cliente: " + c1); //toString()
		System.out.println("Cliente: " + c2); //tostring()
		
		PessoaFisica pf = new PessoaFisica(3, "Lernardo", "leo@gmail.com", "1234567890");
		PessoaJuridica pj = new PessoaJuridica(4, "Loja", "loja@gmailcom", "0987654321");
		
		System.out.println(pf); //toString()
		System.out.println(pj); //toString()
	}

}




