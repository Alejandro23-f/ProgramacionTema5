package es.Studium.Ejercicios;

import java.awt.*;
import java.awt.event.*;
public class EventoBotonesAdapter extends WindowAdapter implements
ActionListener

{
	Frame frmVentana = new Frame ("Diferenciar botones");
	Button btnCerrar = new Button("Cerrar");
	
	Button btnBoton1 = new Button("Uno");
	Button btnBoton2 = new Button("Dos");
	Label lblEtiqueta = new Label("    ");
	public EventoBotonesAdapter()
	{
		frmVentana.setLayout(new FlowLayout());
		
		frmVentana.add(btnBoton1);
		frmVentana.add(btnBoton2);
		frmVentana.add(lblEtiqueta);
		frmVentana.addWindowListener(this);
		btnBoton1.addActionListener(this);
		btnBoton2.addActionListener(this);
		frmVentana.setSize(300,100);
		frmVentana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventoBotones();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(btnBoton1.equals(ae.getSource()))
		{
			lblEtiqueta.setText("Uno");
		}
		else
		{
			lblEtiqueta.setText("Dos");
		}
	}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}