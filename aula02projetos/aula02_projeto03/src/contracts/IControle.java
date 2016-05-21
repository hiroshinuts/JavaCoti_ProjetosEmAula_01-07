package contracts;

//<T> tipo de dado generico..
public interface IControle<T> {

	//método para exportar dados..
	//em uma interface os metodos são implicitamente
	//publicos e abstratos (somente assinatura)
	
	void exportarDados(T obj) throws Exception;
	
}
