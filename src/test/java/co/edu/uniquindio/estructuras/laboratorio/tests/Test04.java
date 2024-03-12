package co.edu.uniquindio.estructuras.laboratorio.tests;

import org.junit.Test;

import co.edu.uniquindio.estructuras.laboratorio.ejercicios.Ejercicio04;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;

public class Test04 {

	@Test
	public void test04() {
		SimpleList<Integer> lista = new SimpleList<Integer>();
		lista.addToTail(1);
		lista.addToTail(2);
		lista.addToTail(3);
		lista.addToTail(4);
		SimpleList<Integer> listaResult= Ejercicio04.obtenerValoresImpares(lista);
		listaResult.printListForwards();
	
	}

}
