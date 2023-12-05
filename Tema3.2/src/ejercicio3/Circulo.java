package ejercicio3;

public class Circulo {

	double radio;

	public Circulo() {
	}

	public Circulo(double radio) {
		this.radio = radio;
	}

	double Circunferencia() {
		double res;

		res = (2 * Math.PI) * radio;

		return res;
	}

	double Area() {
		double res;

		res = Math.PI * (Math.pow(radio, 2));

		return res;
	}

}
