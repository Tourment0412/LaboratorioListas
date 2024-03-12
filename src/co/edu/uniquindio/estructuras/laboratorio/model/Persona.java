package co.edu.uniquindio.estructuras.laboratorio.model;

public class Persona {
	private String cedula;

	public Persona(String cedula) {
		this.cedula = cedula;

	}

	public String getCedula() {
		return cedula;
	}

	public String getNumsCedula() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cedula.length(); i++) {
			char ch = cedula.charAt(i);
			if (ch >= '0' && ch <= '9')
				sb.append(ch);
		}
		return sb.toString();
	}
}
