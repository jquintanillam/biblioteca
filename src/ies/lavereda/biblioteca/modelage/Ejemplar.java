package ies.lavereda.biblioteca.modelage;

import javax.swing.JTextField;

public class Ejemplar {
	
	private JTextField ISBM;
	private JTextField numEjemplares;
	
	public Ejemplar(JTextField jTextField, JTextField jTextField2) {
		super();
		ISBM = jTextField;
		this.numEjemplares = jTextField2;
	}

	public JTextField getISBM() {
		return ISBM;
	}

	public void setISBM(JTextField iSBM) {
		ISBM = iSBM;
	}

	public JTextField getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(JTextField numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	@Override
	public String toString() {
		return "Ejemplar [ISBM=" + ISBM + ", numEjemplares=" + numEjemplares + "]";
	}

	
}
