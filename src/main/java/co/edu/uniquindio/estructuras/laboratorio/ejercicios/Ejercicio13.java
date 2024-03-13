package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.Lista;
import co.edu.uniquindio.estructuras.laboratorio.listas.NodoLista;

/**
 * Desarrollar un algoritmo recursivo en Java tal que dada una lista
 * perteneciente al tipo anterior (lista enlazada simple) y una clave entera,
 * <i>x</i>, determine la distancia existente entre dos elementos de la lista
 * que contengan la clave <i>x</i>.<br>
 * <br>
 * La solución de este ejercicio se encuentra en
 * {@link #obtenerMaxDistancia(Lista, int)}
 */
public class Ejercicio13 {

	/**
	 * Obtiene la maxima distancia entre 2 elementos que se encuentren en la lista
	 * 
	 * @param lista es la lista enlazada simple de enteros
	 * @param valor es el valor a buscarle la distancia
	 * @return la maxima distancia entre dos elementos del mismo valor
	 */
	public static int obtenerMaxDistancia(Lista lista, int valor) {
		return obtenerMaxDistancia(valor, obtenerCoincidencia(valor, lista.getInicio()), 0, 0);
	}

	/**
	 * Obtiene una coincidencia en la secuencia de nodos, se sabe que en la lista si
	 * o si se encuentraa el valor, entonces no es necesario enviar una excepcion en
	 * caso de que no se encuentre
	 * 
	 * @param valor es el valor
	 * @param nodo  es el nodo inicial en donde se busca la coincidencia
	 * @return
	 */
	private static NodoLista obtenerCoincidencia(int valor, NodoLista nodo) {
		if (nodo.getDato() == valor)
			return nodo;
		return obtenerCoincidencia(valor, nodo.getSig());
	}

	/**
	 * Es el metodo recursivo que obtiene la maxima distancia entre dos nodos con el
	 * mismo valor
	 * 
	 * @param valor         es el valor a buscar
	 * @param nodoRecorrido es el nodo en el que se empieza a buscar coincidencias
	 * @param contador      es un contador que se reinicia cada que se encuentra una
	 *                      coincidencia
	 * @param max           cambia cada que se encuentre una coincidencia, cuando se
	 *                      haga esto, se busca el mayor entre el contador y el
	 *                      valor maximo
	 * @return la distancia maxima entre dos nodos con el mismo valor
	 */
	private static int obtenerMaxDistancia(int valor, NodoLista nodoRecorrido, int contador, int max) {
		if (nodoRecorrido == null)
			return max;
		if (valor == nodoRecorrido.getDato())
			return obtenerMaxDistancia(valor, nodoRecorrido.getSig(), 1, Math.max(contador, max));
		return obtenerMaxDistancia(valor, nodoRecorrido.getSig(), contador + 1, max);
	}

}
