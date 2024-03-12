package co.edu.uniquindio.estructuras.laboratorio.listas;

import java.util.Random;

public class CircularLinkedList <E>{
	
	private SimpleNode<E> head;

	public CircularLinkedList() {
		this.head = null;
	}
	
	
	public void addNode (E valor) {
		SimpleNode<E> newNode= new SimpleNode<E>(valor);
		if(head==null) {
			//El nodo se apunta asi mismo en casi de que la lista este vacia
			//Se usa este orden para mantener que el nodo insertado debe de apuntar a la cabeza
			head= newNode;
			newNode.setNext(head);
		}else {
			SimpleNode<E> current=head;
			while(current.getNext()!=head) { //Se recorre mientras que el siguiente sea distinto al la cabeza de la lista
				current= current.getNext();
			}
			current.setNext(newNode);
			newNode.setNext(head);
		}
	}
	
	/**
	 * This method is usend to search a {@value} inside the {@link CircularLinkedList}
	 * if the value exists in the {@link CircularLinkedList} it returns 1, if value doesn't exists return -1
	 * @param value
	 * @return
	 */
	
	public int searchValue(E value) {
		Random random = new Random();
		if (head==null) {
			return -1;
		}else {
			SimpleNode<E> current= head;
			do {
				if(current.getValue().equals(value)) {
					return 1;
				}
				current= current.getNext();
			}while(current!=head);
			return -1;
		}
	}
	
	public void printCircularList() {
		if(head==null) {
			System.out.println("Lista vacia");
			return;
		}
		SimpleNode<E> current=head;
		do {
			System.out.println(current.getValue());
			current=current.getNext();
		}while(current!=head);
	}
	
	
	

}
