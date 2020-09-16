package p3d50.oca.blocosdeconstrucao.referenciasvstiposprimitivos;



 
public class Referencias {
	
	static java.util.Date hoje;
	static String saudacao;
	static String s = null;
	static String tipoReferencia = "\n"+

	"Tipo referência aponta para um objeto, uma instância de classe "+
	"guardada na memória.\n"+
 
 	"Tipo referência pode ser null";
	
	public static void main(String arg[]) {
		//hoje aponta para o endereço da memória do objeto Date
		hoje = new java.util.Date();
		
		//saudacao aponta para o endereco da memória do objeto "Olá"
		saudacao = "Olá";
		
		System.out.println(hoje);
		System.out.println(saudacao);
		System.out.println(saudacao.length());
		System.out.println(s);
		System.out.println(tipoReferencia);
		
		
	}

}
