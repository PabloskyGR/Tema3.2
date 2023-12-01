package ejercicio2;

public class Rectangulo {
	
	double ancho, alto;

	public Rectangulo() {
	}

	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	double perimetro() {
		double res;
		
		res = (2 * ancho) + (2 * alto);
		
		return res;
	}
	
	double area() {
		double res;
		
		res = ancho * alto;
		
		return res;
	}
	
	

}
