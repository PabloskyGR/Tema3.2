package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Abrimos el scanner
	static Scanner sc = new Scanner(System.in);

	// Método que muestra el menú y devuelve la opción seleccionada por el usuario
	public static int menu() {
		int opc;

		System.out.println("  - - - - - Menú - - - - - ");
		System.out.println(" | 1. Circunferencia      |");
		System.out.println(" | 2. Área                |");
		System.out.println(" | 0. Salir               |");
		System.out.println("  - - - - - Menú - - - - -  ");
		System.out.println();
		System.out.println("Dime qué quieres hacer:");
		opc = sc.nextInt();

		return opc;
	}

	// Método que pide al usuario el radio del círculo
	public static double pideRadio() {
		double res = -1;

		do {
			try {
				System.out.println("Dime el radio del círculo:");
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
		
		// Creamos el objeto circulo
		Circulo circ; 

		// Pedimos el radio llamando al método 'pideRadio'
		double radio = pideRadio();
		
		// Mostramos el menú llamando al método 'menu' 
		int opc = menu();

		// Creamos un objeto con el radio introducido
		circ = new Circulo(radio);

		// Usamos un switch para realizar la opción que haya introducido el usuario
		switch (opc) {
		case 1:
			System.out.println("La circunferencia del círculo es de: " + circ.Circunferencia());
			break;
		case 2:
			System.out.println("El área del círculo es de: " + circ.Area());
			break;
		case 0:
			System.out.println("Saliendo...");
			break;
		default:
			System.out.println("Opción no válida.");
		}

		// Cerramos el scanner
		sc.close();
	}
}
