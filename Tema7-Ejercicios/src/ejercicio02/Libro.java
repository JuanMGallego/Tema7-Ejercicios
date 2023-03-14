package ejercicio02;

public class Libro {

	String t�tulo;
	String autor;
	int ejemplares;
	int prestados;
	
	public Libro() {
		super();
	}

	public Libro(String t�tulo, String autor, int ejemplares, int prestados) {
		super();
		this.t�tulo = t�tulo;
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
