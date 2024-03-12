package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleNode;

public class Ejercicio04 {

	/**
	 * Método que devuelva una lista enlazada con los valores impares de una lista de
	 * números.
	 * @param lista
	 * @return
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
