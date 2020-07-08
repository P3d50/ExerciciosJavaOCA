//definição do pacote ao qual a classe pertence
package blocosDeConstrucao;

//importando a classe ArrayList
import java.util.ArrayList;

// wildcard importa todas as classes do pacote java.util
import java.util.*;

//import redundante 
import java.lang.System;


// wildcard não importa sub-pacotes, tem que ir até o ultimo nível de pacote
//para então importar as classes do pacote

//não pode utilizar dois wildcards no mesmo import

//pode usar import estático para importar membros estáticos da classe,
//import convencional é apenas para classe


//em conflito de nome de nome,caso um dos imports vá até o nível da classe
// a jvm considera que essa classe é a que sera instanciada/usada
//caso tenha conflito tem que usar o caminho do pacote para definir o atributo: linha 38 
import java.util.Date; 
import java.sql.Date;

/*Compilando de Executando
 * Compilando:em linha de comando caso uma classe ou mais tenha dependencia em
 * outro pacote deve ser especificado todos os pacotes/classe.java
 * Executando: java package.classeA sendo classeA a que contém o método main
*/


public class Zoologico {
	
	java.sql.Date data; 
	
	
	public static void main(String arg[]) {
		
		ArrayList<Animal> animais = new ArrayList<>();
		
		Animal tigre = new Animal();
		tigre.setNome("Tigre");
		animais.add(tigre);
		Animal girafa = new Animal();
		girafa.setNome("Girafa");
		animais.add(girafa);
		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		animais.add(camelo);
		
		animais.forEach(a->System.out.println(a.getNome()));
		
		
	}

}
