package contracts;

import java.util.List;

import entities.Funcionario;

//nivel abstrato (abstração)
public interface IControleFuncionario {

	//adicionar 1 funcionario na lista
	void adicionarFuncionario(Funcionario f);
	
	//limpar o conteudo da lista
	void limparListagemFuncionarios();
	
	//ordenar a lista
	void ordenarListagemFuncionarios();
	
	//buscar 1 Funcionario pelo id dentro da lista
	Funcionario obterPorId(Integer idFuncionario);
	
	//buscar funcionarios pelo nome dentro da lista
	List<Funcionario> obterPorNome(String nome);
	
	//buscar funcionarios pelo salario dentro da lista
	List<Funcionario> obterPorSalario(Double salarioIni, Double salarioFim);
	
	//retornar todos os funcionarios da lista
	List<Funcionario> getListagemFuncionarios();	
}



