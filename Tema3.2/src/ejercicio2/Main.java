package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Abrimos el scanner
	static Scanner sc = new Scanner(System.in);

	// Método que muestra el menú y devuelve la opción seleccionada por el usuario
	public static int menu() {
		int opc;

		System.out.println("  - - - - - Menú - - - - - ");
		System.out.println(" | 1. Perímetro           |");
		System.out.println(" | 2. Área                |");
		System.out.println(" | 0. Salir               |");
		System.out.println("  - - - - - Menú - - - - -  ");
		System.out.println();
		System.out.println("Dime qué quieres hacer:");
		opc = sc.nextInt();

		return opc;
	}

	// Método para pedir el ancho del rectangulo
	public static double pideAncho() {
		double res = -1;

		// Comprobamos que el valor introducido sea correcto
		do {
			try {
				System.out.println("Dime el ancho del rectángulo:");
				res = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error, el valor introducido no es de un tipo válido");
			} finally {
				sc.nextLine();
			}
		} while (res < 0);

		return res;
	}

	// Método para pedir el alto al usuario
	public static double pideAlto() {
		double res = -1;

		// Comprobamos que el valor introducido sea correcto
		do {
			try {
				System.out.println("Dime el alto del rectángulo:");
				res = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error, el valor introducido no es de un tipo válido");
			} finally {
				sc.nextLine();
			}
		} while (res < 0);

		return res;
	}

	public static void main(String[] args) {

		// Creamos el objeto rectangulo
		Rectangulo rect;

		// Variable para guardar el ancho del rectangulo
		double ancho;
		
		// Variable para guardar el alto del rectangulo
		double alto;
		
		// Variable para guardar la opción del usuario
		int opc;

		// Pedimos tanto el ancho como el alto llamando a los métodos
		ancho = pideAncho();
		alto = pideAlto();

		// Mostramos el menú llamando al método 'menu'
		opc = menu();

		// Creamos el objeto con las dos variables
		rect = new Rectangulo(ancho, alto);

		// Usamos un switch con la opción elegida
		switch (opc) {
		case 1:
			System.out.println("Resultado del perímetro: " + rect.perimetro());
			break;
		case 2:
			System.out.println("Resultado del área: " + rect.area());
			break;
		case 0:
			System.out.println("Saliendo...");
			break;
		default:
			System.out.println("Opción no válida.");
			break;
		}

		// Cerrar el Scanner
		sc.close();
	}
}
