package blocosDeConstrucao;

/*
 * Exemplo da estrutura de uma classe
 */

//classe com modificador de acesso "public" deve estar em um arquivo com o mesmo nome
//deve haver apenas uma classe public para cada arquivo, posso ter várias classes e 
//nenhuma ser public	
public class Animal {
	
	//atributos e métodos são "membros da classe" - singleline
	String nome;
	
	/** - javadoc
	 *  Método para obter o nome do animal 
	 *  
	 * @return String - nome do animal
	 * @author noname
	 */
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		/* multiline
		 * recebe uma String e atribui ao nome do animal
		 */
		nome = novoNome;
	}
	

}
