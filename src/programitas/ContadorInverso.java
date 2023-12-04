package programitas;
//1200 a 620
//1 while
//2 do while
//3 for
public class ContadorInverso {

	public static void main(String[] args) {
		
		final int MAXIMO=1200;
		final int MINIMO=620;
		int x;
		
		x=MAXIMO;
		while(x>MINIMO-20) {
			System.out.print(x+" ");
			x=x-20;
		}
		
		System.out.println("while hecho");
		
		x=MAXIMO;
		do{
			System.out.print(x+" ");
			x=x-20;
		}while(x>MINIMO-20);
		
		System.out.println("do-while hecho");
		
		for(x=MAXIMO;x>MINIMO-20;x=x-20) {
			System.out.print(x+" ");
		}
		
		System.out.println("for hecho");
	}
}