package polynomial;

import math.Polynomial;

public class LinearPolynomial implements Polynomial {

	double a, b;
	
	public LinearPolynomial(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double calculate(double x) {
		return(a*x+b);
	}
	
	public int getDegree() {
		return 1;
	}

	@Override
	public String toString() {
		return "LinearPolynomial [a=" + a + ", b=" + b + "]";
	}
	
}
