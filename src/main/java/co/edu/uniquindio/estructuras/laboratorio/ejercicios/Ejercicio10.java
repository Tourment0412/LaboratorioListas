package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleNode;

public class Ejercicio10 {
	/**
	 * Escribir un método que permita “concatenar” dos listas enlazadas simples, el
	 * método debe recibir como parámetro dos objetos de tipo Lista, unirlas y
	 * retornar una lista que contenga a ambas.
	 * 
	 * El metodo se realizara en esta clase para poder pasar los dos objetos de tipo lista por parametro
	 * (Si fuera en la clase SimpleList, podriamos pasar solo la que se desea concatenar y usar el this
	 * 
	 * Se desea enviar una lista inicial y la que se va a concatenar luego de esta
	 */
	
	public static void main(String [] args) {
		
		SimpleList<Integer> listaInicial= new SimpleList<Integer>();
		listaInicial.addToTail(1);
		listaInicial.addToTail(2);
		listaInicial.addToTail(3);
		listaInicial.printListForwards();
		SimpleList<Integer> listaFinal= new SimpleList<Integer>();
		listaFinal.addToTail(4);
		listaFinal.addToTail(5);
		listaFinal.addToTail(6);
		listaFinal.printListForwards();
		
		SimpleList<Integer> listaResult = new SimpleList<Integer>();
		listaResult= concatenarLista(listaInicial, listaFinal);
		listaResult.printListForwards();
	}
	
	
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
