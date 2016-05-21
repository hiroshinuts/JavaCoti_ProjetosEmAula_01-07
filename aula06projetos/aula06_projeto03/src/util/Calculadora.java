package util;

public class Calculadora {

	private Integer num1;
	private Integer num2;
	
	public Calculadora(Integer num1, Integer num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Integer somar(){
		return num1 + num2;
	}
	
	public Integer subtrair(){
		return num1 - num2;
	}
	
	public Integer multiplicar(){
		return num1 * num2;
	}
	
	public Integer dividir() throws Exception{
		if(num2 > 0){
			return num1 / num2;
		}
		else{
			throw new Exception("Erro. Divisão por zero.");
		}
	}
	
}
