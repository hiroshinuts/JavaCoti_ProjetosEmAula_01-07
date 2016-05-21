package principal;

import control.ControleConta;
import control.ControleContaCorrente;
import entities.ContaCorrente;
import entities.PessoaFisica;

public class Main {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		pf.setIdCorrentista(1);
		pf.setCpf("1234567890");
		pf.setNome("Sergio Mendes");
	
		ContaCorrente cc = new ContaCorrente();
		cc.setIdConta(1);
		cc.setNumero("1234-5");
		cc.setAgencia("9876-0");
		cc.setSaldoAtual(0.0);
		cc.setTaxa(0.05);
		cc.setCorrentista(pf); //relacionando conta ao correntista

		ControleContaCorrente controle = new ControleContaCorrente();
		
		controle.realizarDeposito(cc, 1000.0);
		controle.realizarDeposito(cc, 200.0);
		
		try {
			controle.realizarSaque(cc, 400.0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		controle.imprimirDados(cc);
	}

}
