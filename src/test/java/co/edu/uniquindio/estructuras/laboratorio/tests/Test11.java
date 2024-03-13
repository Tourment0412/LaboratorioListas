package co.edu.uniquindio.estructuras.laboratorio.tests;

import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import co.edu.uniquindio.estructuras.laboratorio.ejercicios.Ejercicio11;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;
import co.edu.uniquindio.estructuras.laboratorio.listas.TerminoPolinomio;

public class Test11 {

	@Test
	public void test11() {
		SimpleList<TerminoPolinomio> polinomio = new SimpleList<TerminoPolinomio>();
		polinomio.addToTail(new TerminoPolinomio(5, 2));
		polinomio.addToTail(new TerminoPolinomio(3, 1));
		polinomio.addToTail(new TerminoPolinomio(10, 0));
		// 5x^2+3x+10
		Set<Entry<Double, Double>> tablaValores = Ejercicio11.obtenerTablaValores(polinomio, 0d, 11, 0.5).entrySet();
		for (Entry<Double, Double> entry : tablaValores) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
