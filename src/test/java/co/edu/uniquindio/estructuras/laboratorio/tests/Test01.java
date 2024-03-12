package co.edu.uniquindio.estructuras.laboratorio.tests;

import org.junit.Test;

import co.edu.uniquindio.estructuras.laboratorio.ejercicios.Ejercicio01;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;

public class Test01 {

	@Test
	public void prueba01() {
		SimpleList<Integer> lista = new SimpleList<Integer>();
		lista.addToTail(1);
		lista.addToTail(2);
		lista.addToTail(3);
		lista.addToTail(4);
		SimpleList<Integer> listaResult = Ejercicio01.obtenerNumerosPosImpares(lista);
		listaResult.printListForwards();
	}
}
