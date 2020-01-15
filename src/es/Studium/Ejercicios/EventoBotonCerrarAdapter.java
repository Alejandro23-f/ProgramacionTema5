package es.Studium.Ejercicios;

import java.awt.*;
import java.awt.event.*;
//Declaramos nuestra clase que hereda de Frame e implementa //WindowListener y ActionListener para el botón
public class EventoBotonCerrarAdapter extends WindowAdapter implements
ActionListener
{
	Frame frmVentana = new Frame ("Botón que cierra la ventana");
	Button btnCerrar = new Button("Cerrar");
	
	//Constructor
	public EventoBotonCerrarAdapter()
	{
		frmVentana.setLayout(new FlowLayout());
		frmVentana.setTitle("Botón que cierra la ventana");
		frmVentana.add(btnCerrar);
		frmVentana.addWindowListener(this);
		//Añadir el listener al botón
		btnCerrar.addActionListener(this);
		frmVentana.setSize(100,100);
		frmVentana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventoBotonCerrarAdapter();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		System.exit(0);
	}
	
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}