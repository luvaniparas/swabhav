package com.techlab.swing;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class RegistrationForm implements ActionListener {
	JFrame f1;

	RegistrationForm() {

		f1 = new JFrame();

		// First Name
		JLabel fName = new JLabel("First Name :");
		fName.setBounds(50, 50, 100, 25);
		f1.add(fName);
		JTextField fNameTF = new JTextField(20);
		fNameTF.setBounds(125, 50, 100, 25);
		f1.add(fNameTF);

		// Last Name
		JLabel lName = new JLabel("Last Name :");
		lName.setBounds(50, 100, 100, 25);
		f1.add(lName);
		JTextField lNameTF = new JTextField(20);
		lNameTF.setBounds(125, 100, 100, 25);
		f1.add(lNameTF);

		// Age
		JLabel age = new JLabel("Age :");
		age.setBounds(50, 150, 100, 25);
		f1.add(age);

		List<Integer> ageList = new ArrayList<Integer>();
		for (int i = 18; i <= 60; ++i) {
			ageList.add(i);
		}
		JComboBox ageCB = new JComboBox(ageList.toArray());
		ageCB.setBounds(125, 150, 100, 25);
		f1.add(ageCB);

		// Gender
		JLabel gender = new JLabel("Gender :");
		gender.setBounds(50, 175, 100, 25);
		f1.add(gender);

		ButtonGroup genderGroup = new ButtonGroup();

		JRadioButton male = new JRadioButton();
		male.setText("Male");
		male.setBounds(125, 175, 100, 25);
		genderGroup.add(male);
		f1.add(male);

		JRadioButton female = new JRadioButton();
		female.setText("female");
		female.setBounds(190, 175, 100, 25);
		genderGroup.add(female);
		f1.add(female);

		// Course
		JLabel course = new JLabel("Select a Course :");
		course.setBounds(50, 200, 100, 25);
		f1.add(course);

		String courses[] = { "C", "C++", "JAVA" };
		JComboBox courseCB = new JComboBox(courses);
		courseCB.setBounds(190, 200, 100, 25);
		f1.add(courseCB);

		// Organization
		JLabel Organization = new JLabel("Organization :");
		Organization.setBounds(50, 225, 100, 25);
		f1.add(Organization);

		JTextField OrganizationTF = new JTextField(20);
		OrganizationTF.setBounds(140, 225, 100, 25);
		f1.add(OrganizationTF);

		// Submit
		JButton submit = new JButton("Submit");
		submit.setBounds(150, 275, 100, 25);
		f1.add(submit);

		submit.addActionListener(this);

		f1.setSize(400, 500);
		f1.setLayout(null);
		f1.setVisible(true);
	}

	public static void main(String[] args) {

		new RegistrationForm();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JLabel sucessful = new JLabel("Registration Sucessful ... Welcome to Swabhav !");
		f1.add(sucessful);

	}

}
