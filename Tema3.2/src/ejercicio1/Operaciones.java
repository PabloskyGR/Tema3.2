package ejercicio1;

public class Operaciones {

	// Atributos para almacenar los dos números
	double num1, num2;

	// Constructor por defecto
	public Operaciones() {
	}

	// Constructor que recibe dos números cuando se crea el objeto
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// Método para realizar la suma de los dos números
	double suma() {
		return num1 + num2;
	}

	// Método para realizar la resta de los dos números
	double resta() {
		double res;

		// Usamos un if para ver cuál número es mayor y realiza la resta correspondiente
		if (num1 > num2) {
			res = num1 - num2;
		} else {
			res = num2 - num1;
		}

		return res;
	}

	// Método para realizar la multiplicación de los dos números
	double multiplicacion() {
		return num1 * num2;
	}

	// Método para realizar la división de los dos números
	double division() {
		double res;

		// Usamos un if para ver cuál número es mayor y realiza la división correspondiente
		if (num1 > num2) {
			res = num1 / num2;
		} else {
			res = num2 / num1;
		}

		return res;
	}

	// Método para obtener el máximo de los dos números
	double maximo() {
		// Devuelve el número mayor
		return (num1 > num2) ? num1 : num2;
	}

	// Método para obtener el mínimo de los dos números
	double minimo() {
		// Devuelve el número menor
		return (num1 < num2) ? num1 : num2;
	}
}
