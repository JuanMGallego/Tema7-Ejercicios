package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opcion = 0;

		boolean exitoso;

		CuentaCorriente cuenta = new CuentaCorriente("05694878D", "Manolo Lama", 123.55);

		Scanner sc = new Scanner(System.in);

		System.out.println("### CAJERO ###");
		System.out.println("__________________________");
		System.out.println("|                        |");
		System.out.println("| 1. Retirar dinero      |");
		System.out.println("| 2. Ingresar dinero     |");
		System.out.println("| 3. Mostrar información |");
		System.out.println("| 4. Terminar operación  |");
		System.out.println("|________________________|");
		System.out.println();

		opcion = sc.nextInt();
		System.out.println();

		while (opcion != 4) {

			switch (opcion) {

			case 1 -> {

				System.out.print("Introduzca cantidad a retirar: ");
				exitoso = cuenta.sacarDinero(sc.nextDouble());
				System.out.println();

				System.out.println(exitoso ? "Realizado correctamente" : "Saldo insuficiente");

			}

			case 2 -> {

				System.out.print("Introduzca cantidad a ingresar: ");
				cuenta.ingresarDinero(sc.nextDouble());
				System.out.println();
				
				System.out.println("Realizado correctamente");

			}
			case 3 -> {

				cuenta.mostrarInfo();

			}
			
			default -> {
				
				System.err.println("Opción no válida");
				
			}

			}

			System.out.println("__________________________");
			System.out.println("|                        |");
			System.out.println("| 1. Retirar dinero      |");
			System.out.println("| 2. Ingresar dinero     |");
			System.out.println("| 3. Mostrar información |");
			System.out.println("| 4. Terminar operación  |");
			System.out.println("|________________________|");
			System.out.println();

			opcion = sc.nextInt();
			System.out.println();

		}

		System.out.println("Operación finalizada");
		
		sc.close();

	}

}
