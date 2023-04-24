package ejercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcion = 0;

		boolean exitoso;
		
		Scanner sc = new Scanner(System.in);	
		
		Libro libro = new Libro("Manolito Gafotas", "Elvira Lindo", 13, 5);
		
		System.out.println("### BIBLIOTECA ###");
		System.out.println("__________________________");
		System.out.println("|                        |");
		System.out.println("| 1. Hacer préstamo      |");
		System.out.println("| 2. Devolver libro      |");
		System.out.println("| 3. Terminar operación  |");
		System.out.println("|________________________|");
		System.out.println();

		opcion = sc.nextInt();
		System.out.println();

		while (opcion != 3) {

			switch (opcion) {

			case 1 -> {
				
				exitoso = libro.prestamo();

				System.out.println(exitoso ? "Realizado correctamente" : "No quedan ejemplares");

			}

			case 2 -> {

				exitoso = libro.devolucion();
				
				System.out.println(exitoso ? "Realizado correctamente" : "No tienes el libro");

			}
			
			default -> {
				
				System.err.println("Opción no válida");
				
			}

			}

			System.out.println("__________________________");
			System.out.println("|                        |");
			System.out.println("| 1. Hacer préstamo      |");
			System.out.println("| 2. Devolver libro      |");
			System.out.println("| 3. Terminar operación  |");
			System.out.println("|________________________|");
			System.out.println();

			opcion = sc.nextInt();
			System.out.println();

		}

		System.out.println("Operación finalizada");
		
		sc.close();
		
	}

}
