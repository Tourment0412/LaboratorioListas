package co.edu.uniquindio.estructuras.laboratorio.listas;

import java.util.Objects;

public class NodoLista {
	int dato;
	NodoLista sig;

	public NodoLista(int dato, NodoLista nodoLista) {
		this.dato = dato;
		this.sig = nodoLista;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dato);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NodoLista other = (NodoLista) obj;
		return dato == other.dato;
	}

	
}
