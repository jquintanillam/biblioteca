package ies.lavereda.Biblioteca.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class GuiaAplicacion extends JFrame {

	private JPanel contentPane;
	private JButton btnVolver;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GuiaAplicacion frame = new GuiaAplicacion();
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
	public GuiaAplicacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblGuiaAplicacion = new JLabel("Guia Aplicacion");
		
		JTextPane txtpnElBotnDe = new JTextPane();
		txtpnElBotnDe.setEditable(false);
		txtpnElBotnDe.setText("El botón de inciar sesion: es para inicar la sesión.\nEl Botón de añadir libro : para añadir el libro al conjunto de libro.\nEl botón de añadir usuario: para añadir el usuario al conjunto.\nEl botón de devolver libro: para añadir el libro a los ejemplares.\nEl botón de prestar: para prestar el ejemplar del libro.\nEl botón de Historial: para mostrar el historial del usuario.");
		
		btnVolver = new JButton("Volver");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnElBotnDe, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGuiaAplicacion)
						.addComponent(btnVolver))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGuiaAplicacion)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnElBotnDe, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addComponent(btnVolver)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}
	
}
