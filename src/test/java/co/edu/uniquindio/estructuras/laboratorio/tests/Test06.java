package co.edu.uniquindio.estructuras.laboratorio.tests;

import java.util.ArrayList;

import org.junit.Test;

import co.edu.uniquindio.estructuras.laboratorio.listas.DoubleList;

public class Test06 {

	@Test
	public void test06() {
		DoubleList<Integer> listaDoble= new DoubleList<Integer>();
		listaDoble.addToTail(3);
		listaDoble.addToTail(2);
		listaDoble.addToTail(1);
		System.out.println("Hacia Adelante (Primero al ultimo");
		listaDoble.printListForwards();
		System.out.println("Hacia Atras (Ultimo al primero)");
		listaDoble.imprimirHaciaAtras();
	
	}

}
