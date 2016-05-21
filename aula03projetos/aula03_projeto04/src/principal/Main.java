package principal;

import control.ControleFuncionario;
import entities.Funcionario;

public class Main {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario(1, "Joao",  2000.0);
		Funcionario f2 = new Funcionario(3, "Pedro", 3000.0);
		Funcionario f3 = new Funcionario(2, "Maria", 4000.0);

		ControleFuncionario c = new ControleFuncionario();
		
		c.adicionarFuncionario(f1);
		c.adicionarFuncionario(f2);
		c.adicionarFuncionario(f3);
		
		c.ordenarListagemFuncionarios();
		
		System.out.println("\nTodos os Funcionarios:");
		for(Funcionario f : c.getListagemFuncionarios()){
			System.out.println(f); //imprimindo..
		}
		
		System.out.println("\nFuncionarios por Nome -> 'A'");
		for(Funcionario f : c.obterPorNome("A")){
			System.out.println(f);
		}
		
		System.out.println("\nFuncionarios com Salario entre 2500 e 4500");
		for(Funcionario f : c.obterPorSalario(2500.0, 4500.0)){
			System.out.println(f);
		}
		
		//buscar por id..
		System.out.println("\nConsulta de Funcionario por Id");
		Funcionario f = c.obterPorId(2);
		
		if(f != null){
			System.out.println(f); //toString()
		}
		else{
			System.out.println("Funcionario não encontrado.");
		}
	}

}








