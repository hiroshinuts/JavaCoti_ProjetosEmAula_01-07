package input;

import javax.swing.JOptionPane;

//classe para ler os dados do funcionario.. 
public class InputFuncionario {

	/*
	 * Metodos estaticos são aqueles que podem ser executados diretamente
	 * pela classe, sem que a classe precise de uma instancia
	 */	
	
	public static Integer lerIdFuncionario(){
		String valor = JOptionPane.showInputDialog("Informe o Id do Funcionario:");
		return Integer.parseInt(valor);
	}
	
	public static String lerNome(){
		return JOptionPane.showInputDialog("Informe o Nome do Funcionario:");
	}
	
	public static Double lerSalario(){
		String valor = JOptionPane.showInputDialog("Informe o Salario do Funcionario:");
		return Double.parseDouble(valor);
	}
	
}
