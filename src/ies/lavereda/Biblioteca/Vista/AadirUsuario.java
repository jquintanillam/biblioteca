package ies.lavereda.Biblioteca.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class AadirUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField_nombre;
	private JTextField textField_Apellidos;
	private JTextField textField_Dni;
	private JButton btnVolver;
	private JButton btnAadir;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AadirUsuario frame = new AadirUsuario();
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
	public AadirUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNombre = new JLabel("Nombre");
		
		textField_nombre = new JTextField();
		textField_nombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		
		textField_Apellidos = new JTextField();
		textField_Apellidos.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		
		textField_Dni = new JTextField();
		textField_Dni.setColumns(10);
		
		btnVolver = new JButton("Volver");
		
		btnAadir = new JButton("Añadir");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField_nombre, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField_Apellidos, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField_Dni, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnVolver)
							.addPreferredGap(ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
							.addComponent(btnAadir)))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(202, Short.MAX_VALUE)
					.addComponent(lblNombre)
					.addGap(183))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(199, Short.MAX_VALUE)
					.addComponent(lblApellido)
					.addGap(184))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(213, Short.MAX_VALUE)
					.addComponent(lblDni)
					.addGap(203))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addComponent(lblNombre)
					.addGap(18)
					.addComponent(textField_nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
					.addComponent(lblApellido)
					.addGap(18)
					.addComponent(textField_Apellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDni, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(textField_Dni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnVolver)
						.addComponent(btnAadir))
					.addGap(13))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JTextField getTextField_nombre() {
		return textField_nombre;
	}

	public JTextField getTextField_Apellidos() {
		return textField_Apellidos;
	}

	public JTextField getTextField_Dni() {
		return textField_Dni;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JButton getBtnAadir() {
		return btnAadir;
	}
	
}
