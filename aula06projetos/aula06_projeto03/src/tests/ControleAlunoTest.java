package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import control.ControleAluno;
import entities.Aluno;
import types.SituacaoAluno;

public class ControleAlunoTest {

	@Test
	public void testObterMedia() {

		try {
			Aluno a = new Aluno(); // entidade..

			a.setIdAluno(1);
			a.setNome("Sergio Mendes");
			a.setNotas(new Double[] { 10.0, 8.0, 10.0, 8.0 });

			ControleAluno c = new ControleAluno(); // classe de controle..

			// Regra -> media deve ser: 9.0 (verificação)
			assertEquals(new Double(9.0), c.obterMedia(a));
		} catch (Exception e) {
			fail("Teste Falhou: " + e.getMessage());
		}
	}

	@Test
	public void testObterSituacaoAprovado() {

		Aluno a1 = new Aluno(1, "Ana", new Double[] { 7.0, 7.0, 7.0, 7.0 });
		Aluno a2 = new Aluno(2, "Rui", new Double[] { 10.0, 10.0, 10.0, 10.0 });

		ControleAluno c = new ControleAluno(); // classe de controle..

		try {
			// verificando se a situação dos alunos é 'Aprovado'
			assertEquals(SituacaoAluno.Aprovado, c.obterSituacao(a1));
			assertEquals(SituacaoAluno.Aprovado, c.obterSituacao(a2));

		} catch (Exception e) {
			fail("Teste Falhou: " + e.getMessage());
		}
	}

	@Test
	public void testObterSituacaoRecuperacao() {

		Aluno a1 = new Aluno(1, "Ana", new Double[] { 6.9, 6.9, 6.9, 6.9 });
		Aluno a2 = new Aluno(2, "Rui", new Double[] { 5.0, 5.0, 5.0, 5.0 });

		ControleAluno c = new ControleAluno(); // classe de controle..

		try {
			// verificando se a situação dos alunos é 'Recuperacao'
			assertEquals(SituacaoAluno.Recuperacao, c.obterSituacao(a1));
			assertEquals(SituacaoAluno.Recuperacao, c.obterSituacao(a2));

		} catch (Exception e) {
			fail("Teste Falhou: " + e.getMessage());
		}
	}

	@Test
	public void testObterSituacaoReprovado() {

		Aluno a1 = new Aluno(1, "Ana", new Double[] { 4.9, 4.9, 4.9, 4.9 });
		Aluno a2 = new Aluno(2, "Rui", new Double[] { 0.0, 0.0, 0.0, 0.0 });

		ControleAluno c = new ControleAluno(); // classe de controle..

		try {
			// verificando se a situação dos alunos é 'Reprovado'
			assertEquals(SituacaoAluno.Reprovado, c.obterSituacao(a1));
			assertEquals(SituacaoAluno.Reprovado, c.obterSituacao(a2));

		} catch (Exception e) {
			fail("Teste Falhou: " + e.getMessage());
		}
	}

	// método para verificar se é lançado uma exceção quando o aluno
	// possui notas fora do intervalo de 0 e 10
	@Test(expected = Exception.class)
	public void testNotasInvalidas() throws Exception {

		Aluno a1 = new Aluno(1, "Ana", new Double[] { -1.0, -1.0, -1.0, -1.0 });
		Aluno a2 = new Aluno(2, "Rui", new Double[] { 11.0, 11.0, 11.0, 11.0 });

		ControleAluno c = new ControleAluno(); // classe de controle..

		c.obterMedia(a1); //deve gerar uma exceção!
		c.obterMedia(a2); //deve gerar uma exceção!
	}

}
