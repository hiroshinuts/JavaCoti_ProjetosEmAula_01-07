package entities;

public class ContaCorrente extends Conta{

	private Double taxa;
	
	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(Integer idConta, String numero, String agencia, Double saldoAtual, Double taxa) {
		super(idConta, numero, agencia, saldoAtual);
		this.taxa = taxa;
	}

	public ContaCorrente(Integer idConta, String numero, String agencia, Double saldoAtual, Correntista correntista,
			Double taxa) {
		super(idConta, numero, agencia, saldoAtual, correntista);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", taxa: " + taxa;
	}
	
}
