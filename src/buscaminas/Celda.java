package buscaminas;

public class Celda {

	private boolean bomb;
	private boolean visible;
	private int num;
	
	void modB(int valor,int dif){
		if(valor<dif) {
			bomb=false;
		}else {
			bomb=true;
		}
	}
	
	void modI(int x) {
		num=x;
	}
	
	boolean getB() {
		return bomb;
	}
	
	void clear(){
		bomb=false;
		num=0;
		visible=false;
	}

	boolean getvisible() {
		return visible;
	}
	
	void modV(boolean x) {
		visible=x;
	}
	
	int getnum() {
		return num;
	}
	
	public Celda(){
		this.bomb=false;
		this.num=0;
		this.visible=false;
	}
}
