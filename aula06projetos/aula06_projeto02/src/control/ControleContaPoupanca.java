package control;

import entities.ContaPoupanca;

public class ControleContaPoupanca extends ControleConta<ContaPoupanca>{

	@Override
	public void realizarDeposito(ContaPoupanca conta, Double valor) {
		
		Double deposito = (valor * conta.getRendimento()) + valor;
		Double saldo = conta.getSaldoAtual();
		
		conta.setSaldoAtual(saldo + deposito);
	}

	@Override
	public void realizarSaque(ContaPoupanca conta, Double valor) throws Exception {
		
		if(conta.getSaldoAtual() >= valor){
			Double saldo = conta.getSaldoAtual();
			conta.setSaldoAtual(saldo - valor);
		}
		else{
			throw new Exception("Saldo insuficiente para saque.");
		}
	}		
}
