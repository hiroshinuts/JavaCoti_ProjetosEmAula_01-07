package validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//classe para validação dos atributos de produto
public class ValidadorProduto {

	//método para validar o id de um produto..
	public boolean validarIdProduto(Integer idProduto){
		return idProduto > 0; //true, false
	}
	
	//método para validar o nome de um produto..
	public boolean validarNome(String nome){
		
		//Expressões Regulares (REGEX)
		//regra: nome só devera conter letras, numeros, espaços, 
		//de 3 a 30 caracteres..
		Pattern p = Pattern.compile("^[A-Za-zÀ-Üà-ü0-9\\s]{3,30}$");
		Matcher m = p.matcher(nome);

		//retornar o nome passou na regra do regex..
		return m.matches(); //true, false
	}
	
	//método para validar o preço do produto..
	public boolean validarPreco(Double preco){
		return preco > 0 && preco <= 10000;
	}
	
}




