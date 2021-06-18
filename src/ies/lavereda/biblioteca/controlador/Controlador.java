package ies.lavereda.biblioteca.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import ies.lavereda.Biblioteca.Vista.AadirLibro;
import ies.lavereda.Biblioteca.Vista.AadirUsuario;
import ies.lavereda.Biblioteca.Vista.Biblioteca;
import ies.lavereda.Biblioteca.Vista.DevolverLibro;
import ies.lavereda.Biblioteca.Vista.GuiaAplicacion;
import ies.lavereda.Biblioteca.Vista.HistorialUsuarios;
import ies.lavereda.Biblioteca.Vista.IniciarSesionUsuario;
import ies.lavereda.Biblioteca.Vista.SacarLibro;
import ies.lavereda.biblioteca.modelage.Ejemplar;
import ies.lavereda.biblioteca.modelage.Libro;
import ies.lavereda.biblioteca.modelage.Persona;

public class Controlador implements ActionListener{
	
	private Biblioteca biblioteca;
	private AadirUsuario aadirUsuario;
	private IniciarSesionUsuario iniciarSesionUsuario;
	private AadirLibro aadirLibro;
	private GuiaAplicacion guiaAplicacion;
	private DevolverLibro devolverLibro;
	private SacarLibro sacarLibro;
	private HistorialUsuarios historialUsuario;

	private ArrayList<Persona> usuarios;
	private ArrayList<Libro> estanteria;
	private ArrayList<Ejemplar> ejemplares;
	
	private int indexAadir;
	private int indexIniciar;
	
	public Controlador(Biblioteca biblioteca,AadirUsuario aadirUsuario) {
		super();
		this.biblioteca = biblioteca;
		this.aadirUsuario= aadirUsuario;
		
		usuarios = new ArrayList<Persona>();
		estanteria = new ArrayList<Libro>();
		ejemplares = new ArrayList<Ejemplar>();
		
		this.indexAadir = 0;
		this.indexIniciar = 0;
		
		inicializar();
	}

	private void inicializar() {
		
		biblioteca.getBtnAadirLibro().addActionListener(this);
		biblioteca.getBtnAadirUsuario().addActionListener(this);
		biblioteca.getBtnDevolverLibro().addActionListener(this);
		biblioteca.getBtnGuiaAplicacion().addActionListener(this);
		biblioteca.getBtnIniciarSesionUsuario().addActionListener(this);
		biblioteca.getBtnHistorialUsuario().addActionListener(this);
		biblioteca.getBtnSacarLibro().addActionListener(this);
		
		biblioteca.getBtnAadirLibro().setActionCommand("aadirLibro");
		biblioteca.getBtnAadirUsuario().setActionCommand("aadirUsuario");
		biblioteca.getBtnDevolverLibro().setActionCommand("devolverLibro");
		biblioteca.getBtnGuiaAplicacion().setActionCommand("guiaAplicacion");
		biblioteca.getBtnIniciarSesionUsuario().setActionCommand("iniciarsesionUsuario");
		biblioteca.getBtnHistorialUsuario().setActionCommand("historialusuario");
		biblioteca.getBtnSacarLibro().setActionCommand("sacarLibro");
		
		
		
		
		
	}

	public void go() {
		
		biblioteca.setVisible(true);
	
		
	}
	
//	public void goo() {
//		
//		aadirUsuario.setVisible(true);
//		
//	}
//	public void gooo() {
//		aadirLibro.setVisible(true);
//	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String comando = arg0.getActionCommand();
	
		if(comando.equals("aadirLibro")) {
			aadirLibro();
		}else if(comando.equals("aadirUsuario")) {
			aadirUsuario();
		}else if(comando.equals("devolverLibro")){
			devolverLibro();
		}else if(comando.equals("guiaAplicacion")) {
			guiaAplicacion();
		}else if(comando.equals("iniciarsesionUsuario")) {
			iniciarSesionUsuario();
		}else if(comando.equals("sacarLibro")) {
			sacarLibroEstanteria();
		}else if(comando.equals("volver")) {
			volver();
		}else if(comando.equals("aadir")) {
			aadir();
		}else if(comando.equals("iniciar")) {
			iniciar();
		}else if(comando.equals("volver2")) {
			volver2();
		}else if(comando.equals("Activado")) {
			activado();
		}else if(comando.equals("añadir")){
			aadirEstanteria();
		}else if(comando.equals("volver3")) {
			volver3();
		}else if(comando.equals("volveraplicacion")) {
			volverAplicacion();
		}else if(comando.equals("volvermenu")) {
			volvermenu();
		}else if(comando.equals("devolver")) {
			devolver();
		}else if (comando.equals("volversacar")) {
			volversacar();
		}else if(comando.equals("sacar")) {
			sacar();
		}else if(comando.equals("historialusuario")) {
			historialUsuario();
		}else if(comando.equals("volverhistorial")) {
			volverHistorial();
		}
		
	
	}

	private void volverHistorial() {
	
		historialUsuario.dispose();
	
}

	private void historialUsuario() {
	
		historialUsuario = new HistorialUsuarios();
		
		historialUsuario.getBtnVolver().addActionListener(this);
		
		historialUsuario.getBtnVolver().setActionCommand("volverhistorial");
		
		historialUsuario.setVisible(true);
		
		
		int i=0;
		for(Persona persona : usuarios) {
			historialUsuario.getDtm().addRow(new String[] {
	
				persona.getNombre(),
				persona.getApellido(),
				persona.getDNI()
			});
			i++;
		}
		
		
	
}

	private void sacar() {

		sacarLibro.dispose();
	
}

	private void volversacar() {
	
		sacarLibro.dispose();
	
}

	private void devolver() {
		
		Libro libro = new Libro(devolverLibro.getTextField_Titulo(),devolverLibro.getTextField_Autor(),devolverLibro.getTextField_Isbm(),true);
		Ejemplar ejemplar = new Ejemplar(devolverLibro.getTextField_Isbm(),devolverLibro.getTextField_Ejemplar());
		
		estanteria.add(libro);
		ejemplares.add(ejemplar);
		
		devolverLibro.dispose();
		
	}

	private void volvermenu() {
		
		devolverLibro.dispose();
		
	}

	private void volverAplicacion() {
		
		guiaAplicacion.dispose();
		
	}

	private void volver3() {
		
		aadirLibro.dispose();
		
	}

	private void aadirEstanteria() {
		
		Libro libro = new Libro(aadirLibro.getTextField_Tiutulo(),aadirLibro.getTextField_Autor(),aadirLibro.getTextField_Isbm(),true);
		
		estanteria.add(libro);
		
		aadirLibro.dispose();
		
	}

	private void activado() {
		biblioteca.getBtnAadirLibro().setEnabled(true);
		biblioteca.getBtnDevolverLibro().setEnabled(true);
		biblioteca.getBtnHistorialUsuario().setEnabled(true);
		biblioteca.getBtnDevolverLibro().setEnabled(true);
		biblioteca.getBtnSacarLibro().setEnabled(true);
		
		iniciarSesionUsuario.dispose();
		
	}

	private void iniciar() {
		
		
		
		iniciarSesionUsuario.getTextField_DNI();
		
		iniciarSesionUsuario.getBtnIniciar().setActionCommand("Activado");
			
	}

	private void aadir() {
		
		Persona persona = new Persona(aadirUsuario.getTextField_nombre(),aadirUsuario.getTextField_Apellidos(),aadirUsuario.getTextField_Dni(),true);
		
	//	biblioteca.setVisible(true);
		
		usuarios.add(persona);
		
		aadirUsuario.dispose();
		
	}

	private void volver() {
		
	
		aadirUsuario.dispose();
		
		
	}

	private void volver2() {
		
		
		iniciarSesionUsuario.dispose();
		
		
	}
	
	private void sacarLibroEstanteria() {
		
		sacarLibro = new SacarLibro();
		
		sacarLibro.setVisible(true);
		
		sacarLibro.getBtnSacar().addActionListener(this);
		sacarLibro.getBtnVolver().addActionListener(this);

		sacarLibro.getBtnSacar().setActionCommand("sacar");
		sacarLibro.getBtnVolver().setActionCommand("volversacar");
	}

	private void iniciarSesionUsuario() {
		
		
		
		if(indexIniciar==0) {
			iniciarSesionUsuario = new IniciarSesionUsuario();
			indexIniciar++;
		}else {
			
		}
		
		iniciarSesionUsuario.setVisible(true);
		
		iniciarSesionUsuario.getBtnIniciar().addActionListener(this);
		iniciarSesionUsuario.getBtnVolver().addActionListener(this);
		
		for(Persona persona : usuarios) {
			iniciarSesionUsuario.getBtnVolver().setActionCommand("volver2");
			if(iniciarSesionUsuario.getTextField_Nombre().equals(persona.getDNI())) {
				iniciarSesionUsuario.getBtnIniciar().setActionCommand("iniciar");
				iniciarSesionUsuario.getBtnVolver().setActionCommand("volver2");
			}
		}
		iniciarSesionUsuario.getBtnIniciar().setActionCommand("iniciar");
	}

	private void guiaAplicacion() {

		guiaAplicacion = new GuiaAplicacion();
		
		guiaAplicacion.setVisible(true);
		
		guiaAplicacion.getBtnVolver().addActionListener(this);
		
		guiaAplicacion.getBtnVolver().setActionCommand("volveraplicacion");
	}

	private void devolverLibro() {
		
		devolverLibro = new DevolverLibro();
		
		devolverLibro.setVisible(true);
		
		devolverLibro.getBtnDevolver().addActionListener(this);
		devolverLibro.getBtnVolver().addActionListener(this);

		devolverLibro.getBtnDevolver().setActionCommand("devolver");
		devolverLibro.getBtnVolver().setActionCommand("volvermenu");
	}

	private void aadirUsuario() {
		
		if(indexAadir==0) {
			aadirUsuario = new AadirUsuario();
			indexAadir++;
		}else {
			
		}
		
		aadirUsuario.setVisible(true);
		
		aadirUsuario.getBtnVolver().addActionListener(this);
		aadirUsuario.getBtnAadir().addActionListener(this);
		
		aadirUsuario.getBtnVolver().setActionCommand("volver");
		aadirUsuario.getBtnAadir().setActionCommand("aadir");
		
		
		
	}

	private void aadirLibro() {
				
		aadirLibro = new AadirLibro();
		
		aadirLibro.setVisible(true);
		
		aadirLibro.getBtnVolver().addActionListener(this);
		aadirLibro.getBtnAadir().addActionListener(this);
		
		aadirLibro.getBtnVolver().setActionCommand("volver3");
		aadirLibro.getBtnAadir().setActionCommand("añadir");
		
	}

}
