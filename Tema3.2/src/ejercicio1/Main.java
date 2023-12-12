package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Abrimos el scanner
	static Scanner sc = new Scanner(System.in);

	// Método para mostrar el menú y saber que quiere hacer el usuario
	public static int menu() {
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

		// Utilizamos un bucle while para comprobar que sea correcto el número itnroducido
		while (true) {
			try {
				System.out.println("Dime qué quieres hacer:");
				opc = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Error, el tipo introducido no es válido");
			} finally {
				sc.nextLine(); 
			}
		}

		return opc;
	}

	// Método para pedir un número al usuario
	public static double pideNumero() {
		double num;

		// Utilizamos un bucle do-while para solicitar un número que sea válido
		do {
			try {
				System.out.println("Introduzca un número:");
				num = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Error: Debes ingresar un número decimal.");
			} finally {
				sc.nextLine();
			}
		} while (true);

		return num;
	}

	public static void main(String[] args) {
		
		// Variable donde guardaremos la opción que elija el usuario
		int opc;
		
		// Variables donde guardaremos los números que introduzcan el usuario
		double num1, num2;

		// Creamos el objeto Operaciones 
		Operaciones op;

		// Utilizamos un bucle while para mostrar el menú hasta que el usuario quiera salir del programa
		while (true) {
			opc = menu();

			// Si pulsa '0' se saldrá del programa
			if (opc == 0) {
				System.out.println("Saliendo...");
				break; 
			}

			// Pedimos los número usando el método pideNumero
			num1 = pideNumero();
			num2 = pideNumero();

			// Creamos el objeto Operaciones con los números introducidos por el usuario
			op = new Operaciones(num1, num2);

			// Usamos un switch con las opciones
			switch (opc) {
			case 1:
				System.out.println("Resultado de la suma: " + op.suma());
				break;
			case 2:
				System.out.println("Resultado de la resta: " + op.resta());
				break;
			case 3:
				System.out.println("Resultado de la multiplicación: " + op.multiplicacion());
				break;
			case 4:
				System.out.println("Resultado de la división: " + op.division());
				break;
			case 5:
				System.out.println("Máximo: " + op.maximo());
				break;
			case 6:
				System.out.println("Mínimo: " + op.minimo());
				break;
			default:
				System.out.println("Opción no válida. Inténtalo de nuevo.");
			}
		}

		// Cerramos el scanner
		sc.close();
	}

}
