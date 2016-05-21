package persistence;

import java.util.ArrayList;
import java.util.List;

import entities.Mensagem;
import util.FormatacaoData;

public class MensagemDao extends Dao{

	//método para gravar uma mensagem na base de dados..
	public void insert(Mensagem msg) throws Exception{
		
		String query = "insert into mensagem(emaildest, assunto, conteudo, dataenvio) "
					 + "values(?, ?, ?, ?)";
		
		openConnection();		
		stmt = con.prepareStatement(query);
		stmt.setString(1, msg.getEmailDest());
		stmt.setString(2, msg.getAssunto());
		stmt.setString(3, msg.getConteudo());
		stmt.setString(4, FormatacaoData.convertToString(msg.getDataEnvio()));
		stmt.execute();
		stmt.close();
		
		closeConnection();
	}
	
	//método para listar todas as mensagem cadastradas na tabela..
	public List<Mensagem> findAll() throws Exception{
		
		String query = "select * from mensagem order by dataenvio desc";
		
		openConnection();
		stmt = con.prepareStatement(query);
		rs = stmt.executeQuery();
		
		List<Mensagem> lista = new ArrayList<Mensagem>();
		
		while(rs.next()){
			Mensagem msg = new Mensagem(); //entidade..
			msg.setIdMensagem(rs.getInt("idmensagem"));
			msg.setEmailDest(rs.getString("emaildest"));
			msg.setAssunto(rs.getString("assunto"));
			msg.setConteudo(rs.getString("conteudo"));
			msg.setDataEnvio(FormatacaoData.convertToDate(rs.getString("dataenvio")));
			
			lista.add(msg);
		}		
		stmt.close();
		closeConnection();
		
		return lista; //retornando a lista..
	}
	
}












