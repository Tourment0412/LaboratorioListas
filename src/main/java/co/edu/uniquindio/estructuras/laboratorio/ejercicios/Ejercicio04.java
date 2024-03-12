package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleNode;

/**
 * Escribir un método que devuelva una lista enlazada con los valores impares de
 * una lista de números. <br>
 * <br>
 * La solución de este ejercicio se encuentra en
 * {@link #obtenerValoresImpares(SimpleList)}
 */
public class Ejercicio04 {

	/**
	 * Devuelve una lista enlazada con los valores impares de una lista de números.
	 * 
	 * @param lista la lista de numeros a buscar
	 * @return una nueva lista con los valores impares
	 */
	public static SimpleList<Integer> obtenerValoresImpares(SimpleList<Integer> lista) {
		SimpleNode<Integer> nodoAux = lista.head;
		SimpleList<Integer> listaResul = new SimpleList<Integer>();
		while (nodoAux != null) {
			if (nodoAux.getValue() % 2 != 0) {
				listaResul.addToTail(nodoAux.getValue());
			}
			nodoAux = nodoAux.getNext();
		}

		return listaResul;
	}

}
