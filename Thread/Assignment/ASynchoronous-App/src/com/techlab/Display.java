package com.techlab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Display extends Thread implements ActionListener {

	Thread t1 = new Thread(this);
	JFrame f = new JFrame();

	public void createFrame() {
		JButton b1 = new JButton("Display");
		b1.setBounds(50, 100, 95, 30);
		f.add(b1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Start");
				t1.start();
			}
		});

		JButton b2 = new JButton("Hello");
		b2.setBounds(200, 100, 95, 30);
		f.add(b2);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hello !");
			}
		});

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public void run() {
		System.out.println("Run");
		while (true) {
			System.out.println(java.time.LocalTime.now());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
