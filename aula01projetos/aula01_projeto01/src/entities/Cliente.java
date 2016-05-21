package entities;

//JavaBean (POJO - Plain Old Java Object)
//Caracteristicas:
	//- Atributos privados..
	//- Encapsulamento (set/get)
	//- Construtores
	//- Herança de Object
	//	- Sobrescrever os metodos equals, hashCode, toString
public class Cliente {

	//Atributos..
	//visibilidades (modificadores de acesso) -> atributos ou metodos
	//private   -> acesso somente dentro da propria classe
	//public    -> acesso total
	//protected -> acesso dentro do mesmo pacote ou por herança
	//default (friendly) -> acesso dentro do mesmo pacote
	
	//tipos primitivos: byte, boolean, char, int, float, double
	//Wrappers: Byte, Boolean, Character, Integer, Float, Double
	private Integer idCliente;
	private String nome;
	private String email;
	
	//construtores..
	public Cliente() {
		// vazio (default..)
	}
	
	//construtor..
	//sobrecarga de métodos (overloading)
	//criar metodos com o mesmo nome porem com entradas de argumentos diferentes
	public Cliente(Integer idCliente, String nome, String email){
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
	}
		
	//encapsulamento..
	public void setIdCliente(Integer idCliente){
		this.idCliente = idCliente;
	}
	
	public Integer getIdCliente(){
		return idCliente;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
	
	//Metodo para retorna a classe como texto (string)
	@Override //annotation
	public String toString() {		
		return idCliente + ", " + nome + ", " + email;
	}
	
	//Metodo booleano que indica se dois 2 objetos de Cliente sao iguais
	@Override
	public boolean equals(Object obj) {
		
		//verificar se o objeto recebido pelo equals é um cliente
		if(obj instanceof Cliente){
			
			//converter obj em Cliente (casting)
			Cliente c = (Cliente) obj;
			
			//regra de comparação..
			return c.getIdCliente().equals(idCliente);
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		//regra de agrupamento de objetos (organização)..
		return idCliente.hashCode();
	}
	
}

















