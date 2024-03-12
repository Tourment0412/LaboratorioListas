package co.edu.uniquindio.estructuras.laboratorio.tests;

import org.junit.Test;

import co.edu.uniquindio.estructuras.laboratorio.ejercicios.Ejercicio03;
import co.edu.uniquindio.estructuras.laboratorio.ejercicios.Ejercicio04;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;

public class Test04 {

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
		SimpleList<Integer> lista = new SimpleList<Integer>();
		lista.addToTail(1);
		lista.addToTail(2);
		lista.addToTail(3);
		lista.addToTail(4);
		SimpleList<Integer> listaResult= Ejercicio04.obtenerValoresImpares(lista);
		listaResult.printListForwards();
	
	}

}
