package ejercicio02;

public class Libro {

	String título;
	String autor;
	int ejemplares;
	int prestados;
	
	public Libro() {
		super();
	}

	public Libro(String título, String autor, int ejemplares, int prestados) {
		super();
		this.título = título;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}
	
	public boolean prestamo() {
		
		boolean exitoso = false;
		
		if (prestados < ejemplares) {
			
			exitoso = true;
			
			prestados++;
			
		}
		
		return exitoso;
		
	}
	
}
