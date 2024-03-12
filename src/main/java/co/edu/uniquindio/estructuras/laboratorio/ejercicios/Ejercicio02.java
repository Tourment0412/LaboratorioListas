package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;
import co.edu.uniquindio.estructuras.laboratorio.model.Persona;

/**
 * Obtener la lista de personas tengan cédula con cantidad de números par de una
 * lista enlazada simple de personas.<br>
 * <br>
 * La solución de este ejercicio se encuentra en
 * {@link #obtenerPersonasNumerosPares(SimpleList)}
 * 
 */
public class Ejercicio02 {

	/**
	 * Obtiene las personas que tienen su cedula con una cantidad de números par
	 * 
	 * @param lista es la lista a buscar
	 * @return una lista de personas con su cedula con cantidad de números par
	 */
	public static SimpleList<Persona> obtenerPersonasNumerosPares(SimpleList<Persona> lista) {
		SimpleList<Persona> listaNueva = new SimpleList<>();
		for (Persona eachPersona : lista) {
			if (eachPersona.getNumsCedula().length() % 2 == 0)
				listaNueva.addToTail(eachPersona);
		}
		return listaNueva;
	}
}
