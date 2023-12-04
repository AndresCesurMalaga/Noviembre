package programitas;

public class DiasSemana {

	public static void main(String[] args) {

		// [L M X J V]
		char dia = 'L';
		int semana = 0;
		int meses = 0;
		String mes = "Diciembre";

		while (meses < 12) {
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
					System.out.print(" ]");
					dia = 'L';
					semana++;
				}
			}
			System.out.println();
			semana = 0;
			meses++;
		}

	}

}
