package p3d50.oca.blocosdeconstrucao.destruindoobjetos;

public class DestruindoObjetos {
	
	String destruindoObjetos = "		Destruindo Objetos - Garbage Collection\n"
			+ "			É invocado quando a JVM precisa liberar espaço na memória\n\n"
			+ "	System.gc(); - pode ser chamado programaticamento porém\n"
			+ "	não há garantia que vai executar o GC\n"
			+ "			* É uma singela sugestão para a JVM\n"
			+ "	Quando os objetos estão elegiveis para serem excluídos da memória??\n"
			+ "			*O objeto não possui mais nenhuma referência apontando para ele.\n"
			+ "			*Todas as referências ao objeto estão fora do escopo de execução.";

	{
		System.out.println(destruindoObjetos);
	}
	public static void main(String arg[]) {
		new DestruindoObjetos();
		new Escopo();
		System.gc();
	}
	

}

class Escopo{
	
	Escopo(){
		String um,dois;
		um = new String("a");//um aponta para a String "a"
		dois = new String("b");//dois aponta para a String "b"
		um = dois; 
		/* um passa a apontar para o mesmo objeto de dois, 
		 * então a String "a" perde a referência passando a ser elegível 
		 * de ser destruida pelo Garbage Collection
		 * 
		 */
		String tres = um; //tres também passa a apontar para b 
		um = null;
	}
	
	
	 String finalize = "\nQuando o Garbage Collection coleta um objeto\n"
	 		+ "ele chama o método finalize().\n"
	 		+"que pode ser implementado dentro da classe,\n"
	 		+ "e nunca é chamado mais de uma vez\n";
	 		
	  protected void finalize() {
		  System.out.println(finalize);
	  }
	 
}
