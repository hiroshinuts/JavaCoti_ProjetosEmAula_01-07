package entities;

public class ContaPoupanca extends Conta{

	private Double rendimento;
	
	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(Integer idConta, String numero, String agencia, Double saldoAtual, Double rendimento) {
		super(idConta, numero, agencia, saldoAtual);
		this.rendimento = rendimento;
	}

	public ContaPoupanca(Integer idConta, String numero, String agencia, Double saldoAtual, Correntista correntista,
			Double rendimento) {
		super(idConta, numero, agencia, saldoAtual, correntista);
		this.rendimento = rendimento;
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", rendimento: " + rendimento;
	}
	
}
