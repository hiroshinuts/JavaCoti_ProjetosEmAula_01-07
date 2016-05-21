package contracts;

import entities.Funcionario;

public interface IControleArquivo {

	//Regras sobre interfaces..
	/*
	 * Interfaces s� podem ter atributos se estes forem constantes
	 * Interfaces n�o possuem construtores
	 * M�todos de interface n�o posuem corpo, apenas assinatura
	 * Todo m�todo de interface ja � implicitamente public abstract
	 * Em interfaces s�o podemos ter metodos private, default ou protected
	 */
	
	void abrirArquivo(); //m�todo abstrato
	
	void gravarDados(Funcionario f); //metodo abstrato
	
	void fecharArquivo(); //metodo abstrato
	
}
