package contracts;

//<T> tipo de dado generico..
public interface IControle<T> {

	//m�todo para exportar dados..
	//em uma interface os metodos s�o implicitamente
	//publicos e abstratos (somente assinatura)
	
	void exportarDados(T obj) throws Exception;
	
}
