package co.edu.uniquindio.estructuras.laboratorio.tests;

import org.junit.Test;

import co.edu.uniquindio.estructuras.laboratorio.ejercicios.Ejercicio03;
import co.edu.uniquindio.estructuras.laboratorio.listas.DoubleList;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;

public class Test06 {

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
