package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import java.util.Iterator;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;

public class Ejercicio03 {

	public static void main(String[] args) {
		var lista = new SimpleList<Integer>();
		lista.addToTail(1);
		lista.addToTail(2);
		lista.addToTail(3);
		lista.addToTail(4);
		lista.addToTail(5);

		System.out.println(lista.toString());
		eliminarNumerosPares(lista);
		System.out.println(lista.toString());
	}

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
