package blocosDeConstrucao;

public class MetodoMain {
	
	//método main é o ponto inicial de execução da classe, 
	// a jvm procura um método com essa assinatura e executa
	public static void main(String ... arg) {
	
		System.out.println(arg[0]);
		System.out.println(arg[1]);
	}
	/*
	 * caso execute a classe sem passar no mínimo dois argumentos
	 * gera uma uncheckedException(ArrayIndexOutOfBoundsException
	 *  pois o método main acessa duas posições de arg
	*/

}
