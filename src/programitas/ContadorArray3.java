package programitas;
import java.util.Random;

public class ContadorArray3 {

	public static void main(String[] args) {
		// -eficente en memoria
		// +eficiente en velocidad

		final int TAM;
		TAM = 10;

		Random aleatorio = new Random();

		int[] lista = new int[TAM];

		int[] listaPares = new int[TAM];

		int[] listaImpares = new int[TAM];

		int listp = 0;
		int listi = 0;

		// llenar lista
		for (int x = 0; x < TAM; x++) {
			lista[x] = aleatorio.nextInt(100);
		}

		for (int x = 0; x < TAM; x++) {
			if (lista[x] % 2 == 0) {
				listaPares[listp] = lista[x];
				listp++;
			} else {
				listaImpares[listi] = lista[x];
				listi++;
			}
		}

		Ordenar(listaPares, TAM, true);
		Ordenar(listaImpares, TAM, true);

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

	static void Ordenar(int[] lista, int TAM, boolean asc) {
		int tmp;
		boolean cambio = false;

		if (asc) {
			do {
				cambio = false;
				for (int x = 0; x < TAM - 1; x++) {
					if (lista[x] < lista[x + 1]) {
						tmp = lista[x];
						lista[x] = lista[x + 1];
						lista[x + 1] = tmp;
						cambio = true;
					}
				}
			} while (cambio);
		} else {
			do {
				cambio = false;
				for (int x = 0; x < TAM - 1; x++) {
					if (lista[x] > lista[x + 1]) {
						tmp = lista[x];
						lista[x] = lista[x + 1];
						lista[x + 1] = tmp;
						cambio = true;
					}
				}
			} while (cambio);
		}
	}
}
