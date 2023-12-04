package retos;
// Muestre y cuente los números que son múltiplos de 2 o de 3 que hay entre 1 y 100.

public class Reto3 {

	public static void main(String[] args) {

		final int x = 2;
		final int y = 3;

		final int max = 100;
		final int min = 1;

		System.out.println("Hay " + max / x + " numeros divisibles entre " + x+":");
		System.out.println();
		
		for (int tmp = min + 1; tmp < max + x; tmp = tmp + x) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Hay " + max / y + " numeros divisibles entre " + y+":");
		System.out.println();
		
		for (int tmp = min; tmp < max; tmp = tmp + x) {
			System.out.print(tmp+" ");
		}
		
	}
}