package ejercicio3;

public class Circulo {

	// Atributo que usaremos en la clase
	double radio;

	// Constructor predeterminado
	public Circulo() {

	}

	// Constructor con parámetros
	public Circulo(double radio) {
		this.radio = radio;
	}

	// Método para calcular la circunferencia del círculo
	double Circunferencia() {
		double res;

		// Fórmula de la circunferencia
		res = (2 * Math.PI) * radio;

		return res;
	}

	// Método para calcular el área del círculo
	double Area() {
		double res;

		// Fórmula del area
		res = Math.PI * (Math.pow(radio, 2));

		return res;
	}

}
