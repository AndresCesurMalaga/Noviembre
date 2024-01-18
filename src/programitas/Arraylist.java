package programitas;

import java.util.Random;

public class Arraylist {

	int[] Array;
	int ne;

	public int obtenerTAM() {
		return Array.length;
	}

	Arraylist(int TAM) {
		Array = new int[TAM];
		ne = 0;
	}

	public void reset() {
		this.ne = 0;
	}

	public boolean insertar(int x) {
		boolean ok;

		if (Array.length > ne) {
			Array[ne] = x;
			ne++;
			ok = true;
		} else {
			ok = false;
		}
		return ok;
	}

	public int sacarUltimoBruto() {
		this.ne--;
		return Array[ne];
	}

	public int sacarUltimo() {
		if (ne > 0) {
			ne--;
			return Array[ne];
		} else {
			return -1;
		}
	}

	public void insertarUltimoBruto(int x) {
		Array[ne] = x;
		ne++;
	}

	public void insertarUltimo(int x) {
		if (ne < Array.length) {
			Array[ne] = x;
			ne++;
		} else {
			System.out.println("lleno");
		}
	}

	public int Obtener(int x) {
		if (x < ne) {
			return Array[x];
		} else {
			return -1;
		}
	}

	public void llenar() {
		for (int x = 0; x < Array.length; x++) {
			Array[x] = x;
		}
	}

	public void llenarRandom() {

		Random aleatorio = new Random();

		for (int x = 0; x < Array.length; x++) {
			Array[x] = aleatorio.nextInt(100);
			ne++;
		}
	}

	public void mostrar() {
		System.out.println("lista de todos los numeros");
		for (int x = 0; x < ne; x++) {
			System.out.println(Array[x]);
		}
	}

	public void mostrarP() {
		System.out.println("lista de todos los numeros Pares");
		for (int x = 0; x < ne; x++) {
			if (Array[x] % 2 == 0) {
				System.out.println(Array[x]);
			}
		}
	}

	public void mostrarI() {
		System.out.println("lista de todos los numeros Impares");
		for (int x = 0; x < ne; x++) {
			if (Array[x] % 2 == 1) {
				System.out.println(Array[x]);
			}
		}
	}

	public int contardivisble(int div, int resto) {
		int cont = 0;
		System.out.print("Contando los divisibles: ");
		for (int x = 0; x < Array.length; x++) {
			if (Array[x] % div == resto) {
				cont++;
			}
		}
		System.out.println(cont);
		return cont;
	}

}// Arraylist
