package ejercicio01;

public class CuentaCorriente {

	String dni;
	String nombre;
	double saldo;
	
	public CuentaCorriente(String dni, double saldo) {
		super();
		this.dni = dni;
		this.saldo = saldo;
	}

	public CuentaCorriente(String dni, String nombre, double saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public boolean sacarDinero(double retirar) {
		
		boolean exitoso = false;
		
		if (retirar <= saldo) {
			
			saldo -= retirar;
			
			exitoso = true;
			
		}
		
		return exitoso;
		
	}
	
	public void ingresarDinero(double ingresar) {
		
		saldo += ingresar;
		
	}
	
	public void mostrarInfo() {
		
		System.out.println("Dni: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Saldo: " + saldo);
		
	}
	
}
