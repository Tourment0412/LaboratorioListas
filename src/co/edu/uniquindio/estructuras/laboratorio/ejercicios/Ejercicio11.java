package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import co.edu.uniquindio.estructuras.laboratorio.listas.TerminoPolinomio;

public class Ejercicio11 {

	/**
	 * Escribir un programa que permita dar entrada a polinomios en x,
	 * representándolos con una lista enlazada simple. A continuación, obtener una
	 * tabla de valores del polinomio para valores de x = 0.0, 0.5, 1.0, 1.5, ...,
	 * 5.0.
	 * 
	 * @param lista
	 * @param inicial
	 * @param cantidad
	 * @param salto
	 * @return
	 */
	public static Map<Double, Double> obtenerTablaValores(LinkedList<TerminoPolinomio> lista, double inicial,
			int cantidad, int salto) {
		HashMap<Double, Double> mapa = new HashMap<Double, Double>();
		for (int i = 0; i < cantidad; i++, inicial += salto) {
			mapa.put(inicial, evaluarFuncion(lista, inicial));
		}
		return mapa;
	}

	private static double evaluarFuncion(LinkedList<TerminoPolinomio> lista, double valor) {
		double evaluacion = 0;
		for (TerminoPolinomio termino : lista)
			evaluacion += termino.evaluar(valor);
		return evaluacion;
	}
}
