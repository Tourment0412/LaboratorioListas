package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleNode;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public SimpleList<Integer> obtenerValoresImpares(SimpleList<Integer> lista) {
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
