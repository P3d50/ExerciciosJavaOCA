package declaracaoeinicializacaodevariaveis;

public class InicializacaoDeVariaveis {
	
	static String varDeInstancia = "Variável de classe[static] independe de instância";
	
	String inicializacaoDeVariaveisLocais = "Inicialização de Variáveis Locais:\n"
			+ "Variáveis locais tem que ser inicializadas antes de serem utilizadas\n"
			+ "escopo desde a abertura \"{\" até o fim \"}\" do bloco\n"
			+ "temos que garantir que elas sejam inicializadas, caso haja alguma condição\n"
			+ "onde a variável não é inicializada gera um erro de compilação\n\n";
	
	String inicializacaoDeVariaveisDeInstanciaClasse = "Inicialização de Variáveis de Classe(static) e Instância(new):\n"
			+ "	recebem valores default caso não tenham sido inicializadas\n"
			+ "	Escopo desde a declaração \"static\" até o fim do programa, independe de instância\n"
			+ "	Escopo desde a criação \"new\" até o objeto ser coletado, depende de instancia\n"
			+ "	boolean recebe \"false\"\n"
			+ "	byte,short,int,long recebe \"0\" (tamanho em bits do tipo)\n"
			+ "	float,double recebe \"0.0\" (tamanho em bits do tipo)\n"
			+ "	char recebe \'\\u0000\' (null)\n"
			+ "	Referência a Objetos recebe \"null\"";
	
	public int soma() {
		int x = 1;
		int y;
		//return x+y; //The local variable y may not have been initialized
		y = 2;
		return x+y;
	}
	
	public void resposta(boolean ok){
		int r1;
		int r2;
		if(ok) {
			r1 = 1;r2 = 1;
		}
		else {
			r1 = 1;
		}
		
		System.out.println(r1);
		//System.out.println(r2);//The local variable r2 may not have been initialized
		
	}
	
	/*
	 * As variáveis quantidadeDePedacos e fatias são variáveis locais 
	 * só podem ser usadas dentro do método "comer(int fatias)"
	 */
	public String comer(int fatias,int pedacos){
		int quantidadeDePedacos = pedacos;
		String retorno = "comeu "+(quantidadeDePedacos>1?quantidadeDePedacos+" pedaços":"um pedaço")+" de "+fatias+" fatias";
		return retorno;
	}
	
	public void comerSeFaminto(boolean faminto,int pedacos){
		if(faminto) {
			String comeu = comer(5,pedacos);
			System.out.println(comeu);
		}
		
		//System.out.println(comeu);//comeu cannot be resolved to a variable
		
	}
	
	{
		System.out.println(inicializacaoDeVariaveisLocais);
		System.out.println(inicializacaoDeVariaveisDeInstanciaClasse);
		comerSeFaminto(true,5);
		comerSeFaminto(true,1);
		System.out.println(soma());
		resposta(true);				
	}
	
	public static void main(String arg[]) {
		new InicializacaoDeVariaveis();
		
	}
	
	{
		System.out.println(varDeInstancia);
	}

}
