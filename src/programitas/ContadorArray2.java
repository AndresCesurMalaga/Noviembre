import java.util.Random;

public class ContadorArray2 {

	public static void main(String[] args) {
		// +eficente en memoria
		// -eficiente en velocidad

		final int TAM;
		TAM = 10;

		Random aleatorio = new Random();

		int[] lista = new int[TAM];

		int[] listaPares;
		int[] listaImpares;

		int listp = 0;
		int listi = 0;

		// llenar lista
		for (int x = 0; x < TAM; x++) {
			lista[x] = aleatorio.nextInt(100);
		}

		// contar pares y impares
		for (int x = 0; x < TAM; x++) {
			if (lista[x] % 2 == 0) {
				listp++;
			} else {
				listi++;
			}
		}

		listaPares = new int[listp];
		listaImpares = new int[listi];
		listp = 0;
		listi = 0;

		for (int x = 0; x < TAM; x++) {
			if (lista[x] % 2 == 0) {
				listaPares[listp] = lista[x];
				listp++;
			} else {
				listaImpares[listi] = lista[x];
				listi++;
			}
		}

		System.out.println("Muestro Pares");

		for (int x = 0; x < listp; x++) {
			System.out.println(listaPares[x]);
		}

		System.out.println();
		System.out.println("Muestro Impares");

		for (int x = 0; x < listi; x++) {
			System.out.println(listaImpares[x]);
		}

	}
}
