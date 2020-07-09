package blocosDeConstrucao;

/*
 * Aula sobre criação de objetos
 * 
 * 								  invocação do método construtor - método construtor não tem tipo de retorno					
 * é utilizado: variável = "new"        "nomeDaClasse()";
 */
public class Galinha extends Animal {
	
	int numOvos = 0;//inicialização na declaração da variável
	
	public Galinha() {
		//é comun usar os método construtor para inicializar as variáveis/atributos da classe na instanciação do objeto
		this.nome = "Pintadinha";
	}
	
	//caso nenhum construtor seja definido explicitamento é gerado um construtor default que não recebe parâmetro
	//caso definido explicitamento um construtor que recebe parâmetro o construtor default não é gerado

	public static void main(String arg[]) {
		Galinha galinha = new Galinha();
		galinha.numOvos = 1; //setando variável de instancia
		System.out.println("Galinha "+galinha.nome+", tem "+galinha.numOvos+" ovos ");//lendo variável de instancia
	}
	
	{System.out.println("bloco inicializador de instânvcia, dentro do escopo da classe");}
	// em blocos de inicialização de instância atentar se os atributos utilizados já foram inicializados
	
	/*
	 * atributos e inicializadores de instancia são executados na ordem que aparecem no arquivo de cima para baixo
	 * o construtor é inicializado após os atributos e bloco inicializador de instancia
	 */
}
