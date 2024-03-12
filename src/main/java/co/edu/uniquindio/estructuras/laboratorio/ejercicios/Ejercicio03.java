package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import java.util.Iterator;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;

public class Ejercicio03 {

	/**
	 * 
	 * Eliminar los números pares de una lista enlazada simple
	 * 
	 * @param lista
	 */
	public static void eliminarNumerosPares(SimpleList<Integer> lista) {
		Iterator<Integer> iterador = lista.iterator();
		while (iterador.hasNext()) {
			Integer n = iterador.next();
			if (n % 2 == 0)
				lista.eliminarElemento(n);
		}
	}

}
