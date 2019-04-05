package com.ipartek.formacion.proyecto.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HelloSwing {

	public static void main(String[] args) {

		JFrame f = new JFrame();// creating instance of JFrame

		JTextField tfNombre = new JTextField("Dime tu nombre");
		tfNombre.setBounds(70, 70, 200, 30);
		f.add(tfNombre);

		JLabel lNombre = new JLabel("No seas timido");
		lNombre.setBounds(100, 150, 150, 40);
		f.add(lNombre);

		JButton b = new JButton("Saludar");// creating instance of JButton
		b.setBounds(130, 100, 100, 40);// x axis, y axis, width, height

		f.add(b);// adding button in JFrame

		f.setSize(400, 500);// 400 width and 500 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible

		// recoger evento boton
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				lNombre.setText(tfNombre.getText());
			}
		});

	}

}
