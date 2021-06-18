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

public class AadirLibro extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Tiutulo;
	private JTextField textField_Autor;
	private JTextField textField_Isbm;
	private JButton btnVolver;
	private JButton btnAadir;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AadirLibro frame = new AadirLibro();
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
	public AadirLibro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTitulo = new JLabel("Titulo");
		
		textField_Tiutulo = new JTextField();
		textField_Tiutulo.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor");
		
		textField_Autor = new JTextField();
		textField_Autor.setColumns(10);
		
		JLabel lblIsbm = new JLabel("ISBM");
		
		textField_Isbm = new JTextField();
		textField_Isbm.setColumns(10);
		
		btnAadir = new JButton("Añadir");
		
		btnVolver = new JButton("Volver");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAutor)
						.addComponent(textField_Autor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTitulo)
							.addContainerGap(388, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField_Tiutulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(314, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblIsbm)
							.addContainerGap(394, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField_Isbm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(314, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnVolver)
							.addPreferredGap(ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
							.addComponent(btnAadir))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addComponent(lblTitulo)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_Tiutulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblAutor)
					.addGap(18)
					.addComponent(textField_Autor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblIsbm)
					.addGap(18)
					.addComponent(textField_Isbm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAadir)
						.addComponent(btnVolver))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JTextField getTextField_Tiutulo() {
		return textField_Tiutulo;
	}

	public JTextField getTextField_Autor() {
		return textField_Autor;
	}

	public JTextField getTextField_Isbm() {
		return textField_Isbm;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JButton getBtnAadir() {
		return btnAadir;
	}
	
}
