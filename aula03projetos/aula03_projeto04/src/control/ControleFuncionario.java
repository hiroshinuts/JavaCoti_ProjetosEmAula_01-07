package control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import contracts.IControleFuncionario;
import entities.Funcionario;

public class ControleFuncionario implements IControleFuncionario {

	//atributo..
	private Set<Funcionario> lista;
	
	//construtor..
	public ControleFuncionario() {
		//LinkedHashSet -> mantem a ordem de entrada dos objetos..
		lista = new LinkedHashSet<Funcionario>();
	}
	
	@Override
	public void adicionarFuncionario(Funcionario f) {
		lista.add(f); //adicionando..
	}

	@Override
	public void limparListagemFuncionarios() {
		lista.clear();
	}

	@Override
	public void ordenarListagemFuncionarios() {
		
		List<Funcionario> auxiliar = new ArrayList<Funcionario>(lista);
		Collections.sort(auxiliar); //ordenação..
		
		lista = new LinkedHashSet<Funcionario>(auxiliar);
	}

	@Override
	public Funcionario obterPorId(Integer idFuncionario) {

		for(Funcionario f : lista){
			if(f.getIdFuncionario().equals(idFuncionario)){
				return f; //retornar o funcionario..
			}
		}
		
		return null; //vazio..
	}

	@Override
	public List<Funcionario> obterPorNome(String nome) {

		List<Funcionario> resultado = new ArrayList<Funcionario>();
		
		for(Funcionario f : lista){
			if(f.getNome().toUpperCase().contains(nome.toUpperCase())){
				resultado.add(f);
			}
		}
		
		return resultado;
	}

	@Override
	public List<Funcionario> obterPorSalario(Double salarioIni, Double salarioFim) {

		List<Funcionario> resultado = new ArrayList<Funcionario>();
		
		for(Funcionario f : lista){
			if(f.getSalario() >= salarioIni && f.getSalario() <= salarioFim){
				resultado.add(f);
			}
		}
		
		return resultado;
	}

	@Override
	public List<Funcionario> getListagemFuncionarios() {	
		//criando um ArrayList de funcionario e retornando-o...
		return new ArrayList<Funcionario>(lista);
	}

}
