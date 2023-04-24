package ejercicio03;

import java.util.Scanner;

import ejercicio02.Libro;

public class Main {

	public static void main(String[] args) {
		
		int opcion = 0;
		
		int x = 0;
		int y = 0;
		
		int dx = 0;
		int dy = 0;
		
		double dist;
		
		Scanner sc = new Scanner(System.in);	
		
		Punto p = new Punto(x, y);
		
		System.out.println("### PUNTO ###");
		System.out.println("___________________________________");
		System.out.println("|                                 |");
		System.out.println("| 1. Introducir coordenadas       |");
		System.out.println("| 2. Incrementar coordenadas      |");
		System.out.println("| 3. Distancia entre coordenadas  |");
		System.out.println("| 4. Localizar coordenadas        |");
		System.out.println("| 5. Terminar operación           |");
		System.out.println("|_________________________________|");
		System.out.println();

		opcion = sc.nextInt();
		System.out.println();

		while (opcion != 5) {

			switch (opcion) {

			case 1 -> {
				
				System.out.print("Introduzca la coordenada x: ");
				x = sc.nextInt();
				
				System.out.print("Introduzca la coordenada y: ");
				y = sc.nextInt();
				
				p.setXY(x, y);
				
				System.out.println("Realizado correctamente");

			}

			case 2 -> {

				System.out.print("Introduzca el incremento de la coordenada x: ");
				dx = sc.nextInt();
				
				System.out.print("Introduzca el incremento de la coordenada y: ");
				dy = sc.nextInt();
				
				p.desplaza(dx, dy);
				
				System.out.println("Realizado correctamente");

			}
			
			case 3 -> {
				
				dist = p.distancia(p);
				
				System.out.println("La distancia es de: " + dist);
				
			}
			
			case 4 -> {
				
				System.out.print("El punto está en: ");
				p.imprime();
				
			}
			
			default -> {
				
				System.err.println("Opción no válida");
				
			}

			}

			System.out.println("___________________________________");
			System.out.println("|                                 |");
			System.out.println("| 1. Introducir coordenadas       |");
			System.out.println("| 2. Incrementar coordenadas      |");
			System.out.println("| 3. Distancia entre coordenadas  |");
			System.out.println("| 4. Localizar coordenadas        |");
			System.out.println("| 5. Terminar operación           |");
			System.out.println("|_________________________________|");
			System.out.println();

			opcion = sc.nextInt();
			System.out.println();

		}

		System.out.println("Operación finalizada");
		
		sc.close();
		
	}

}
