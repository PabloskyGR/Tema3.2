package ejercicio4;

public class Cilindro {

	// Atributo que usaremos en la clase
	double radioBase, altura;

	// Contructor por defecto
	public Cilindro() {
	}

	// Constructor con parámetros
	public Cilindro(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
	}

	// Método para calcular el volumen del cilindro
	double volumen() {
		double res;

		// Fórmula del volumen de la circunferencia
		res = Math.PI * (Math.pow(radioBase, 2) * altura);

		return res;
	}

	// Método para calcular el área del cilindro
	double area() {
		double res;

		// Fórmula del área del cilindro
		res = (2 * Math.PI * radioBase * altura) + (2 * Math.PI + (Math.pow(radioBase, 2)));

		return res;
	}
}
