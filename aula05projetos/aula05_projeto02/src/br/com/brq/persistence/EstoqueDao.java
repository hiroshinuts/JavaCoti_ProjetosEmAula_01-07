package br.com.brq.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.brq.entities.Estoque;

/**
 * Classe de persistencia para a entidade Estoque
 * @author Sergio Mendes
 * @version 1.0
 * @since Projeto Aula 05 - Treinamento BRQ/SP
 */
public class EstoqueDao extends Dao{

	/**
	 * Método para cadastrar um registro na tabela de estoque
	 * @param e: objeto da Classe Estoque
	 * @autor Sergio Mendes
	 * @throws Exception
	 */
	public void insert(Estoque e) throws Exception{
		
		String query = "insert into estoque(nome, descricao) "
					 + "values(?, ?)";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		stmt.setString(1, e.getNome());
		stmt.setString(2, e.getDescricao());
		stmt.execute();
		stmt.close();
		
		closeConnection();
	}
	
	/**
	 * Método para atualizar um registro na tabela de estoque
	 * @param e: Objeto da Classe Estoque
	 * @autor Sergio Mendes
	 * @throws Exception
	 */
	public void update(Estoque e) throws Exception{
		
		String query = "update estoque set nome = ?, descricao = ? "
					 + "where idestoque = ?";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		stmt.setString(1, e.getNome());
		stmt.setString(2, e.getDescricao());
		stmt.setInt(3, e.getIdEstoque());
		stmt.execute();
		stmt.close();
		
		closeConnection();
	}
	
	/**
	 * Método para excluir um registro na tabela de estoque
	 * @param idEstoque: valor inteiro correspondente a chave primaria
	 * @autor Sergio Mendes
	 * @throws Exception
	 */
	public void delete(Integer idEstoque) throws Exception{
		
		String query = "delete from estoque where idestoque = ?";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		stmt.setInt(1, idEstoque);
		stmt.execute();
		stmt.close();
		
		closeConnection();
	}
	
	/**
	 * Método para consultar todos os registros da tabela estoque
	 * @return Lista contendo os objetos de Estoque obtidos do banco de dados
	 * @autor Sergio Mendes
	 * @throws Exception
	 */
	public List<Estoque> findAll() throws Exception{
		
		String query = "select * from estoque order by idestoque asc";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		rs = stmt.executeQuery();
		
		List<Estoque> lista = new ArrayList<Estoque>(); 
		
		while(rs.next()){
			Estoque e = new Estoque();
			e.setIdEstoque(rs.getInt("idestoque"));
			e.setNome(rs.getString("nome"));
			e.setDescricao(rs.getString("descricao"));
			
			lista.add(e);
		}
		
		closeConnection();
		return lista;
	}
	
	/**
	 * Método para obter 1 Estoque baseado no id
	 * @param idEstoque: valor inteiro correspondente a chave primaria
	 * @return Objeto da Classe Estoque ou null (não encontrado)
	 * @autor Sergio Mendes
	 * @throws Exception
	 */
	public Estoque findById(Integer idEstoque) throws Exception{
		
		String query = "select * from estoque where idestoque = ?";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		stmt.setInt(1, idEstoque);
		rs = stmt.executeQuery();
		
		Estoque e = null;
		
		if(rs.next()){
			e = new Estoque();
			e.setIdEstoque(rs.getInt("idestoque"));
			e.setNome(rs.getString("nome"));
			e.setDescricao(rs.getString("descricao"));
		}
		
		stmt.close();
		closeConnection();
		
		return e;
	}
	
}










