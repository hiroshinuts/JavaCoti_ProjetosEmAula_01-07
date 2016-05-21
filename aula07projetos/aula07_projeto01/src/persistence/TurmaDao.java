package persistence;

import entities.Turma;
import entities.types.Periodo;

public class TurmaDao extends Dao{

	//método para gravar um turma na base de dados..
	public void insert(Turma t) throws Exception{
		
		String query = "insert into turma(nome, periodo) values(?,?)";
		
		openConnection();		
		stmt = con.prepareStatement(query);
		stmt.setString(1, t.getNome());
		stmt.setString(2, t.getPeriodo().name());
		stmt.execute();
		stmt.close();		
		closeConnection();
	}
	
	public static void main(String[] args) {
		try{
			
			Turma t = new Turma(null, "PostGreSQL", Periodo.Manha);
			
			TurmaDao d = new TurmaDao();
			d.insert(t); //gravando..
			
			System.out.println("Dados gravados.");
		}
		catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
}






