package co.edu.uniquindio.estructuras.laboratorio.listas;

public class CircularLinkedList <E>{
	
	private SimpleNode<E> head;

	public CircularLinkedList(SimpleNode<E> head) {
		this.head = head;
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
	
	public E searchValue(E value) {
		if (head==null) {
			return null;
		}else {
			SimpleNode<E> current= head;
			do {
				if(current.getValue().equals(value)) {
					return current.getValue();
				}
				current= current.getNext();
			}while(current.getNext()!=head);
			return null;
		}
	}
	
	
	

}
