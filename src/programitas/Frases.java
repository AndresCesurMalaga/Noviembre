package programitas;
import java.util.Scanner;

public class Frases {

	private static final int CANTIDAD=10;
	private static String[] cadenas=new String[CANTIDAD];
	
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("escribe la cadena");
		for(int x=0;x<CANTIDAD;x++) {
			cadenas[x]=generate('a');
			System.out.println(cadenas[x]);
		}
		
	}
	
	private static String getValue(String[] cadenas, int pos) {
		
		if(cadenas.length<pos) {
			return cadenas[pos];
		}else {
		return "";
		}
	}
	
	private String getValue(int pos) {
		if(cadenas.length<pos) {
			return cadenas[pos];
		}else {
		return "";
		}
	}
	
	private static void setValue(String[] cadenas, int pos, String nuevacadena) {
		if(cadenas.length<pos) {
			cadenas[pos]=nuevacadena;
		}
	}
	
	
	private static String generate(char ini) {
		char letra;
		String cad="";
		letra=(char) (ini + 1);
		return cad=cad+letra;
	}
	
	/* void setValue(String[] cadenas, int pos, String nuevacadena) {
		
	} */

}
