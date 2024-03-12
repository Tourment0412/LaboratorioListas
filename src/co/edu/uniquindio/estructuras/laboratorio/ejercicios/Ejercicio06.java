package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.DoubleList;

public class Ejercicio06 {
	/**
	 * El metoodo de imprimirHaciaAtras se ha hecho en la clase de DoubleList con el nombre que se solicita
	 * No se ha puesto en ingles como el prinListForwards
	 * @param args
	 */
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
