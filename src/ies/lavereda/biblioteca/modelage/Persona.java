package ies.lavereda.biblioteca.modelage;

import javax.swing.JTextField;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String DNI;
	public boolean alta;
	
	
//	public Persona(String nombre, String apellido, String dNI, boolean alta) {
//		super();
//		this.nombre = nombre;
//		this.apellido = apellido;
//		DNI = dNI;
//		this.alta = alta;
//	}


	public Persona(JTextField textField_nombre, JTextField textField_Apellidos, JTextField textField_Dni,
			boolean alta2) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = getDNI();
		this.alta = alta;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public String getDNI() {
		return DNI;
	}


	public boolean isAlta() {
		return alta;
	}

	public boolean dadoAlta() {
		alta = true;
		return alta;
	}
	
	public boolean dadoBaja() {
		alta = false;
		return alta;
	}
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", alta=" + alta + "]";
	}
}