package com.techlab.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonDemo2 implements ActionListener {

	JButton b1, b2;

	ButtonDemo2() {
		JFrame f1 = new JFrame();

		b1 = new JButton("Red");
		b1.setBounds(180, 100, 100, 40);
		f1.add(b1);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f1.getContentPane().setBackground(Color.RED);
				// b1.setBackground(Color.RED);
			}
		});

		b2 = new JButton("Blue");
		b2.setBounds(70, 100, 100, 40);
		f1.add(b2);

		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f1.getContentPane().setBackground(Color.blue);
				// b2.setBackground(Color.BLUE);
			}
		});

		f1.setSize(400, 500);
		f1.setLayout(null);
		f1.setVisible(true);

	}

	public static void main(String[] args) {
		new ButtonDemo2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
