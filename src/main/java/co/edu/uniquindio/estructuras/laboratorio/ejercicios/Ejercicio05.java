package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import java.util.Iterator;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;

/**
 * Escribir un método que retorne la cantidad de veces que se repite un valor en
 * una lista enlazada. <br>
 * <br>
 * La solución de este ejercicio se encuentra en
 * {@link #obtenerCantRepetidasValor(SimpleList, Object)}
 */
public class Ejercicio05 {

	/**
	 * Obtiene la cantidad de veces que se repite un valor en una lista enlazada,
	 * usando cualquier tipo de dato
	 * 
	 * @param <T>   es el tipo de la lista y del valor
	 * @param lista es la Lista enlazada simple donde buscar
	 * @param valor es el valor a buscar
	 * @return la frecuencia del valor
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
	 * Obtiene la cantidad de veces que se repite un valor en una lista enlazada,
	 * usando enteros
	 * 
	 * @param lista es la Lista enlazada simple donde buscar
	 * @param valor es el valor a buscar
	 * @return la frecuencia del valor
	 */
	public static int obtenerCantRepetidadValorInt(SimpleList<Integer> lista, int valor) {
		return obtenerCantRepetidasValor(lista, valor);
	}
}
