package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Abrimos el scanner
	static Scanner sc = new Scanner(System.in);

	// Método para mostrar el menú y pedir una opción
	public static int menu() {
		int opc;

		System.out.println("  - - - - - Menú - - - - - ");
		System.out.println(" | 1. Volumen             |");
		System.out.println(" | 2. Área                |");
		System.out.println(" | 0. Salir               |");
		System.out.println("  - - - - - Menú - - - - -  ");
		System.out.println();
		System.out.println("Dime que quieras hacer:");
		opc = sc.nextInt();

		return opc;
	}

	// Método para pedirle al usuario la base del radio
	public static double pideRadioBase() {
		double res = -1;

		// Comprobamos que el valor introducido sea válido
		do {
			try {
				System.out.println("Dime la base del radio: ");
				res = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error, el valor introducido no es de un tipo válido");
			} finally {
				sc.nextLine();
			}
		} while (res < 0);

		return res;
	}

	// Método para pedirle al usuario la altura del radio
	public static double altura() {
		double res = -1;

		// Comprobamos que el valor introducido sea válido
		do {
			try {
				System.out.println("Dime la altura del cilindro");
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
		// Creaamos el objeto cilindro
		Cilindro cil;

		// Variable donde gaurdaremos la base del radio
		double radioBase = pideRadioBase();

		// Variable donde guardaremos la altura del cilindro
		double altura = altura();

		// Variable para mostrar el menu y pedir una opción
		int opc = menu();

		// Creamos un nuevo objeto cilindro con los valores radioBase y altura
		cil = new Cilindro(radioBase, altura);

		// Usamos un swtich para realizar la opción que sea haya introducido
		switch (opc) {
		case 1:
			System.out.println("El volumen del cilindro es de: " + cil.volumen());
			break;
		case 2:
			System.out.println("El área del cilindro es de: " + cil.area());
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
