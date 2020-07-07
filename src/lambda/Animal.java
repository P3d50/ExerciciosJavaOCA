package lambda;
import java.util.ArrayList;

public class Animal {
	
	public String nome = "";
    boolean pula = false;
     boolean nada = false;
     boolean voa = false;
	
	
	
	public Animal(String nome, boolean pula,boolean nada,boolean voa) {
		this.nome = nome;
		this.pula = pula;
		this.nada = nada;
		this.voa= voa;
	}
	
	public boolean isPula(){
		
		return this.pula;
		
	}
	public  String getData(){
		return (
				this.nome+
				(this.pula?" pula,":" não pula,")+
				(this.nada?"nada,":"não nada,")+
				(this.voa?"voa":"não voa" )
				);
	}
	
	public String toString() {
		return this.getData();
	}

}
