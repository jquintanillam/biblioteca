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
import javax.swing.JComboBox;
import javax.swing.JButton;

public class SacarLibro extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Titulo;
	private JTextField textField_Autor;
	private JTextField textField_Isbm;
	private JButton btnSacar;
	private JButton btnVolver;
	private JComboBox comboBox_Ejemplares;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SacarLibro frame = new SacarLibro();
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
	public SacarLibro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTitulo = new JLabel("Titulo");
		
		textField_Titulo = new JTextField();
		textField_Titulo.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor");
		
		textField_Autor = new JTextField();
		textField_Autor.setColumns(10);
		
		JLabel lblIsbm = new JLabel("ISBM");
		
		textField_Isbm = new JTextField();
		textField_Isbm.setColumns(10);
		
		JLabel lblEjemplares = new JLabel("Ejemplares");
		
		comboBox_Ejemplares = new JComboBox();
		
		btnVolver = new JButton("Volver");
		
		btnSacar = new JButton("Sacar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblTitulo)
							.addComponent(textField_Titulo)
							.addComponent(lblAutor)
							.addComponent(textField_Autor)
							.addComponent(lblIsbm)
							.addComponent(textField_Isbm)
							.addComponent(lblEjemplares)
							.addComponent(comboBox_Ejemplares, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnVolver)
							.addPreferredGap(ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
							.addComponent(btnSacar)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblTitulo)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_Titulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblAutor)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_Autor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblIsbm)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_Isbm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEjemplares)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBox_Ejemplares, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnVolver)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(229, Short.MAX_VALUE)
					.addComponent(btnSacar)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JTextField getTextField_Titulo() {
		return textField_Titulo;
	}

	public JTextField getTextField_Autor() {
		return textField_Autor;
	}

	public JTextField getTextField_Isbm() {
		return textField_Isbm;
	}

	public JButton getBtnSacar() {
		return btnSacar;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JComboBox getComboBox_Ejemplares() {
		return comboBox_Ejemplares;
	}

	
}
