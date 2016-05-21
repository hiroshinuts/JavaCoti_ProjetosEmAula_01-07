package control;

import entities.ContaCorrente;

public class ControleContaCorrente extends ControleConta<ContaCorrente>{

	@Override
	public void realizarDeposito(ContaCorrente conta, Double valor) {
		
		Double saldo = conta.getSaldoAtual();
		saldo += valor; //acumulador..
		
		conta.setSaldoAtual(saldo); //novo saldo..
	}

	@Override
	public void realizarSaque(ContaCorrente conta, Double valor) throws Exception {
		
		Double saque = (valor * conta.getTaxa()) + valor;
		
		//se ha limite para saque..
		if(conta.getSaldoAtual() >= saque){
			
			Double saldo = conta.getSaldoAtual();			
			conta.setSaldoAtual(saldo - saque);
		}
		else{
			throw new Exception("Saldo insuficiente para realizar o saque.");
		}
	}	
	
}
