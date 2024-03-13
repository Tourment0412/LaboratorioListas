package co.edu.uniquindio.estructuras.laboratorio.tests;

import org.junit.Test;

import co.edu.uniquindio.estructuras.laboratorio.ejercicios.Ejercicio08;
import co.edu.uniquindio.estructuras.laboratorio.listas.DoubleList;
import co.edu.uniquindio.estructuras.laboratorio.model.Persona;

public class Test08 {

	@Test
	public void test08() {
		DoubleList<Persona> listPersonas = new DoubleList<Persona>();
		listPersonas.addToTail(new Persona("1234567890"));
		listPersonas.addToTail(new Persona("14567890"));
		listPersonas.addToTail(new Persona("123456890"));
		listPersonas.addToTail(new Persona("1256890"));
		listPersonas.addToTail(new Persona("12590"));
		listPersonas.addToTail(new Persona("1234567890"));
		System.out.println(listPersonas);
		System.out.println(Ejercicio08.obtenerPersonasNumerosPares(listPersonas));

	}

}
