package co.edu.uniquindio.estructuras.laboratorio.listas;

public class SimpleList <E> {
	public SimpleNode <E> head;
	public int size;
	
	
	
	
	public SimpleList() {
		this.head = null;
		this.size=0;
	}



	/**
	 *  This method is used for adding a new {@link SimpleNode} to the list
	 * @param node
	 */
	public void addToHead(SimpleNode <E> node) {
		if(head==null) {
			head=node;
			size++;
			return;
		}
		SimpleNode <E> auxiliar= head;
		head=node;
		head.setNext(auxiliar);
		size++;
	}
	/**
	 * This method is used for adding a new {@link SimpleNode} using its data (the correct way to be implemented)
	 * We should not use {@link SimpleNode} as parameter.
	 * @param value
	 */
	public void addToHeadByValue(E value) {
		SimpleNode <E> nodoPara= new SimpleNode<E>(value);
		if(head==null) {
			head= nodoPara;
			return;
		}
		SimpleNode<E> aux= head;
		head=nodoPara;
		head.setNext(aux);;
		
	}
	
	
	/**
	 * This method is used for adding a new {@link SimpleNode} to as the last node of the {@link SimpleList}
	 * @param value
	 */
	public void addToTail(E value) {
		SimpleNode <E> node=new SimpleNode <E>(value);
		if(head==null) {
			head=node;
			return;
		}
		SimpleNode <E> nodeAux= head;
		while (nodeAux.getNext()!=null) {
			nodeAux= nodeAux.getNext();
		}
		nodeAux.setNext(node);
		
	} 
	 public void addByPosition(E value,int pos) {
		 SimpleNode <E> nodeParam= new SimpleNode<E>(value);
		 int cont =0;
		 SimpleNode <E> node= head;
		 if(head==null) {
			 head= nodeParam;
			 return;
		 }
		 if(pos==0) {
			 nodeParam.setNext(head);
			 head= nodeParam;
			 return;
		 }
		 
		 
		 
		 while(node.getNext()!=null && cont<pos-1) {
			node= node.getNext();
			cont++;
		 }
		 if(cont==pos-1);
		 nodeParam.setNext(node.getNext());
		 node.setNext(nodeParam);
		 
	 }
	 
	 public boolean isValidIndex(int index) {
		 if(head==null) {
			 return false;
		 }
		 SimpleNode <E> nodo= head;
		 int cont=0;
		 while(nodo.getNext()!=null) {
			 if(cont==index) {
				 return true;
			 }
			 nodo= nodo.getNext();
			 cont++; 
			 
			 
		 }
		 return false;
	 }
	// Método para revertir la lista enlazada utilizando recursividad
	    private SimpleNode <E>reverseRecursively(SimpleNode<E> current) {
	        if (current == null || current.getNext() == null) {
	            return current;
	        }
	        
	        SimpleNode <E> newHead = reverseRecursively(current.getNext());
	        current.getNext().setNext(current);
	        current.setNext(null); // Corrección aquí
	        return newHead;
	    }

	    // Método público para invertir la lista llamando al método recursivo
	    public void reverse() {
	        head = reverseRecursively(head);
	    }

}
