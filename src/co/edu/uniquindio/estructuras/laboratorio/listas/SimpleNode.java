package co.edu.uniquindio.estructuras.laboratorio.listas;

public class SimpleNode <E> {
	
	private E value;
	private SimpleNode <E> next;
	
	public SimpleNode(E valor) {
		this.value = valor;
		this.next=null;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public SimpleNode<E> getNext() {
		return next;
	}

	public void setNext(SimpleNode<E> next) {
		this.next = next;
	}
	

}
