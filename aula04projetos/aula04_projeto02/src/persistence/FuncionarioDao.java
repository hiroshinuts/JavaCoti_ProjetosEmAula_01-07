package persistence;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Endereco;
import entities.Funcionario;
import util.FormatacaoData;

public class FuncionarioDao extends Dao{

	public Integer insert(Funcionario f) throws Exception{
		
		String query = "insert into Funcionario(nome, salario, dataadmissao) "
					 + "values(?, ?, ?)";
		
		openConnection(); //abrir conexão..
		
		stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
		stmt.setString(1, f.getNome());
		stmt.setDouble(2, f.getSalario());
		stmt.setString(3, FormatacaoData.convertToString(f.getDataAdmissao()));
		stmt.execute();
		
		rs = stmt.getGeneratedKeys(); //executar a consulta que irá obter a chave..
		rs.next(); //mover o cursor do ResultSet para o registro da chave..
		
		Integer chave = rs.getInt(1); //1) unico dado..
		
		stmt.close();		
		closeConnection(); //fechar conexão..
		
		return chave; //retornar a chave..
	}
	
	//método para listar os funcionarios da tabela com endereco.
	public List<Funcionario> findAll() throws Exception{
		
		String query = "select f.idfuncionario, f.nome, f.salario, f.dataadmissao, "
					 + "e.idendereco, e.logradouro, e.cidade, e.estado, e.cep "
					 + "from funcionario as f inner join endereco as e "
					 + "on f.idfuncionario = e.idfuncionario";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		rs = stmt.executeQuery();
		
		List<Funcionario> lista = new ArrayList<Funcionario>(); //lista vazia..
		
		while(rs.next()){ //enquanto houver registros..
			
			Funcionario f = new Funcionario();
			f.setEndereco(new Endereco());
			
			f.setIdFuncionario(rs.getInt("idfuncionario"));
			f.setNome(rs.getString("nome"));
			f.setSalario(rs.getDouble("salario"));
			f.getEndereco().setIdEndereco(rs.getInt("idendereco"));
			f.getEndereco().setLogradouro(rs.getString("logradouro"));
			f.getEndereco().setCidade(rs.getString("cidade"));
			f.getEndereco().setEstado(rs.getString("estado"));
			f.getEndereco().setCep(rs.getString("cep"));
			
			lista.add(f); //adicionando na lista..
		}
		
		stmt.close();
		closeConnection();
		
		return lista; //retornando a lista..
	}
	
	
}


















