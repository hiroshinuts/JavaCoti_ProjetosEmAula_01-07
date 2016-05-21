package br.com.brq.persistence;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Classe para conexão no banco de dados, 
 * padrão DAO (Data Access Object)
 * @author Sergio Mendes
 * @version 1.0
 * @since Projeto Aula 05 - Treinamento BRQ/SP
 *
 */
public class Dao {

	/**
	 * Driver de conexão do MySql
	 */
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	/**
	 * URL de acesso ao banco de dados MySql
	 */
	private static final String URL = "jdbc:mysql://localhost:3306/aula05";
	
	/**
	 * Nome do usuario administrador do MySql
	 */
	private static final String USER = "root";
	
	/**
	 * Senha do usuario administrador do MySql
	 */
	private static final String PASSWORD = "brqbrq";
	
	/**
	 * API JDBC para conexão com o banco de dados MySql
	 */
	protected Connection con;
	
	/**
	 * API JDBC para execução de rotinas SQL no banco de dados
	 */
	protected PreparedStatement stmt;
	
	/**
	 * API JDBC para execução de storedprocedures no banco de dados
	 */
	protected CallableStatement call;
	
	/**
	 * API JDBC para leitura de consultas no banco de dados
	 */
	protected ResultSet rs;
	
	/**
	 * Método para abrir conexão com a base de dados MySql
	 * @autor Sergio Mendes
	 * @throws Exception
	 */
	protected void openConnection() throws Exception{
		Class.forName(DRIVER);
		con = DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
	/**
	 * Método para fechar conexão com a base de dados MySql
	 * @autor Sergio Mendes
	 * @throws Exception
	 */
	protected void closeConnection() throws Exception{
		if(con != null){
			con.close();
		}
	}
}











