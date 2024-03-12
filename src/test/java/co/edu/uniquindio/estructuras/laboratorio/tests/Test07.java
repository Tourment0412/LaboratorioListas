package co.edu.uniquindio.estructuras.laboratorio.tests;

import java.util.Iterator;

import org.junit.Test;

import co.edu.uniquindio.estructuras.laboratorio.ejercicios.Ejercicio03;
import co.edu.uniquindio.estructuras.laboratorio.listas.DoubleList;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;

public class Test07 {

	@Test
	public void test() {
		var lista = new SimpleList<Integer>();
		lista.addToTail(1);
		lista.addToTail(2);
		lista.addToTail(3);
		lista.addToTail(4);
		lista.addToTail(5);

		System.out.println(lista.toString());
		Ejercicio03.eliminarNumerosPares(lista);
		System.out.println(lista.toString());
	}

	public static void main(String[] args) {
		DoubleList<Integer> lista= new DoubleList<Integer>();
		lista.addToTail(1);
		lista.addToTail(2);
		lista.addToHead(89);
		lista.addToHead(76);
		lista.addToTail(9);
		 /**
		  * El problema de este iterator es que los metodos realizados relacionados con el previous, no se podran usar
		  * al hacer el lista.iterator solo serán los marcados como @override
		  */
		
		for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		
	
	}

}
