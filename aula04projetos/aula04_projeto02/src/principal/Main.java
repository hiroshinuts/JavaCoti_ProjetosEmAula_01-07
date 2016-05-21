package principal;

import java.util.Calendar;
import java.util.GregorianCalendar;

import entities.Endereco;
import entities.Funcionario;
import persistence.EnderecoDao;
import persistence.FuncionarioDao;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setNome("Sergio Mendes");
		f.setSalario(1000.0);
		
		//gerar uma data no java..
		//ano, mes - 1, dia
		Calendar cal = new GregorianCalendar(2016, 4, 16);
		f.setDataAdmissao(cal.getTime()); //passando como date..
		
		Endereco e = new Endereco();
		e.setLogradouro("Rua Boa Vista 254, 9 andar");
		e.setCidade("Sao Paulo");
		e.setEstado("SP");
		e.setCep("25000-000");

		try{
			
			FuncionarioDao fd = new FuncionarioDao();
			Integer idFuncionario = fd.insert(f); //gravando..
			
			System.out.println("Dados gravados com sucesso.");
			System.out.println("Id do Funcionario: " + idFuncionario);
			
			//incluindo o id no objeto funcionario..
			f.setIdFuncionario(idFuncionario);
			e.setFuncionario(f); //relacionando o endereco ao funcionario..
			
			EnderecoDao ed = new EnderecoDao();
			ed.insert(e); //gravando o endereco..
			
			System.out.println("Endereco cadastrado com sucesso.");
			
			//exibir os funcionarios com endereco..
			System.out.println("\nConsulta de Funcionarios:");
			
			for(Funcionario func : fd.findAll()){
				
				System.out.println(func); //toString()
				System.out.println(func.getEndereco()); //toString()
				System.out.println("...");
			}
			
		}
		catch(Exception ex){
			System.out.println("Erro: " + ex.getMessage());
		}
	}

}






