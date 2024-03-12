package co.edu.uniquindio.estructuras.laboratorio.tests;

import org.junit.Test;

import co.edu.uniquindio.estructuras.laboratorio.ejercicios.Ejercicio10;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;
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
public class Test10 {

	@Test
	public void test10() {
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
		listaResult= Ejercicio10.concatenarLista(listaInicial, listaFinal);
		listaResult.printListForwards();
	}

}
