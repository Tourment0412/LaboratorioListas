package co.edu.uniquindio.estructuras.laboratorio.listas;

import java.util.HashMap;
import java.util.Map;

public class Polinomio {

	public SimpleList<TerminoPolinomio> polinomioList = new SimpleList<TerminoPolinomio>();

	public Polinomio() {
		this.polinomioList = null;
	}

	/**
	 * Obtiene una tabla de valores a partir de un polinomio almacenado en una lista
	 * de {@link TerminoPolinomio}, los valores se obtienen a partir del valor
	 * inicial, la cantidad de numeros que se quiere obtener y el salto por cada
	 * dato
	 * 
	 * @param polinomio es el polinomio del que se obtiene la tabla
	 * @param inicial   es el valor inicial a evaluar
	 * @param cantidad  es la cantidad de veces que se quiere evaluar el polinomio
	 * @param salto     es el salto que se hace cada vez que se evalua la función
	 * @return un mapa de clave los numeros a evaluar y valor el resultado de la
	 *         evaluación de los numeros
	 */
	public Map<Double, Double> obtenerTablaValores(double inicial, int cantidad, double salto) {
		HashMap<Double, Double> mapa = new HashMap<Double, Double>();
		for (int i = 0; i < cantidad; i++, inicial += salto) {
			mapa.put(inicial, evaluarFuncion(inicial));
		}
		return mapa;
	}

	/**
	 * 
	 * Evalua un valor x en un polinomio almacenado en una lista de
	 * {@link TerminoPolinomio}
	 * 
	 * @param polinomio es el polinomio en el que se evalúa el valor
	 * @param x         es el número a evaluar
	 * @return la evaluación de x en el polinomio
	 */
	private double evaluarFuncion(double x) {
		double resultado = 0;
		for (TerminoPolinomio termino : polinomioList)
			resultado += termino.evaluar(x);
		return resultado;
	}

	public void addTerm(TerminoPolinomio terminoPolinomio) {
		polinomioList.addToTail(terminoPolinomio);
	}

}
