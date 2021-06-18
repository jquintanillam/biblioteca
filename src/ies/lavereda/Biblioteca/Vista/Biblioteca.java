package ies.lavereda.Biblioteca.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Biblioteca extends JFrame {

	private JPanel contentPane;
	private JButton btnAadirUsuario;
	private JButton btnAadirLibro;
	private JButton btnHistorialUsuario;
	private JButton btnDevolverLibro;
	private JButton btnIniciarSesionUsuario;
	private JButton btnGuiaAplicacion;
	private JButton btnSacarLibro;
	private JButton btnLibros;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Biblioteca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mnMenu.add(mntmGuardar);
		
		JMenuItem mntmCargar = new JMenuItem("Cargar");
		mnMenu.add(mntmCargar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(66)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		btnIniciarSesionUsuario = new JButton("Iniciar Sesion Usuario");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(149, Short.MAX_VALUE)
					.addComponent(btnIniciarSesionUsuario)
					.addGap(34))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(btnIniciarSesionUsuario)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		btnAadirUsuario = new JButton("Añadir Usuario");
		
		btnAadirLibro = new JButton("Añadir Libro");
		btnAadirLibro.setEnabled(false);
		
		btnDevolverLibro = new JButton("Devolver Libro");
		btnDevolverLibro.setEnabled(false);
		
		btnHistorialUsuario = new JButton("Historial Usuario");
		btnHistorialUsuario.setEnabled(false);
		
		btnSacarLibro = new JButton("Sacas Libro");
		btnSacarLibro.setEnabled(false);
		
		btnLibros = new JButton("Libros");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnAadirLibro, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnSacarLibro, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
						.addComponent(btnAadirUsuario, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(58)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnLibros, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnHistorialUsuario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnDevolverLibro, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
					.addGap(114))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAadirUsuario)
						.addComponent(btnHistorialUsuario))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSacarLibro)
						.addComponent(btnDevolverLibro))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAadirLibro)
						.addComponent(btnLibros))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		btnGuiaAplicacion = new JButton("Guia Aplicacion");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnGuiaAplicacion)
					.addContainerGap(344, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnGuiaAplicacion)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(gl_contentPane);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

//	public void setContentPane(JPanel contentPane) {
//		this.contentPane = contentPane;
//	}

	public JButton getBtnAadirUsuario() {
		return btnAadirUsuario;
	}
//
//	public void setBtnAadirUsuario(JButton btnAadirUsuario) {
//		this.btnAadirUsuario = btnAadirUsuario;
//	}
//
	public JButton getBtnAadirLibro() {
		return btnAadirLibro;
	}
//
//	public void setBtnAadirLibro(JButton btnAadirLibro) {
//		this.btnAadirLibro = btnAadirLibro;
//	}
//
	public JButton getBtnHistorialUsuario() {
		return btnHistorialUsuario;
	}
//
//	public void setBtnHistorialUsuario(JButton btnHistorialUsuario) {
//		this.btnHistorialUsuario = btnHistorialUsuario;
//	}

	public JButton getBtnDevolverLibro() {
		return btnDevolverLibro;
	}

//	public void setBtnDevolverLibro(JButton btnDevolverLibro) {
//		this.btnDevolverLibro = btnDevolverLibro;
//	}
//
	public JButton getBtnIniciarSesionUsuario() {
		return btnIniciarSesionUsuario;
	}

//	public void setBtnIniciarSesionUsuario(JButton btnIniciarSesionUsuario) {
//		this.btnIniciarSesionUsuario = btnIniciarSesionUsuario;
//	}
//
		public JButton getBtnGuiaAplicacion() {
			return btnGuiaAplicacion;
		}

		public JButton getBtnSacarLibro() {
			return btnSacarLibro;
		}

		public JButton getBtnLibros() {
			return btnLibros;
		}
		
}
