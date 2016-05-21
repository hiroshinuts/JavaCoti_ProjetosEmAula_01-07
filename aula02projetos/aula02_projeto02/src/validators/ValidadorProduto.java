package validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//classe para valida��o dos atributos de produto
public class ValidadorProduto {

	//m�todo para validar o id de um produto..
	public boolean validarIdProduto(Integer idProduto){
		return idProduto > 0; //true, false
	}
	
	//m�todo para validar o nome de um produto..
	public boolean validarNome(String nome){
		
		//Express�es Regulares (REGEX)
		//regra: nome s� devera conter letras, numeros, espa�os, 
		//de 3 a 30 caracteres..
		Pattern p = Pattern.compile("^[A-Za-z�-��-�0-9\\s]{3,30}$");
		Matcher m = p.matcher(nome);

		//retornar o nome passou na regra do regex..
		return m.matches(); //true, false
	}
	
	//m�todo para validar o pre�o do produto..
	public boolean validarPreco(Double preco){
		return preco > 0 && preco <= 10000;
	}
	
}




