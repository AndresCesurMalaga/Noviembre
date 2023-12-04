package buscaminas;
import java.util.Random;

public class Tabla {

	private Celda[][] casilla;

	int fila;
	int columna;

	// limpia la tabla
	public void clear() {
		for (int x = 0; x < fila; x++) {
			for (int y = 0; y < columna; y++) {
				casilla[x][y].clear();
			}
		}
	}

	// genera la tabla con las filas y columnas y b
	public void generate(int filas, int columnas, int dif) {
		Random aleatorio = new Random();

		for (int x = 0; x < fila; x++) {
			for (int y = 0; y < columna; y++) {
				casilla[x][y].modB(aleatorio.nextInt(100), dif);
			}
		}

	}

	// inicializa el num
	private void iniNum(int Posx, int Posy) {
		int num = 0;
		boolean oky = true;
		boolean okx = true;

		// compruebo las b de alrededor
		for (int x = Posx - 1; x <= Posx + 1 && okx; x++) {
			if (x < 0) {
				x++;
			}

			if (x >= fila) {
				x = fila - 1;
				okx = false;
			}

			for (int y = Posy - 1; y <= Posy + 1 && oky; y++) {
				if (y < 0) {
					y++;
				}

				if (y >= columna) {
					y = columna - 1;
					oky = false;
				}

				if (casilla[x][y].getB()) {
					num++;
				}

			}
		}

		casilla[Posx][Posy].modI(num);
		// System.out.println(Posx+" "+num+" "+Posy); //debug
	}

	// inicializa la tabla
	public void iniTabla() {
		for (int x = 0; x < fila; x++) {
			for (int y = 0; y < columna; y++) {
				iniNum(x, y);
				// System.out.println(x+" "+y);//debug
			}
		}
	}

	public void visibilizar() {
		for (int x = 0; x < fila; x++) {
			for (int y = 0; y < columna; y++) {
				casilla[x][y].modV(true);
			}
		}
	}

	// evalua la coordenada
	//// falso si moriste
	public boolean evaluar(int x, int y) {
		casilla[x][y].modV(true);
		if (casilla[x][y].getB()) {
			return false;
		} else {
			return true;
		}
	}

	public Tabla(int x, int y) {
		this.fila = x;
		this.columna = y;

		this.casilla = new Celda[this.fila][this.columna];

		for (x = 0; x < fila; x++) {
			for (y = 0; y < columna; y++) {
				this.casilla[x][y] = new Celda();
			}
		}

	}

	// muestra la tabla
	public void mostrar() {
		for (int x = 0; x < fila; x++) {
			for (int y = 0; y < columna; y++) {

				if (casilla[x][y].getvisible()) {
					if (!casilla[x][y].getB()) {
						System.out.print(" " + casilla[x][y].getnum() + " ");
					} else {
						System.out.print(" X ");
					}
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}

	// actualiza para mostrar todos los vacios adjacentes
	public void actualizar() {
		boolean loes = false;

		// recorrer la tabla
		for (int Posx = 0; Posx < fila; Posx++) {
			for (int Posy = 0; Posy < columna; Posy++) {

				loes = false;
				// ver si es visible
				boolean oky = true;
				boolean okx = true;

				// compruebo las b de alrededor
				for (int x = Posx - 1; x <= Posx + 1 && okx; x++) {
					if (x < 0) {
						x++;
					}

					if (x >= fila) {
						x = fila - 1;
						okx = false;
					}

					for (int y = Posy - 1; y <= Posy + 1 && oky; y++) {
						if (y < 0) {
							y++;
						}

						if (y >= columna) {
							y = columna - 1;
							oky = false;
						}
						
						if (casilla[x][y].getvisible()&&(x==Posx || y==Posy)) {
							loes = true;
						}

					}

				}

				if (loes&&(!casilla[Posx][Posy].getB())) {
					casilla[Posx][Posy].modV(true);
				}

			}
		}

	}
}
