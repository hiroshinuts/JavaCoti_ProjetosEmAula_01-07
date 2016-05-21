package persistence;

import java.util.ArrayList;
import java.util.List;

import entities.Cliente;

public class ClienteDao extends Dao{

	//método para inserir um cliente na base de dados..
	public void insert(Cliente c) throws Exception{
		
		openConnection(); //abrir conexão..
		
		stmt = con.prepareStatement("insert into cliente(nome, email) values(?,?)");
		stmt.setString(1, c.getNome());
		stmt.setString(2, c.getEmail());
		stmt.execute();
		stmt.close();
		
		closeConnection(); //fechar conexão..
	}
	
	//método para atualizar um cliente na base de dados..
	public void update(Cliente c) throws Exception{
		
		openConnection();
		
		stmt = con.prepareStatement("update cliente set nome=?, email=? where idcliente=?");
		stmt.setString(1, c.getNome());
		stmt.setString(2, c.getEmail());
		stmt.setInt(3, c.getIdCliente());
		stmt.execute();
		stmt.close();
		
		closeConnection();
	}
	
	//método para excluir 1 cliente na base de dados..
	public void delete(Integer idCliente) throws Exception{
		
		openConnection();
		
		stmt = con.prepareStatement("delete from cliente where idcliente=?");
		stmt.setInt(1, idCliente);
		stmt.execute();
		stmt.close();
		
		closeConnection();
	}
	
	//método para listar todos os clientes do banco de dados..
	public List<Cliente> findAll() throws Exception{
		
		openConnection();
		
		stmt = con.prepareStatement("select * from cliente");
		rs = stmt.executeQuery();
		
		//declarando a lista de clientes..
		List<Cliente> lista = new ArrayList<Cliente>();
		
		//percorrer o ResultSet..
		while(rs.next()){ //enquanto tem registro..
			Cliente c = new Cliente(); //entidade..
			c.setIdCliente(rs.getInt("idcliente"));
			c.setNome(rs.getString("nome"));
			c.setEmail(rs.getString("email"));
			
			//adicionar na lista..
			lista.add(c); //incluindo na lista..
		}
		
		stmt.close(); //fechando statement
		closeConnection(); //fechar conexão..
		
		return lista; //retornar a lista..
	}
	
	//método para buscar 1 cliente pelo id..
	public Cliente findById(Integer idCliente) throws Exception{
		
		openConnection();
		
		stmt = con.prepareStatement("select * from cliente where idcliente=?");
		stmt.setInt(1, idCliente);
		rs = stmt.executeQuery();
		
		Cliente c = null; //sem espaço de memória..
		
		//se registro foi encontrado..
		if(rs.next()){
			c = new Cliente(); //instanciando o cliente..
			c.setIdCliente(rs.getInt("idcliente"));
			c.setNome(rs.getString("nome"));
			c.setEmail(rs.getString("email"));		
		}
		
		stmt.close(); //fechando o statement..
		closeConnection(); //fechando conexão..
		
		return c; //retornar o cliente..
	}
	
}








