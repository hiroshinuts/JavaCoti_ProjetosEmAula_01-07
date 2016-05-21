package entities;

import java.util.Date;

public class Funcionario {

	private Integer idFuncionario;
	private String nome;
	private Double salario;
	private Date dataAdmissao;

	// Relacionamento -> TEM 1 Endereco
	private Endereco endereco; //Associação

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(Integer idFuncionario, String nome, Double salario, Date dataAdmissao) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	public Funcionario(Integer idFuncionario, String nome, Double salario, Date dataAdmissao, Endereco endereco) {
		this(idFuncionario, nome, salario, dataAdmissao);
		this.endereco = endereco;
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + nome + ", salario=" + salario
				+ ", dataAdmissao=" + dataAdmissao + "]";
	}

}
