package co.edu.uniquindio.estructuras.laboratorio.listas;

public class DoubleNode<E> {

	private E value;
	private DoubleNode<E> next;
	private DoubleNode<E> previous;

	public DoubleNode(E value) {
		super();
		this.value = value;
		this.next = null;
		this.previous = null;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public DoubleNode<E> getNext() {
		return next;
	}

	public void setNext(DoubleNode<E> next) {
		this.next = next;
	}

	public DoubleNode<E> getPrevious() {
		return previous;
	}

	public void setPrevious(DoubleNode<E> previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("[").append(value).append("]");
		if(previous!=null) {
			sb.append("<-").append(previous.getValue());
		}
		if(next!=null) {
			sb.append("->").append(next.getValue());
		}
		return sb.toString();
	}
	
	

}
