package ies.lavereda.Biblioteca.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class IniciarSesionUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Nombre;
	private JTextField textField_Apellido;
	private JTextField textField_DNI;
	private JButton btnVolver;
	private JButton btnIniciar;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					IniciarSesionUsuario frame = new IniciarSesionUsuario();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public IniciarSesionUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNombre = new JLabel("Nombre");
		
		textField_Nombre = new JTextField();
		textField_Nombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		
		textField_Apellido = new JTextField();
		textField_Apellido.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		
		textField_DNI = new JTextField();
		textField_DNI.setColumns(10);
		
		btnIniciar = new JButton("Iniciar");
		
		btnVolver = new JButton("Volver");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(168)
							.addComponent(lblNombre))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(169)
							.addComponent(lblApellido))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(174)
							.addComponent(lblDni))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnVolver)
							.addPreferredGap(ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
							.addComponent(btnIniciar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_DNI, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
								.addComponent(textField_Apellido, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
								.addComponent(textField_Nombre, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNombre)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(lblApellido)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_Apellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDni)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_DNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIniciar)
						.addComponent(btnVolver))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JTextField getTextField_Nombre() {
		return textField_Nombre;
	}

	public JTextField getTextField_Apellido() {
		return textField_Apellido;
	}

	public JTextField getTextField_DNI() {
		return textField_DNI;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JButton getBtnIniciar() {
		return btnIniciar;
	}
	
	
}
