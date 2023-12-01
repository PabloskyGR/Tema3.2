package ejercicio1;

public class Operaciones {
	
	double num1, num2;

	public Operaciones() {
	}

	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	double suma() {
		return num1 + num2;
	}
	
	double resta() {
		double res;
		
		if (num1 > num2) {
			res = num1 - num2;
		} else {
			res = num2 - num1;
		}
		
		return res;
	}
	
	double multiplicacion() {
		return num1 * num2;
	}
	
	double division() {
		double res;
		
		if (num1 > num2) {
			res = num1 / num2;
		} else {
			res = num2 / num1;
		}
		
		return res;
	}
	
	double maximo() {
		double res;
		
		if (num1 > num2) {
			res = num1;
		} else {
			res = num2;
		}
		
		return res;
	}
	
	double minimo() {
		double res;
		
		if (num1 < num2) {
			res = num1;
		} else {
			res = num2;
		}
		
		return res;
	}
	
	

}
