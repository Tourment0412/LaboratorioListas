package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;
import co.edu.uniquindio.estructuras.laboratorio.model.Persona;

public class Ejercicio02 {
	/**
	 * Obtener la lista de personas tengan cédula con cantidad de números par de una
	 * lista enlazada simple de personas.
	 * 
	 * @param listaPersonas
	 */
	public static SimpleList<Persona> obtenerPersonasNumerosImpares(SimpleList<Persona> lista) {
		SimpleList<Persona> listaNueva = new SimpleList<>();
		for (Persona eachPersona : lista) {
			if (eachPersona.getNumsCedula().length() % 2 == 0)
				listaNueva.addToTail(eachPersona);
		}
		return listaNueva;
	}
}
