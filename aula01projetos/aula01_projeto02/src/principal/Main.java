package principal;

import entities.Endereco;
import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario(); //instanciando..
		f1.setEndereco(new Endereco()); //instanciando..
		
		f1.setIdFuncionario(1);
		f1.setNome("Artur");
		f1.setSalario(3000.0);
		
		f1.getEndereco().setIdEndereco(1);
		f1.getEndereco().setLogradouro("Boa Vista, 254");
		f1.getEndereco().setCidade("São Paulo");
		f1.getEndereco().setEstado("SP");
		
		//imprimindo..
		System.out.println(f1); //toString()
		System.out.println(f1.getEndereco()); //toString()
		
		System.out.println("\n");
		
		//outra forma..
		Funcionario f2 = new Funcionario(2, "Leonardo", 2500.0);
		f2.setEndereco(new Endereco(2, "Boa Vista, 123", "São Paulo", "SP"));
		
		//imprimindo..
		System.out.println(f2); //toString()
		System.out.println(f2.getEndereco()); //toString()

		System.out.println("\n");
		
		//outra forma...
		Funcionario f3 = new Funcionario(3, "Bruna", 3500.0, 
				new Endereco(3, "Boa Vista, 456", "São Paulo", "SP"));
		
		System.out.println(f3);
		System.out.println(f3.getEndereco());
	}
	
}







