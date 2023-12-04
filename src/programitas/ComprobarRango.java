package programitas;
import java.util.Scanner;

public class ComprobarRango {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector=new Scanner(System.in);
		
		int v;
		int ma;
		int me;

		System.out.println("dime el mayor");
		ma=lector.nextInt();
		
		do {
		System.out.println("dime el menor");
		me=lector.nextInt();
		}while(me>ma);
		
		System.out.println("dime el valor");
		v=lector.nextInt();
		
		System.out.println(ValorEnRango(ma,me,v));
		
		lector.close();
	}
	//h es el maximo, l es el minimo, x es el valor a evaluar
	public static boolean ValorEnRango(int h, int l, int x) {

		if (x < h && x > l) {
			return true;
		} else {
			return false;
		}
	}
}
