package co.edu.uniquindio.estructuras.laboratorio.tests;

import org.junit.Test;

import co.edu.uniquindio.estructuras.laboratorio.ejercicios.Ejercicio03;
import co.edu.uniquindio.estructuras.laboratorio.ejercicios.Ejercicio12;
import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;

public class Test12 {

	@Test
	public void test() {
		SimpleList<Double> listaDobles = Ejercicio12.leerRealesArchivo("src/main/resources/reales.txt");
		listaDobles.printListForwards();
		System.out.println("La media arirmetica es: " + Ejercicio12.calcularMedia(listaDobles));
		System.out.println("La desviacion estandar es: " + Ejercicio12.calcularDesviacionEstandas(listaDobles));
	}


}
