package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;

public class Ejercicio02 {
	/**
	 * Obtener la lista de personas tengan cédula con cantidad de números par de una
	 * lista enlazada simple de personas.
	 * 
	 * @param listaPersonas
	 */
	public static <T> void obtenerPersonasNumerosImpares(SimpleList<T> lista) {
		for (T eachPersona : lista) {
			System.out.println(eachPersona.toString());
		}
	}

	public static void main(String[] args) {
		SimpleList<Integer> listaPersonas = new SimpleList<>();
		for (int i = 0; i < 5; i++) {
			listaPersonas.addToTail(i);
		}
		obtenerPersonasNumerosImpares(listaPersonas);
	}
}
