package co.edu.uniquindio.estructuras.laboratorio.tests;

import org.junit.Test;

import co.edu.uniquindio.estructuras.laboratorio.ejercicios.Ejercicio13;
import co.edu.uniquindio.estructuras.laboratorio.listas.Lista;

public class Test13 {

	@Test
	public void test13() {
		Lista listaNumeros = new Lista();
		listaNumeros.agregar(9);
		listaNumeros.agregar(4);
		listaNumeros.agregar(6);
		listaNumeros.agregar(8);
		listaNumeros.agregar(4);
		listaNumeros.agregar(5);
		listaNumeros.agregar(4);
		listaNumeros.agregar(4);
		System.out.println(listaNumeros);
		System.out.println(Ejercicio13.obtenerMaxDistancia(listaNumeros, 4));
	}

}
