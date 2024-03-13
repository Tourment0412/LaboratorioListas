package co.edu.uniquindio.estructuras.laboratorio.listas;

/**
 * 
 */
public class Lista {

	private NodoLista inicio;

	public Lista() {
		inicio = null;
	}

	public NodoLista getInicio() {
		return inicio;
	}

	public void agregar(int valor) {
		if (inicio == null) {
			inicio = new NodoLista(valor, null);
			return;
		}
		NodoLista nodo = inicio;
		while (nodo.getSig() != null)
			nodo = nodo.getSig();

		nodo.setSig(new NodoLista(valor, null));
	}

	@Override
	public String toString() {
		return inicio == null ? "[]" : "[" + inicio + "]";
	}
}
