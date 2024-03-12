package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleNode;

/**
 * Escribir un método que permita “concatenar” dos listas enlazadas simples, el
 * método debe recibir como parámetro dos objetos de tipo Lista, unirlas y
 * retornar una lista que contenga a ambas. <br>
 * <br>
 * La solución de este ejercicio se encuentra en
 * {@link #concatenarLista(SimpleList, SimpleList)}
 */
public class Ejercicio10 {
	/**
	 * Concatena dos listas enlazadas simples, se retorna la lista inicial
	 * agregandole la final. Si la inicial está vacía, se retorna la final; y si la
	 * final está vacía se retorna la inicial
	 * 
	 * @param <E>          es el tipo del elemento de la lista
	 * @param listaInicial es la lista inicial
	 * @param listaFinal   es la lista final
	 * @return es la lista que queda al juntar la inicial con la final
	 */
	public static <E> SimpleList<E> concatenarLista(SimpleList<E>listaInicial, SimpleList<E>listaFinal){
		if(listaInicial.head==null) {
			return listaFinal;
		}
		if(listaFinal.head==null) {
			return listaInicial;
		}
		SimpleNode<E> currentIni= listaInicial.head;
		while(currentIni.getNext()!=null) {
			currentIni=currentIni.getNext();
		}
		currentIni.setNext(listaFinal.head);
		return listaInicial;
	}

}
