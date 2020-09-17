package com.techlab.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello {

	public static void main(String[] args) {
		SayHello h = new SayHello();
		SayBye b = new SayBye();
	}

}

class SayHello extends JFrame {

	public SayHello() {

		JLabel l1 = new JLabel("Hello");
		add(l1);

		setVisible(true);
		setLayout(new FlowLayout());
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class SayBye extends JFrame {

	public SayBye() {

		JLabel l1 = new JLabel("Bye");
		add(l1);

		setVisible(true);
		setLayout(new FlowLayout());
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
