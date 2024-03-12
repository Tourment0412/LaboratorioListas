package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.DoubleList;
import co.edu.uniquindio.estructuras.laboratorio.model.Persona;

public class Ejercicio08 {
	/**
	 * Obtener la lista de personas tengan cédula con cantidad de elementos par de
	 * una listaenlazada doble de personas.
	 * 
	 * @param lista
	 * @return
	 */
	public static DoubleList<Persona> obtenerPersonasNumerosImpares(DoubleList<Persona> lista) {
		DoubleList<Persona> listaNueva = new DoubleList<>();
		for (Persona eachPersona : lista) {
			if (eachPersona.getNumsCedula().length() % 2 == 0)
				listaNueva.addToTail(eachPersona);
		}
		return listaNueva;
	}
}
