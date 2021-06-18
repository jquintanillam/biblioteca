package ies.lavereda.biblioteca.modelage;

import java.util.ArrayList;

import javax.swing.JTextField;


public class Libro {

	private JTextField titulo;
	private JTextField autor;
	private JTextField ISBM;
	private boolean prestado;
	
	ArrayList<Libro> l =  new ArrayList<Libro>();
	
	public Libro(JTextField jTextField, JTextField jTextField2, JTextField jTextField3, boolean prestado) {
		super();
		this.titulo = jTextField;
		this.autor = jTextField2;
		ISBM = jTextField3;
		this.prestado = false;
	}


	public JTextField getTitulo() {
		return titulo;
	}


	public JTextField getAutor() {
		return autor;
	}


	public JTextField getISBM() {
		return ISBM;
	}


	public boolean isPrestado() {
		return prestado;
	}
	
	public boolean devueltoLibros() {
		prestado=false;
		return prestado;
	}
	
	public boolean prestadoLibros() {
		prestado=true;
		return prestado;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBM=" + ISBM + ", prestado=" + prestado + "]";
	}
	
	
}