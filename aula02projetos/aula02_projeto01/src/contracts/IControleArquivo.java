package contracts;

import entities.Funcionario;

public interface IControleArquivo {

	//Regras sobre interfaces..
	/*
	 * Interfaces só podem ter atributos se estes forem constantes
	 * Interfaces não possuem construtores
	 * Métodos de interface não posuem corpo, apenas assinatura
	 * Todo método de interface ja é implicitamente public abstract
	 * Em interfaces são podemos ter metodos private, default ou protected
	 */
	
	void abrirArquivo(); //método abstrato
	
	void gravarDados(Funcionario f); //metodo abstrato
	
	void fecharArquivo(); //metodo abstrato
	
}
