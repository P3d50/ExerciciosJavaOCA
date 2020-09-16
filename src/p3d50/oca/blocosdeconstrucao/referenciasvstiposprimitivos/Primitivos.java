package p3d50.oca.blocosdeconstrucao.referenciasvstiposprimitivos;

/*
 * boolean  = true/false 	- verdadeito ou falso
 * byte  	= -128/127		- valor inteiro de 8 bits -  dois elevado a oito 256 possibilidades
 * short	= 3267			- valor inteiro de 16 bits
 * int 		= 2147483647	- valor inteiro de 32 bits
 * long		= 2147483648L	- valor inteiro de 64 bits
 * float 	= 2147483648.45f- valor de ponto flutuante de 32 bits
 * double	= 2147483648.45 - valor de ponto flutuante de 64 bits
 * char		= 'a'			- valor Unicode de 16 bits
 * 
 * 
 */


public class Primitivos {
	
	public static void main(String arg[]) {
		
	  //long max = 2147483648;não compila
		long max = 2147483648L;

		System.out.println(max);
		
	  //tipo primitivo não possui métodos nem atributos, não pode receber null
	  // int x = null; //Não compila
	  //max.legnth() - Não compila	
		
		/*
		 * base numérica
		 */
		System.out.println(10);//decimal
		System.out.println(0b11);//binário
		System.out.println(07);//octal
		System.out.println(0xF);//hexadecimal
		
		int million = 1_000_000;//desde java7
		System.out.println(million);
		
		//int million = _1000;//Não compila
		//int million = 1000_;//Não compila
		//float million = 1_000_._00; //Não compila
		 million = 1_00__00;
		 System.out.println(million);
	}

}
