package com.techlab;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IHtml {
	private final String tag;
	private String id;
	private List<IHtml> controls = new ArrayList<IHtml>();

	public ControlGroup(String tag) {
		this.tag = tag;
	}

	public void addControl(IHtml element) {
		controls.add(element);
	}

	@Override
	public StringBuilder parseHtml() {

		StringBuilder sb = new StringBuilder();
		String s = " ";

		// open tag
		sb.append("<");
		sb.append(tag);
		sb.append(s);
		sb.append(">");

		for (IHtml i : controls) {
			sb.append(i.parseHtml());
		}

		// close tag
		sb.append("</");
		sb.append(tag);
		sb.append(">");

		return sb;
	}

}
