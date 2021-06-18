package ies.lavereda.biblioteca;

import java.awt.EventQueue;

import ies.lavereda.Biblioteca.Vista.AadirUsuario;
import ies.lavereda.Biblioteca.Vista.Biblioteca;
import ies.lavereda.biblioteca.controlador.Controlador;

public class App {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AadirUsuario usuario = new AadirUsuario();
					Biblioteca frame = new Biblioteca();
					Controlador controlador = new Controlador(frame, usuario);
					controlador.go();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
