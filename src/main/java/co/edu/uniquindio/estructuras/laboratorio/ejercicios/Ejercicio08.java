package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.DoubleList;
import co.edu.uniquindio.estructuras.laboratorio.model.Persona;

/**
 * Obtener la lista de personas tengan cédula con cantidad de elementos par de
 * una lista enlazada doble de personas. <br>
 * <br>
 * La solución de este ejercicio se encuentra en
 * {@link #obtenerPersonasNumerosPares(DoubleList)}
 */
public class Ejercicio08 {
	/**
	 * Obtiene la lista de personas tengan cédula con cantidad de elementos par de
	 * una lista enlazada doble de personas.
	 * 
	 * @param lista es la lista doblemente enlazada a usar
	 * @return una lista enlazada doble nueva con las personas con cedula con
	 *         cantidad par
	 */
	public static DoubleList<Persona> obtenerPersonasNumerosPares(DoubleList<Persona> lista) {
		DoubleList<Persona> listaNueva = new DoubleList<>();
		for (Persona eachPersona : lista) {
			if (eachPersona.getNumsCedula().length() % 2 == 0)
				listaNueva.addToTail(eachPersona);
		}
		return listaNueva;
	}
}
