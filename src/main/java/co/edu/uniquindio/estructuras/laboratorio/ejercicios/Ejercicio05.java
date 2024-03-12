package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import java.util.Iterator;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;

public class Ejercicio05 {

	/**
	 * método que retorne la cantidad de veces que se repite un valor en una lista
	 * enlazada. Usando cualquier tipo de dato
	 * 
	 * @param <T>   Dato generico para usar cualquier tipo
	 * @param lista Lista enlazada simple donde buscar
	 * @param valor valor a buscar
	 * @return
	 */
	public static <T> int obtenerCantRepetidasValor(SimpleList<T> lista, T valor) {
		int cant = 0;
		Iterator<T> iterator = lista.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().equals(valor)) {
				cant++;
			}

		}

		return cant;
	}

	/**
	 * método que retorne la cantidad de veces que se repite un valor en una lista
	 * enlazada. Usando enteros
	 * 
	 * @param lista Lista donde buscar
	 * @param valor valor a buscar
	 * @return
	 */
	public static int obtenerCantRepetidadValorInt(SimpleList<Integer> lista, int valor) {
		return obtenerCantRepetidasValor(lista, valor);
	}
}
