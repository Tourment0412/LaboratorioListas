package co.edu.uniquindio.estructuras.laboratorio.tests;

import java.util.Iterator;

import org.junit.Test;

import co.edu.uniquindio.estructuras.laboratorio.listas.DoubleList;

public class Test07 {

	@Test
	public void test07() {
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
