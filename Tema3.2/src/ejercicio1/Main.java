package ejercicio1;

import java.util.InputMismatchException;

// Cambiar el bucle do-while por un bucle while
// Meter operaciones op en una variable
// Quitar el caso 0 del switch

import java.util.Scanner;

public class Main {

	// Creamos el scanner fuera para poder llamarlo en todas las funciones que
	// necesitemos
	static Scanner sc = new Scanner(System.in);

	public static int menu() {

		// Variable donde guardaremos la opción que elija el usuario
		int opc;

		// Mostramos el menú
		System.out.println("  - - - - - Menú - - - - - ");
		System.out.println(" | 1. Suma                |");
		System.out.println(" | 2. Resta               |");
		System.out.println(" | 3. Multiplicación      |");
		System.out.println(" | 4. División            |");
		System.out.println(" | 5. Máximo              |");
		System.out.println(" | 6. Mínimo              |");
		System.out.println(" | 0. Salir               |");
		System.out.println("  - - - - - Menú - - - - -  ");
		System.out.println();
		System.out.println("Dime que quieres hacer:");
		opc = sc.nextInt();

		// Devolvemos la opción que haya introducido el usuario
		return opc;

	}

	public static double pideNumero() {
		// Variable donde guardaremos el número que introduzca el usuario
		double num = -1;
		// Usamos un bucle do-while para pedir un número cada vez que sea menor de 0
		do {
			try {
				System.out.println("Introduzca un número:");
				num = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido es decimal");
			} finally {
				sc.nextLine();
			}

		} while (num < 0);

		return num;
	}

	public static void main(String[] args) {

		// Variable donde guardaremos la opción que introduzca el usuario
		int opc;

		// Variables donde guardaremos el num1 y num2 que introduzca el usuario
		double num1, num2;

		// Usamos un bucle do-while para mostrar el menú hasta que salga del programa
		do {

			//
			opc = menu();

			//
			num1 = pideNumero();

			//
			num2 = pideNumero();

			//
			Operaciones op = new Operaciones(num1, num2);

			//
			switch (opc) {
			//
			case 1:
				System.out.println("Resultado de la suma: " + op.suma());
				break;
			//
			case 2:
				System.out.println("Resultado de la resta: " + op.resta());
				break;
			//
			case 3:
				System.out.println("Resultado de la multiplicación: " + op.multiplicacion());
				break;
			//
			case 4:
				System.out.println("Resultado de la división: " + op.division());
				break;

			//
			case 5:
				System.out.println("Máximo: " + op.maximo());
				break;

			//
			case 6:
				System.out.println("Mínimo: " + op.minimo());
				break;
			//
			case 0:
				System.out.println("Saliendo...");
				break;
			//
			default:
				System.out.println("Opción no válida. Inténtalo de nuevo.");
			}
		} while (opc != 0);

		//
		sc.close();
	}

}
