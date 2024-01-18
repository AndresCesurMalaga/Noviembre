package programitas;

public class UtilArraylist {

	UtilArraylist() {
	}

	public static void unoADos(Arraylist a, Arraylist b, Arraylist grande) {
		for (int x = 0; x < grande.obtenerTAM(); x++) {
			if (grande.Obtener(x) % 2 == 0) {
				a.insertarUltimo(grande.Obtener(x));
			} else {
				b.insertarUltimo(grande.Obtener(x));
			}
		}
		grande.reset();
	}

	public static void dosAUno(Arraylist a, Arraylist b, Arraylist grande) {

		int i = 0;
		int k = 0;

		for (int x = 0; x < grande.obtenerTAM(); x++) {
			if (i < a.obtenerTAM()) {
				grande.insertarUltimo(a.sacarUltimo());
				i++;
			}
			if (k < b.obtenerTAM()) {
				grande.insertarUltimo(b.sacarUltimo());
				k++;
			}
		}
		a.reset();
		b.reset();
	}

}
