package com.techlab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Display extends JFrame implements ActionListener {

	public void createFrame() {

		JButton b1 = new JButton("Display");
		b1.setBounds(50, 100, 95, 30);
		add(b1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				while (true) {
					System.out.println(java.time.LocalTime.now());
				}
			}

		});

		JButton b2 = new JButton("Hello");
		b2.setBounds(200, 100, 95, 30);
		add(b2);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hello !");
			}

		});

		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
