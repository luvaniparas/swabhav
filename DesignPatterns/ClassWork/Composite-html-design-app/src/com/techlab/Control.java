package com.techlab;

public class Control implements IHtml {

	private final String tag;
	private String type, value;

	public Control(String tag) {
		this.tag = tag;
	}

	public Control(String tag, String type, String value) {
		this.tag = tag;
		this.type = type;
		this.value = value;
	}

	@Override
	public StringBuilder parseHtml() {
		StringBuilder sb = new StringBuilder();
		String s = " ";
		
		//open tag
		sb.append("<");
		sb.append(tag);
		sb.append(s);
		
		sb.append("type = ");
		sb.append(type);
		sb.append(s);
		
		sb.append("value = ");
		sb.append(value);
		sb.append(">");
		
		//close tag
		sb.append("</");
		sb.append(tag);
		sb.append(">");
	
		return sb;
	}

}
