package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

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

	public static double pideRadioBase() {
		double res = -1;

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

	public static double altura() {
		double res = -1;

		do {
			try {
				System.out.println("Dime la altura del cilinro");
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

		Cilindro cil = new Cilindro();

		int opc = menu();
		double radioBase = pideRadioBase();
		double altura = altura();

		cil = new Cilindro(radioBase, altura);

		switch (opc) {
		case 1:
			System.out.println("El volumen del cilindro es de: " + cil.volumen());
		case 2:
			System.out.println("El área del cilindro es de: " + cil.area());
		}

		sc.close();

	}

}
