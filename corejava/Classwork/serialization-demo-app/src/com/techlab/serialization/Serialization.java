package com.techlab.serialization;

import java.io.*;

public class Serialization implements java.io.Serializable {

	public int id;
	public String name;

	public Serialization(int id, String name) {
		this.id = id;
		this.name = name;
	}

}
