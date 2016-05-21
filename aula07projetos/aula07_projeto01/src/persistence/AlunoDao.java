package persistence;

import entities.Aluno;

public class AlunoDao extends Dao{

	//método para gravar um aluno na base de dados..
	public void insert(Aluno a) throws Exception{
		
		String query = "insert into aluno(nome, email) values(?,?)";
		
		openConnection();		
		stmt = con.prepareStatement(query);
		stmt.setString(1, a.getNome());
		stmt.setString(2, a.getEmail());
		stmt.execute();
		stmt.close();		
		closeConnection();
	}
	
	public static void main(String[] args) {
		try{
			
			Aluno a = new Aluno(null, "Sergio Mendes", "sergio@gmail.com");
			
			AlunoDao d = new AlunoDao();
			d.insert(a); //gravando..
			
			System.out.println("Dados gravados.");
		}
		catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
}






