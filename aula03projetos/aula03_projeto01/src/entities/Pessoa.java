package entities;

import entities.types.EstadoCivil;
import entities.types.Sexo;

//classe javabean esta implementando a interface Comparable (sort, ordena��o)
//quando implementamos Comparable, devemos programar o m�todo compareTo
public class Pessoa implements Comparable<Pessoa>{

	private Integer idPessoa;
	private String nome;
	private Sexo sexo;
	private EstadoCivil estadoCivil;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(Integer idPessoa, String nome, Sexo sexo, EstadoCivil estadoCivil) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	
	//Sobresrita dos metodos da classe object...
	
	//equals -> define regra de compara��o para objetos da classe
	@Override //sobrescrita de metodo
	public boolean equals(Object obj) {
		
		if(obj instanceof Pessoa){
			
			Pessoa p = (Pessoa) obj;
			
			if(p.getIdPessoa() != null){
				return p.getIdPessoa().equals(idPessoa);
			}			
		}		
		return false;
	}
	
	//hashCode -> define regra para ordena��o e classifica��o
	//geralmente a regra do hashcode � a mesma do equals
	@Override //sobrescrita de metodo
	public int hashCode() {
		return idPessoa.hashCode(); //ordena��o pelo id..
	}
	
	//toString -> retorna uma string com o valor do objeto
	@Override //sobrescrita de metodo
	public String toString() {
		return idPessoa + ", " + nome + ", " + sexo + ", " + estadoCivil;
	}

	//m�todo da interface Comparable
	//utilizado para definir regras de ordena��o em collections
	@Override
	public int compareTo(Pessoa p) {
		
		//regra de compara��o pelo id..
		//if(p.getIdPessoa() != null){
			//ordem decrescente...
			//return p.getIdPessoa().compareTo(idPessoa);			
		//}
		
		//ordem crescente...
		return nome.compareTo(p.getNome());
	}
	
}








