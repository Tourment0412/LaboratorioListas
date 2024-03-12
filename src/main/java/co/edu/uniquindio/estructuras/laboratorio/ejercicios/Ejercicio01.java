package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleNode;

/**
 * Obtener los números de las posiciones impares de una lista enlazada simple de
 * números<br>
 * <br>
 * La solución de este ejercicio se encuentra en
 * {@link #obtenerNumerosPosImpares(SimpleList)}
 */
public class Ejercicio01 {

	/**
	 * Se busca retornar los numeros que esten en una posicion impar de la lista
	 * simple que se envia por parametro, se inicia el i
	 * 
	 * @param lista
	 * @return
	 */
	public static SimpleList<Integer> obtenerNumerosPosImpares(SimpleList<Integer> lista) {
		SimpleList<Integer> listaRetorno = new SimpleList<Integer>();
		SimpleNode<Integer> referencia = lista.head;
		int cont = 0;
		while (referencia != null) {
			if (cont % 2 != 0) {
				listaRetorno.addToTail(referencia.getValue());

			}
			referencia = referencia.getNext();
			cont++;
		}
		return listaRetorno;
	}

}
