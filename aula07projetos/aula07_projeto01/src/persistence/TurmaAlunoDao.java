package persistence;

import java.util.ArrayList;
import java.util.List;

import dto.AlunoQtdTurmasDto;
import dto.TurmaAlunoDto;
import dto.TurmaQtdAlunosDto;

public class TurmaAlunoDao extends Dao {

	// gravar um registro na entidade associativa..
	public void insert(Integer idTurma, Integer idAluno) throws Exception {

		String query = "insert into turma_aluno(idturma, idaluno) values(?, ?)";

		openConnection();
		stmt = con.prepareStatement(query);
		stmt.setInt(1, idTurma);
		stmt.setInt(2, idAluno);
		stmt.execute();
		stmt.close();
		closeConnection();
	}

	// método para consultar e retornar os dados da view..
	public List<TurmaAlunoDto> findAll() throws Exception {

		String query = "select * from vw_turmasalunos";

		openConnection();
		stmt = con.prepareStatement(query);
		rs = stmt.executeQuery();

		List<TurmaAlunoDto> lista = new ArrayList<TurmaAlunoDto>();

		while (rs.next()) { // enquanto houver registros..
			TurmaAlunoDto dto = new TurmaAlunoDto();

			dto.setIdTurma(rs.getInt("idturma"));
			dto.setNomeTurma(rs.getString("nometurma"));
			dto.setPeriodo(rs.getString("periodo"));
			dto.setIdAluno(rs.getInt("idaluno"));
			dto.setNomeAluno(rs.getString("nomealuno"));
			dto.setEmail(rs.getString("email"));

			lista.add(dto); // adicionar na lista..
		}

		stmt.close();
		closeConnection();

		return lista; // retornando a lista..
	}

	// método para obter a quantidade de alunos por turma..
	public List<TurmaQtdAlunosDto> findAllQtdAlunos() throws Exception {

		String query = "select * from vw_turmaqtdalunos";

		openConnection();

		stmt = con.prepareStatement(query);
		rs = stmt.executeQuery();

		List<TurmaQtdAlunosDto> lista = new ArrayList<TurmaQtdAlunosDto>();

		while (rs.next()) { // enquanto houver registros na consulta..
			TurmaQtdAlunosDto dto = new TurmaQtdAlunosDto();
			dto.setIdTurma(rs.getInt("idturma"));
			dto.setNomeTurma(rs.getString("nometurma"));
			dto.setPeriodo(rs.getString("periodo"));
			dto.setQtdAlunos(rs.getInt("qtd_alunos"));

			lista.add(dto); // adicionar na lista..
		}

		stmt.close();
		closeConnection();

		return lista; // retornando a lista..
	}

	// método para obter a quantidade de turmas por aluno..
	public List<AlunoQtdTurmasDto> findAllQtdTurmas() throws Exception {

		String query = "select * from vw_alunoqtdturmas";

		openConnection();

		stmt = con.prepareStatement(query);
		rs = stmt.executeQuery();

		List<AlunoQtdTurmasDto> lista = new ArrayList<AlunoQtdTurmasDto>();

		while (rs.next()) { // enquanto houver registros na consulta..
			AlunoQtdTurmasDto dto = new AlunoQtdTurmasDto();
			dto.setIdAluno(rs.getInt("idaluno"));
			dto.setNomeAluno(rs.getString("nomealuno"));
			dto.setEmail(rs.getString("email"));
			dto.setQtdTurmas(rs.getInt("qtd_turmas"));

			lista.add(dto); // adicionar na lista..
		}

		stmt.close();
		closeConnection();

		return lista; // retornando a lista..
	}

	public static void main(String[] args) {

		try {
			TurmaAlunoDao d = new TurmaAlunoDao();
			// d.insert(5, 1); //gravando..
			// System.out.println("Dados gravados");

			// exibir a consulta...
			// for(TurmaAlunoDto dto : d.findAll()){
			// System.out.println(dto); //toString()
			// }

			for (AlunoQtdTurmasDto dto : d.findAllQtdTurmas()) {
				System.out.println(dto); // toString
			}

		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
	}

}
