package halloween;
// Prototipo/idea para la actividad de halloween 

import java.util.Scanner;
import java.util.Random;

public class Apocalipsis {

	public static void main(String[] args) {

		int supervivientes;
		int dia = 0;
		int comida = 0;
		int temp;
		boolean arma = false;
		boolean refugio = false;
		Random aleatorio = new Random();
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el número inicial de supervivientes: ");
		supervivientes = teclado.nextInt();

		while ((supervivientes > 0) && (dia < 7)) {

			System.out.println("Dia: " + dia);
			System.out.println("Supervivientes restantes: " + supervivientes);
			System.out.println("Comida restante: " + comida);
			System.out.println("Tengo armas " + arma);
			System.out.println("Tengo refugio " + refugio);

			System.out.println("");

			System.out.println("¿Cuántos van a buscar comida?: ");
			temp = teclado.nextInt();
			for (int x = 0; x < temp; x++) {
				if (aleatorio.nextBoolean()) {
					comida = ((int) (Math.random() * 8) + 1) + comida;
				} else {
					supervivientes = supervivientes - 1;
				}
			} // for
			System.out.println("conseguimos " + comida + " de comida");

			System.out.println("");

			System.out.println("¿Cuántos van a buscar refugio?: ");
			temp = teclado.nextInt();
			for (int x = 0; x < temp; x++) {
				if (aleatorio.nextBoolean() || refugio) {
					refugio = true;
					System.out.println("Conseguimos refugio");
					x = temp;
				} else {
					supervivientes = supervivientes - 1;
				}
			} // for

			System.out.println("");

			System.out.println("¿Cuántos van a buscar armas?: ");
			temp = teclado.nextInt();
			for (int x = 0; x < temp; x++) {
				if (aleatorio.nextBoolean() || arma) {
					arma = true;
					System.out.println("Conseguimos armas");
					x = temp;
				} else {
					supervivientes = supervivientes - 1;
				}

			} // for

			while (comida < supervivientes) { // se mueren de hambre los que no comen
				supervivientes = supervivientes - 1;
			} // while
			comida = comida - supervivientes; // 1 de comida menos por superviviente

			if (!refugio) {
				if (!arma) {
					supervivientes = 0;
				} else {
					arma = false;
				}
			} else {
				if (aleatorio.nextBoolean()) {
					if (arma) {
						System.out.println("Sobrevivimos a un ataque en nuestro refugio gastando las armas");
						arma = false;
					} else {
						System.out.println("Nos mataron a muchos pero sobrevivimos");
						supervivientes = supervivientes / 2;
					}
				}
			}

			System.out.println("");

			dia = dia + 1;
			refugio = false; // reinicio refugio

		} // while() principal

		System.out.println("Fueron rescatados " + supervivientes + " supervivientes");

		if (supervivientes > 0) {
			System.out.println("Enhorabuena sobreviviste al apocalipsis");
		} else {
			System.out.println("No hubo supervivientes :(");
		}

		teclado.close();

	}// main

}// class apocalipsis