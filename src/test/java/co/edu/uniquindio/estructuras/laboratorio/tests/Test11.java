package co.edu.uniquindio.estructuras.laboratorio.tests;

import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import co.edu.uniquindio.estructuras.laboratorio.ejercicios.Ejercicio11;
import co.edu.uniquindio.estructuras.laboratorio.listas.Polinomio;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;
import co.edu.uniquindio.estructuras.laboratorio.listas.TerminoPolinomio;

public class Test11 {

	@Test
	public void test11() {
		Polinomio polinomio = new Polinomio();
		polinomio.addTerm(new TerminoPolinomio(5, 2));
		polinomio.addTerm(new TerminoPolinomio(3, 1));
		polinomio.addTerm(new TerminoPolinomio(10, 0));
		// 5x^2+3x+10
		Set<Entry<Double, Double>> tablaValores = polinomio.obtenerTablaValores(0d, 11, 0.5).entrySet();
		for (Entry<Double, Double> entry : tablaValores) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
