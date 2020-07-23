package com.techlab.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.techlab.Control;
import com.techlab.ControlGroup;

public class HtmlTest {

	public static void main(String[] args) throws IOException {

		ControlGroup html = new ControlGroup("html");
		ControlGroup body = new ControlGroup("body");
		ControlGroup div = new ControlGroup("div");

		html.addControl(body);
		body.addControl(div);

		div.addControl(new Control("input", "text", "FirstName"));
		div.addControl(new ControlGroup("br"));

		div.addControl(new Control("input", "text", "LastName"));
		div.addControl(new ControlGroup("br"));

		div.addControl(new Control("input", "submit", "login"));
		div.addControl(new ControlGroup("br"));

		StringBuilder sb = html.parseHtml();

		File file = new File(
				"C:\\swabhav\\DesignPatterns\\ClassWork\\Composite-design-app\\src\\com\\techlab\\Resources\\htmltest.html");
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			writer.write(sb.toString());
		}
	}

}
