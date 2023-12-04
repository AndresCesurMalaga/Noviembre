package retos;
// Pida al usuario 3 números y un orden de ordenamiento, que puede ser ascendente o descendente
// Según el orden indicado se mostrarán en pantalla dichos números.

import java.util.Scanner;

public class Reto4 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		int orden = 0;
		int tmp = 0;

		System.out.println("dame el primero");
		a = lector.nextInt();
		System.out.println("dame el segundo");
		b = lector.nextInt();
		System.out.println("dame el tercero");
		c = lector.nextInt();

		do {

			System.out.println("escribe 1 para ascendente y 2 para descendente");
			orden = lector.nextInt();

		} while ((orden != 1) && (orden != 2));

		if (orden == 2) {
			// Ordenar Descendente
			if (a < b) {
				tmp = a;
				a = b;
				b = tmp;
			}

			if (b < c) {
				tmp = b;
				b = c;
				c = tmp;
			}

			if (a < b) {
				tmp = a;
				a = b;
				b = tmp;
			}

		}

		if (orden == 1) {
			// Ordenar Ascendente
			if (a > b) {
				tmp = a;
				a = b;
				b = tmp;
			}

			if (b > c) {
				tmp = b;
				b = c;
				c = tmp;
			}

			if (a > b) {
				tmp = a;
				a = b;
				b = tmp;
			}

		}
		System.out.println(a + " " + b + " " + c);
	}

}