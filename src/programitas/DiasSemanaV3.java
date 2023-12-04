package programitas;
import java.util.Scanner;

public class DiasSemanaV3 {

	public static void main(String[] args) {

		// [L M X J V S D]
		dibujarDiasAño();
	}

	private static void dibujarDiasAño() {

		int x = 0;
		Scanner leer = new Scanner(System.in);

		while (x > 336 || x < 1) {
			System.out.println("Escribe cuantos dias quieres mostrar");
			System.out.println("El maximo es 336 y el minimo 1");
			x = leer.nextInt();
		}

		leer.close();

		if (x == 336) {
			dibujarMeses();
		} else {
			dibujarMeses(x);
		}
	}

	private static void dibujarMeses() {
		int mesesFinal = 12;
		int meses = 0;
		String mes = "Diciembre";

		while (meses < mesesFinal) {
			if (mes == "Diciembre") {
				System.out.print("Enero ");
				mes = "Enero";
			} else if (mes == "Enero") {
				System.out.print("Febrero ");
				mes = "Febrero";
			} else if (mes == "Febrero") {
				System.out.print("Marzo ");
				mes = "Marzo";
			} else if (mes == "Marzo") {
				System.out.print("Abril ");
				mes = "Abril";
			} else if (mes == "Abril") {
				System.out.print("Mayo ");
				mes = "Mayo";
			} else if (mes == "Mayo") {
				System.out.print("Junio ");
				mes = "Junio";
			} else if (mes == "Junio") {
				System.out.print("Julio ");
				mes = "Julio";
			} else if (mes == "Julio") {
				System.out.print("Agosto ");
				mes = "Agosto";
			} else if (mes == "Agosto") {
				System.out.print("Septiembre ");
				mes = "Septiembre";
			} else if (mes == "Septiembre") {
				System.out.print("Octubre ");
				mes = "Octubre";
			} else if (mes == "Octubre") {
				System.out.print("Noviembre ");
				mes = "Noviembre";
			} else if (mes == "Noviembre") {
				System.out.print("Diciembre ");
				mes = "Diciembre";
			}
			meses++;
			dibujarSemanas();
		}
		System.out.println();
	}

	private static void dibujarMeses(int diasTotal) {
		String mes = "Diciembre";
		int meses = 0;
		int mesesFinal;
		mesesFinal = diasTotal / 28;

		while (meses < mesesFinal+1) {
			if (mes == "Diciembre") {
				System.out.print("Enero ");
				mes = "Enero";
			} else if (mes == "Enero") {
				System.out.print("Febrero ");
				mes = "Febrero";
			} else if (mes == "Febrero") {
				System.out.print("Marzo ");
				mes = "Marzo";
			} else if (mes == "Marzo") {
				System.out.print("Abril ");
				mes = "Abril";
			} else if (mes == "Abril") {
				System.out.print("Mayo ");
				mes = "Mayo";
			} else if (mes == "Mayo") {
				System.out.print("Junio ");
				mes = "Junio";
			} else if (mes == "Junio") {
				System.out.print("Julio ");
				mes = "Julio";
			} else if (mes == "Julio") {
				System.out.print("Agosto ");
				mes = "Agosto";
			} else if (mes == "Agosto") {
				System.out.print("Septiembre ");
				mes = "Septiembre";
			} else if (mes == "Septiembre") {
				System.out.print("Octubre ");
				mes = "Octubre";
			} else if (mes == "Octubre") {
				System.out.print("Noviembre ");
				mes = "Noviembre";
			} else if (mes == "Noviembre") {
				System.out.print("Diciembre ");
				mes = "Diciembre";
			}
			if (meses == mesesFinal) {
				dibujarSemanas(diasTotal);
			} else {
				dibujarSemanas();
			}
			meses++;
			diasTotal = diasTotal - 28;
			if(diasTotal==0) {
				meses++;
			}
		}
		if (diasTotal < 28 && meses==0) {
			System.out.print("Enero ");
		}
		
		dibujarSemanas(diasTotal);
		System.out.println();
	}

	private static void dibujarSemanas() {
		char dia = 'L';
		int semana = 0;
		while (semana < 4) {
			if (dia == 'L') {
				System.out.print(" [");
				System.out.print(" L");
				dia = 'M';
			} else if (dia == 'M') {
				System.out.print(" M");
				dia = 'X';
			} else if (dia == 'X') {
				System.out.print(" X");
				dia = 'J';
			} else if (dia == 'J') {
				System.out.print(" J");
				dia = 'V';
			} else if (dia == 'V') {
				System.out.print(" V");
				dia = 'S';
			} else if (dia == 'S') {
				System.out.print(" S");
				dia = 'D';
			} else if (dia == 'D') {
				System.out.print(" D");
				System.out.print(" ]");
				dia = 'L';
				semana++;
			}
		}
		System.out.println();
	}

	private static void dibujarSemanas(int diasTotal) {
		char dia = 'L';
		int dias = 0;
		int semana = 0;

		while (semana < 4 && dias < diasTotal) {
			if (dia == 'L' && dias < diasTotal) {
				System.out.print(" [");
				System.out.print(" L");
				dia = 'M';
				dias++;
			} else if (dia == 'M' && dias < diasTotal) {
				System.out.print(" M");
				dia = 'X';
				dias++;
			} else if (dia == 'X' && dias < diasTotal) {
				System.out.print(" X");
				dia = 'J';
				dias++;
			} else if (dia == 'J' && dias < diasTotal) {
				System.out.print(" J");
				dia = 'V';
				dias++;
			} else if (dia == 'V' && dias < diasTotal) {
				System.out.print(" V");
				dia = 'S';
				dias++;
			} else if (dia == 'S' && dias < diasTotal) {
				System.out.print(" S");
				dia = 'D';
				dias++;
			} else if (dia == 'D' && dias < diasTotal) {
				System.out.print(" D");
				System.out.print(" ]");
				dia = 'L';
				dias++;
				semana++;
			}
			if (dia != 'L' && dias == diasTotal) {
				System.out.print(" ]");
			}
		}
	}

}