package co.edu.uniquindio.estructuras.laboratorio.listas;

public class TerminoPolinomio {

	private double value;
	private double exponent;

	public TerminoPolinomio(double value, double exp) {
		this.value = value;
		this.exponent = exp;

	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}

	/**
	 * @return the exponent
	 */
	public double getExp() {
		return exponent;
	}

	/**
	 * @param exponent the exponent to set
	 */
	public void setExponent(double exponent) {
		this.exponent = exponent;
	}

	public double evaluar(double x) {
		return value * Math.pow(x, exponent);
	}
}
