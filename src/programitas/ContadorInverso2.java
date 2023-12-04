package programitas;
import java.util.Scanner;

public class ContadorInverso2 {

	public static void main(String[] args) {

		int maximo;
		int minimo;
		int salto;
		int x;

		Scanner lector = new Scanner(System.in);

		do {
			System.out.println("dame el maximo");
			maximo = lector.nextInt();

			System.out.println("dame el minimo");
			minimo = lector.nextInt();

		} while (maximo < minimo);

		System.out.println("dame el salto");
		salto = lector.nextInt();

		x = maximo;
		while (x > minimo - salto&& x>minimo) {
			System.out.print(x + " ");
			x = x - salto;
		}

		System.out.println("while hecho");

		x = maximo;
		do {
			System.out.print(x + " ");
			x = x - salto;
		} while (x > minimo - salto && x>minimo);

		System.out.println("do-while hecho");

		for (x = maximo; x > minimo - salto&& x>minimo; x = x - salto) {
			System.out.print(x + " ");
		}

		System.out.println("for hecho");
	}
}