package entities;

//Classe abstrata..
public abstract class Conta {

	// atributo..
	private Integer idConta;
	private String numero;
	private String agencia;
	private Double saldoAtual;
	private Correntista correntista;

	// construtor default..
	public Conta() {
		// TODO Auto-generated constructor stub
	}

	// sobrecarga de construtores..
	public Conta(Integer idConta, String numero, String agencia, Double saldoAtual) {
		this.idConta = idConta;
		this.numero = numero;
		this.agencia = agencia;
		this.saldoAtual = saldoAtual;
	}

	// sobrecarga de construtores..
	public Conta(Integer idConta, String numero, String agencia, Double saldoAtual, Correntista correntista) {
		this(idConta, numero, agencia, saldoAtual);
		this.correntista = correntista;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(Double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}

	@Override
	public String toString() {
		return "Conta [idConta=" + idConta + ", numero=" + numero + ", agencia=" + agencia + ", saldoAtual="
				+ saldoAtual + "]";
	}

}
