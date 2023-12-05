package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static int menu() {

		int opc;

		System.out.println("  - - - - - Menú - - - - - ");
		System.out.println(" | 1. Circunferencia      |");
		System.out.println(" | 2. Área                |");
		System.out.println(" | 0. Salir               |");
		System.out.println("  - - - - - Menú - - - - -  ");
		System.out.println();
		System.out.println("Dime que quieras hacer:");
		opc = sc.nextInt();

		return opc;
	}

	public static double pideRadio() {
		double res = 0;

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

		Circulo circ = new Circulo();

		int opc = menu();
		double radio = pideRadio();

		circ = new Circulo(radio);

		switch (opc) {
		case 1:
			System.out.println("La circunferencia del circulo es de:" + circ.Circunferencia());
			break;
		case 2:
			System.out.println("El área del círculo es de: " + circ.Area());
			break;
		}

		sc.close();

	}

}
