package retos;
// Pida un número por teclado hasta que éste sea positivo
// Muestra los primeros 20 números sucesivos a dicho número.

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int x;
		
		do{
		System.out.println("Escribe un numero positivo");
		x=lector.nextInt();
		}while(x < 0);
		
		x=x+1;
		for (int max=x+20; x < max; x++) {
			System.out.println(x);
		}
		
		lector.close();
	}
}