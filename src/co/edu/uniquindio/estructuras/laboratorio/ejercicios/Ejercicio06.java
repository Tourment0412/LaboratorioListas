package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.DoubleList;

public class Ejercicio06 {

	public static void main(String[] args) {
		DoubleList<Integer> listaDoble= new DoubleList<Integer>();
		listaDoble.addToTail(3);
		listaDoble.addToTail(2);
		listaDoble.addToTail(1);
		listaDoble.printListForwards();
		System.out.println("Hacia Atras");
		listaDoble.imprimirHaciaAtras();

	}

}
