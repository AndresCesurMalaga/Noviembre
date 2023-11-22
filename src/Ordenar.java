import java.util.Scanner;

public class Ordenar {

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

		System.out.println("escribe 1 para ascendente y 2 para descendente");
		orden = lector.nextInt();

		if (orden == 1) {
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

			System.out.println(a + " " + b + " " + c);
		}

		if (orden == 2) {
			// Ordenar Descendente
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

			System.out.println(a + " " + b + " " + c);
		}
	}

}