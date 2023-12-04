package buscaminas;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// menu();
		// // generar();
		// // mostrar();
		// // leer();
		// // // actualizar();

		Scanner teclado=new Scanner(System.in);
		
		int f=10;
		int c=10;
		int fila;
		int columna;
		
		boolean vivo=true;
		
		Tabla tabla=new Tabla(f,c);
		
		tabla.generate(f, c, 70);
		
		tabla.mostrar();
		//System.out.println();
		//tabla.mostrar();
		
		tabla.iniTabla();
		
		//tabla.visibilizar();
		
		//tabla.mostrar();
		
		while(vivo) {
			System.out.println("Di la coordenada x");
			fila=teclado.nextInt();
			
			System.out.println("Di la coordenada y");
			columna=teclado.nextInt();
			
			vivo=tabla.evaluar(fila, columna);
			
			tabla.actualizar();
			
			tabla.mostrar();
		}
		
		tabla.visibilizar();
		
		tabla.mostrar();
		System.out.println("Ñam ñam, te comiste una bomba y te moriste");
		
		teclado.close();
	}

}
