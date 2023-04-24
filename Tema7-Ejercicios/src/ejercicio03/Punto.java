package ejercicio03;

public class Punto {

	private int x;
	private int y;
	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void imprime() {
		
		System.out.println("(" + x + ", " + y + ")");
		
	}
	
	public void setXY(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public void desplaza(int dx, int dy) {
		
		this.x += dx;
		this.y += dy;
		
	}
	
	public double distancia(Punto p) {
		
		double dist;
		
		dist = Math.sqrt(Math.pow(2, this.x - p.x) + Math.pow(2, this.y - p.y));
		
		return dist;
		
	}
	
}
