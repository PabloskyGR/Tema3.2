package ejercicio4;

public class Cilindro {

	double radioBase, altura;

	public Cilindro() {
	}

	public Cilindro(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
	}

	double volumen() {
		double res;

		res = Math.PI * (Math.pow(radioBase, 2) * altura);

		return res;
	}

	double area() {
		double res;

		res = (2 * Math.PI * (radioBase * altura)) + (2 * Math.PI + (Math.pow(radioBase, 2)));

		return res;
	}
}
