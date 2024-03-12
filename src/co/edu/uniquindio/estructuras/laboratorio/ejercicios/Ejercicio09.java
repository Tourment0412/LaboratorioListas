package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import co.edu.uniquindio.estructuras.laboratorio.listas.CircularLinkedList;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Ya esta implementados en la lista falta hacer el ejemplo aca
		
		CircularLinkedList<Integer> lista= new CircularLinkedList<Integer>();
		lista.addNode(1);
		lista.addNode(2);
		lista.addNode(3);
		lista.printCircularList();
		
		//Se hace que el buscar retorne un -1 o un 1 ya que si retorna el mismo valor seria con un nullo, y este arroja
		//Una excepcion en Java
		
		int valor= lista.searchValue(2);
		System.out.println("El valor se ha encontrado por eso se retorna: "+valor);
		int valor2= lista.searchValue(5);
		System.out.println("El valor no se ha encontrado por eso se retorna: "+valor2);
	}
	
	
	
	

}
