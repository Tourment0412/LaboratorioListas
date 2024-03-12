package co.edu.uniquindio.estructuras.laboratorio.tests;

import org.junit.Test;

import co.edu.uniquindio.estructuras.laboratorio.ejercicios.Ejercicio05;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;

public class Test05 {

	@Test
	public void test05() {
		var lista = new SimpleList<Integer>();

		lista.addToTail(1);
		lista.addToTail(2);
		lista.addToTail(3);
		lista.addToTail(4);
		lista.addToTail(1);
		lista.addToTail(2);
		lista.addToTail(1);
		System.out.println(Ejercicio05.obtenerCantRepetidadValorInt(lista, 1));
	
	}

}
