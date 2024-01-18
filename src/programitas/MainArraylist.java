package programitas;
/*
array[100]
imprimir por pantalla 10
imprimir los pares
imprimir los impares
 */

import java.util.Random;

public class MainArraylist {

	public static void main(String[] args) {

		Arraylist Lista = new Arraylist(100);

		Arraylist LImpares;
		Arraylist LPares;

		Lista.llenarRandom();

		LPares = new Arraylist(Lista.contardivisble(2, 0));

		LImpares = new Arraylist(Lista.contardivisble(2, 1));

		UtilArraylist.unoADos(LPares, LImpares, Lista);

		// Lista.mostrar();
		// LPares.mostrar();
		// LImpares.mostrar();

		UtilArraylist.dosAUno(LPares, LImpares, Lista);

		// Lista.mostrar();
		// LPares.mostrar();
		// LImpares.mostrar();
	}

}