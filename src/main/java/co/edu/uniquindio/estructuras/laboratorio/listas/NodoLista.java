package co.edu.uniquindio.estructuras.laboratorio.listas;

import java.util.Objects;

public class NodoLista {
	private int dato;
	private NodoLista sig;

	public NodoLista(int dato, NodoLista nodoLista) {
		this.setDato(dato);
		this.setSig(nodoLista);
	}

	/**
	 * @return the dato
	 */
	public int getDato() {
		return dato;
	}

	/**
	 * @param dato the dato to set
	 */
	public void setDato(int dato) {
		this.dato = dato;
	}

	/**
	 * @return the sig
	 */
	public NodoLista getSig() {
		return sig;
	}

	/**
	 * @param sig the sig to set
	 */
	public void setSig(NodoLista sig) {
		this.sig = sig;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getDato());
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
		return getDato() == other.getDato();
	}

	@Override
	public String toString() {
		return sig != null ? String.format("%d, %s", dato, sig) : dato + "";
	}

}
