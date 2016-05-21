package br.com.brq.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.brq.entities.Estoque;
import br.com.brq.entities.Produto;

/**
 * Classe de persistencia para a entidade Estoque
 * @author Sergio Mendes
 * @version 1.0
 * @since Projeto Aula 05 - Treinamento BRQ/SP
 */
public class ProdutoDao extends Dao{

	/**
	 * Método para cadastrar um registro na tabela de produto
	 * @param p: objeto da Classe Produto
	 * @autor Sergio Mendes
	 * @throws Exception
	 */
	public void insert(Produto p) throws Exception{
		
		String query = "insert into produto(nome, preco, quantidade, idestoque) "
					 + "values(?, ?, ?, ?)";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		stmt.setString(1, p.getNome());
		stmt.setDouble(2, p.getPreco());
		stmt.setInt(3, p.getQuantidade());
		stmt.setInt(4, p.getEstoque().getIdEstoque());
		stmt.execute();
		stmt.close();
		
		closeConnection();
	}
	
	/**
	 * Método para atualizar um registro na tabela de produto
	 * @param p: Objeto da Classe Produto
	 * @autor Sergio Mendes
	 * @throws Exception
	 */
	public void update(Produto p) throws Exception{
		
		String query = "update produto set nome = ?, preco = ?, quantidade = ?, idestoque = ? "
					 + "where idestoque = ?";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		stmt.setString(1, p.getNome());
		stmt.setDouble(2, p.getPreco());
		stmt.setInt(3, p.getQuantidade());
		stmt.setInt(4, p.getEstoque().getIdEstoque());
		stmt.setInt(5, p.getIdProduto());
		stmt.execute();
		stmt.close();
		
		closeConnection();
	}
	
	/**
	 * Método para excluir um registro na tabela de produto
	 * @param idProduto: valor inteiro correspondente a chave primaria
	 * @autor Sergio Mendes
	 * @throws Exception
	 */
	public void delete(Integer idProduto) throws Exception{
		
		String query = "delete from produto where idproduto = ?";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		stmt.setInt(1, idProduto);
		stmt.execute();
		stmt.close();
		
		closeConnection();
	}
	
	/**
	 * Método para consultar todos os registros da tabela produto
	 * @return Lista contendo os objetos de Produto obtidos do banco de dados
	 * @autor Sergio Mendes
	 * @throws Exception
	 */
	public List<Produto> findAll() throws Exception{
		
		String query = "select p.idproduto, p.nome as nomeproduto, p.preco, p.quantidade, " 
					 + "e.idestoque, e.nome as nomeestoque, e.descricao "
					 + "from produto p inner join estoque e "
					 + "on e.idestoque = p.idestoque";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		rs = stmt.executeQuery();
		
		List<Produto> lista = new ArrayList<Produto>(); 
		
		while(rs.next()){
			Produto p = new Produto();
			p.setEstoque(new Estoque());
			
			p.setIdProduto(rs.getInt("idproduto"));
			p.setNome(rs.getString("nomeproduto"));
			p.setPreco(rs.getDouble("preco"));
			p.setQuantidade(rs.getInt("quantidade"));
			p.getEstoque().setIdEstoque(rs.getInt("idestoque"));
			p.getEstoque().setNome(rs.getString("nomeestoque"));
			p.getEstoque().setDescricao(rs.getString("descricao"));
			
			lista.add(p);
		}
		
		closeConnection();
		return lista;
	}
	
	/**
	 * Método para obter 1 Produto baseado no id
	 * @param idProduto: valor inteiro correspondente a chave primaria
	 * @return Objeto da Classe Produto ou null (não encontrado)
	 * @autor Sergio Mendes
	 * @throws Exception
	 */
	public Produto findById(Integer idProduto) throws Exception{
		
		String query = "select p.idproduto, p.nome as nomeproduto, p.preco, p.quantidade, " 
				 + "e.idestoque, e.nome as nomeestoque, e.descricao "
				 + "from produto p inner join estoque e "
				 + "on e.idestoque = p.idestoque "
				 + "where idproduto = ?";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		stmt.setInt(1, idProduto);
		rs = stmt.executeQuery();
		
		Produto p = null;
		
		if(rs.next()){
			p = new Produto();
			p.setEstoque(new Estoque());
			
			p.setIdProduto(rs.getInt("idproduto"));
			p.setNome(rs.getString("nomeproduto"));
			p.setPreco(rs.getDouble("preco"));
			p.setQuantidade(rs.getInt("quantidade"));
			p.getEstoque().setIdEstoque(rs.getInt("idestoque"));
			p.getEstoque().setNome(rs.getString("nomeestoque"));
			p.getEstoque().setDescricao(rs.getString("descricao"));
		}
		
		stmt.close();
		closeConnection();
		
		return p;
	}
	
}










