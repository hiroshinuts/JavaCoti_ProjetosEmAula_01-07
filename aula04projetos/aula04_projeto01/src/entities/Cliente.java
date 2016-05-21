package entities;

public class Cliente implements Comparable<Cliente>{

	// atributos..
	private Integer idCliente;
	private String nome;
	private String email;

	public Cliente() {
		// Construtor default..
	}

	// sobrecarga de construtores..
	public Cliente(Integer idCliente, String nome, String email) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public int hashCode() {
		return idCliente.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Cliente){
			Cliente c = (Cliente) obj;
			if(c.getIdCliente() != null){
				return c.getIdCliente().equals(idCliente);
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return idCliente + ", " + nome + ", " + email;
	}

	@Override
	public int compareTo(Cliente c) {
		return idCliente.compareTo(c.getIdCliente());
	}

}








