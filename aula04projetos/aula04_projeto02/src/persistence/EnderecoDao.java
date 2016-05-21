package persistence;

import entities.Endereco;

public class EnderecoDao extends Dao{

	//método para gravar o endereco na base de dados..
	public void insert(Endereco e) throws Exception{
		
		String query = "insert into endereco(logradouro, cidade, estado, cep, idfuncionario) "
					 + "values(?, ?, ?, ?, ?)";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		stmt.setString(1, e.getLogradouro());
		stmt.setString(2, e.getCidade());
		stmt.setString(3, e.getEstado());
		stmt.setString(4, e.getCep());
		stmt.setInt(5, e.getFuncionario().getIdFuncionario()); //foreign key..
		stmt.execute();
		stmt.close();
		
		closeConnection();		
	}	
}
