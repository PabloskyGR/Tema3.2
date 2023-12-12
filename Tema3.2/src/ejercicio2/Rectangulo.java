package ejercicio2;

public class Rectangulo {
	
	// Atributos que usaremos en la clase
	double ancho, alto;

	// Constructor por defecto
	public Rectangulo() {
	}

	// Constructor con parámetros 
	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	// Método para calcular el perímetro del rectángulo
	double perimetro() {
		double res;
		
		// Fórmula del perímetro
		res = (2 * ancho) + (2 * alto);
		
		return res;
	}
	
	// Método para calcular el área del rectángulo
	double area() {
		double res;
		
		// Fórmula del área
		res = ancho * alto;
		
		return res;
	}
	
	

}
