package p3d50.oca.blocosdeconstrucao.declaracaoeinicializacaodevariaveis;

public class DeclaracaoDeVariaveis {
	
	int x, y;
	//int x, inty; //Não compila
	int d;int e; 
	//int f; g; //Não compila
	int z = 1, w = 2;
	int a,b,c = 2;
	
	//int x, String y; //Não compila
	
	String regrasDosIdentificadores ="\n"+
	  "Regras dos identificadores:variáveis, classes, interfaces,métodos\n"+
	  "o nome deve iniciar com letra ou $ ou _\n"+
	  "nos caracteres seguintes pode haver números\n"+
	  "Palavras reservadas não podem ser utilizadas\n"+
	  
	  "Lembre-se: Java é case sensitive";
	  
	 
	
	
	
	{
		System.out.println(x);
		System.out.println(regrasDosIdentificadores);
		
	}
	
	public static void main(String arg[] ){
		new DeclaracaoDeVariaveis();
	}
}
