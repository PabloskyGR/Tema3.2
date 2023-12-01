package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int menu() {
		
		int opc;
		
		System.out.println("  - - - - - Menú - - - - - ");
		System.out.println(" | 1. Perímetro           |");
		System.out.println(" | 2. Área                |");
		System.out.println(" | 0. Salir               |");
		System.out.println("  - - - - - Menú - - - - -  ");		
		System.out.println();
		System.out.println("Dime que quieras hacer:");
		opc = sc.nextInt();
		
		return opc;
	}
	
	public static double pideAncho() {
		double res = -1;
		
		try {
			System.out.println("Dime el ancho del rectángulo:");
			res = sc.nextDouble();
		} catch(InputMismatchException e) {
			System.out.println("Error, el valor introducido no es de un tipo válido");
		} finally {
			sc.nextLine();
		}
		
		return res;
	}
	
	public static double pideAlto() {
		double res = -1;
		
		try {
			System.out.println("Dime el alto del rectángulo:");
			res = sc.nextDouble();
		} catch(InputMismatchException e) {
			System.out.println("Error, el valor introducido no es de un tipo válido");
		} finally {
			sc.nextLine();
		}
		
		return res;
	}
	

	public static void main(String[] args) {
		
		Rectangulo rect = new Rectangulo();
		double ancho;
		double alto;
		int opc;
		
		ancho = pideAncho();
		alto = pideAlto();
		opc = menu();
		
		rect = new Rectangulo(ancho, alto);
		
		switch(opc) {
		case 1: 
			System.out.println("Resultado del perímetro: "  );
		}

	}

}
