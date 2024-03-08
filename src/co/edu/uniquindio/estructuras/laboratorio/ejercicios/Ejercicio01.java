package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleNode;

public class Ejercicio01 {
	
	public static void main(String []args ) {
		SimpleList<Integer> lista= new SimpleList<Integer>();
		lista.addToTail(1);
		lista.addToTail(2);
		lista.addToTail(3);
		SimpleList <Integer> listaResult= obtenerNumerosPosImpares(lista);
		imprimirLista(listaResult);
	}
	/**
	 * Se busca retornar los numeros que esten en una posicion impar de la lista simple
	 * @param lista
	 * @return
	 */
	public static SimpleList<Integer> obtenerNumerosPosImpares(SimpleList<Integer> lista) {
		SimpleList<Integer> listaRetorno = new SimpleList<Integer>();
		SimpleNode<Integer> referencia = lista.head;
		int cont = 0;
		while (referencia!= null) {
			if (cont % 2 != 0) {
				listaRetorno.addToTail(referencia.getValue());

			}
			referencia = referencia.getNext();
			cont++;
		}
		return listaRetorno;
	}
	
	public static void imprimirLista(SimpleList<Integer>lista) {
		SimpleNode<Integer> nodoRef= lista.head;
		while(nodoRef!=null) {
			System.out.println(nodoRef.getValue());
			nodoRef= nodoRef.getNext();
		}
	}

}
