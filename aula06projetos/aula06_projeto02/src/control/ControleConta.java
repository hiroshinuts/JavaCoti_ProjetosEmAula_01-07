package control;

import entities.Conta;

//Classe abstrata
public abstract class ControleConta<T extends Conta> {

	//Em Java, Classes abstratas podem ter construtores, metodos, atributos, etc..
	//Mas tambem podem ter metodos abstratos, ou seja, metodos que so possuam
	//assinatura e que dever�o ser implementados pelas subclasses que herdarem
	//a classe abstrata...
	
	//m�todo para realizar deposito em conta
	public abstract void realizarDeposito(T conta, Double valor);
	
	//m�todo para realizar saque em conta
	public abstract void realizarSaque(T conta, Double valor) throws Exception;
	
	//m�todo para imprimir os dados da conta..
	//final em metodos -> o metodo nao pode ser sobrescrito..
	public final void imprimirDados(T conta){
		
		System.out.println("\nDados da Conta:");
		System.out.println("Id da Conta..........: " + conta.getIdConta());
		System.out.println("Correntista..........: " + conta.getCorrentista());
		System.out.println("Numero da Conta......: " + conta.getNumero());
		System.out.println("Agencia..............: " + conta.getAgencia());
		System.out.println("Saldo................: " + conta.getSaldoAtual());		
	}	
}










