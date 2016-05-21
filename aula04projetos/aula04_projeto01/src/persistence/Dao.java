package persistence;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Data Access Object -> padrão para classes de acesso a banco de dados
//JDBC - tecnologia Java utilizando para conexão com base de dados
//Java Database Connectivity
public class Dao {

	//atributos (constantes -> static final)
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/aula04";
	private static final String USER = "root";
	private static final String PASSWORD = "brqbrq";
	
	//Principais APIs (Classes e Interfaces do JDBC)
	protected Connection con; //realiza a conexão com o banco de dados..
	protected PreparedStatement stmt; //executar comandos SQL..
	protected CallableStatement call; //executar storedprocedures..
	protected ResultSet rs;	//ler resultados de consultas..
	
	//métodos para abrir e fechar conexão com o banco de dados..
	protected void openConnection() throws Exception{
		//carregar o caminho do driver do banco de dados...
		Class.forName(DRIVER);
		//abrindo conexão com o banco de dados..
		con = DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
	protected void closeConnection() throws Exception{
		if(con != null){ //se ha instancia de conexão..
			con.close(); //fechar conexão..
		}
	}
	
}
