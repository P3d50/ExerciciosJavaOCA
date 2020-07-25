package ordemdoselementos;

public class OrdemDosElementos {
	
	String ordemDosElementos = "				Ordem dos elementos em Java:\n\n"
			+ "Elemento				Obrigatório				Onde:\n\n"
			+ "package a.b.c.d;			não				primeira linha\n"
			+ "import java.util.*;			não				logo após package\n"
			+ "public class C{}			sim				logo após import\n"
			+ "int valor;				não				qualquer lugar dentro da classe\n"
			+ "void metodo();				não				qualquer lugar dentro da classe\n\n"
			+ "Apesar de não serem obrigatórios, caso existam, pacotes e imports devem \n"
			+ "estar na ordem acima. Para memorização utiliza-se o\n"
			+ "acrônimo PIC[package,import,class]. \n"
			+ "Métodos e variáveis não tem ordem obrigatória entre si porém\n"
			+ "devem estar dentro da classe";
	{
		System.out.println(ordemDosElementos);
	}
	
	public static void main(String arg[]) {
		new OrdemDosElementos();
	}

}
