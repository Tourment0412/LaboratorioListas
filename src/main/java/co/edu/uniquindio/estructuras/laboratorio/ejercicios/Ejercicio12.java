package co.edu.uniquindio.estructuras.laboratorio.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

import co.edu.uniquindio.estructuras.laboratorio.listas.SimpleList;

/**
 * Escriba un programa que calcule la media y la desviación estándar (Opcion de muestra) de un
 * conjunto de N números reales. Tenga en cuenta que:<br>
 * <li>Implementar una lista enlazada propia <li>Debe leer los n números reales de
 * un archivo <li>Debe almacenar los N números reales en una lista enlazada para
 * realizar los cálculos.
 */
public class Ejercicio12 {

	public static SimpleList<Double> leerRealesArchivo(String ruta) {
		SimpleList<Double> lista = new SimpleList<Double>();

		try {
			File file = new File(ruta);
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				double numero = Double.parseDouble(sc.nextLine());
				lista.addToTail(numero);
			}
			return lista;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			SimpleList<Double> listaCatch = new SimpleList<Double>();
			return listaCatch;
		}
	}

	public static Double calcularMedia(SimpleList<Double> listaReales) {
		double suma = 0.0;
		int cant = 0;
		Iterator<Double> iterator = listaReales.iterator();
		while (iterator.hasNext()) {
			suma += iterator.next();
			cant++;
		}
		return (suma) / cant;
	}

	public static double calcularVarianza(SimpleList<Double> listaReales) {
		double sumaDesviacion = 0.0;
		int cant = 0;
		double media = calcularMedia(listaReales);
		Iterator<Double> iterator = listaReales.iterator();
		while (iterator.hasNext()) {
			sumaDesviacion += Math.pow((iterator.next() - media), 2);
			cant++;
		}
		sumaDesviacion = sumaDesviacion / (cant - 1);
		sumaDesviacion = Math.sqrt(sumaDesviacion);
		return sumaDesviacion;
	}

	

}
