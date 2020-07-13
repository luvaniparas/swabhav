package com.techlab.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonDemo implements ActionListener {

	ButtonDemo() {
		JFrame f1 = new JFrame();

		JButton b1 = new JButton("Name");
		b1.setBounds(130, 100, 100, 40);

		f1.add(b1);

		b1.addActionListener(this);

		f1.setSize(400, 500);
		f1.setLayout(null);
		f1.setVisible(true);
	}

	public static void main(String[] args) {

		new ButtonDemo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JFrame f2 = new JFrame();
		JButton b1 = new JButton("Paras");
		b1.setBounds(130, 100, 100, 40);

		f2.add(b1);

		f2.setSize(400, 500);
		f2.setLayout(null);
		f2.setVisible(true);
	}

}
