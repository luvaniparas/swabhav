package com.techlab.annotation.test;

import java.lang.reflect.*;
import com.techalb.annotation.Foo;
import com.techalb.annotation.Foo.RequiredRefactor;

public class AnntationTest {

	public static void main(String[] args) {
		Foo fobj = new Foo();

		Class cls = fobj.getClass();
		// System.out.println(cls);
		
		printAnnotaions(fobj);
	}

	public static void printAnnotaions(Foo f) {
		int annotationCount = 0;
		Method[] method = f.getClass().getMethods();

		System.out.println("Methods With Annotation : ");
		for (Method m : method) {
			if (m.isAnnotationPresent(RequiredRefactor.class)) {
				System.out.println(m.getName()+" ");
				annotationCount++ ;
			}
		}
		System.out.println("Number of Annotation Presented :"+annotationCount);
	}
}
