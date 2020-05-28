package com.techlab.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

import com.techlab.annotation.Foo;
import com.techlab.annotation.Foo.TestCase;

public class AnnotationTest {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Foo obj = new Foo();
		Class cls = obj.getClass();
		// printCont(obj);
		// printCont2(obj);
		countCase(obj);
	}

	public static void countCase(Foo at)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int pass = 0, fail = 0;
		;
		Method[] methods = at.getClass().getMethods();
		for (Method m : methods) {
			if (m.isAnnotationPresent(TestCase.class)) {
				boolean result = (boolean) m.invoke(at, null);
				if (result == true) {
					pass++;

				} else {
					fail++;

				}
			}
		}
		System.out.println("Annotation count : " + (pass + fail));
		System.out.println("Passing : " + pass);
		System.out.println("Failing : " + fail);
	}

	/*
	 * public static void printCont2(Foo at) { int count = 0; Method[] methods =
	 * at.getClass().getMethods(); for (Method m : methods) { Annotation[]
	 * annotations = m.getDeclaredAnnotations(); for (Annotation a : annotations) {
	 * if (m.isAnnotationPresent(TestCase.class)) { count++; }
	 * 
	 * } } System.out.println("Number Of Annotation :" + count); }
	 */

	/*
	 * public static void printCont(Foo at) { int annotationCount = 0; Method[]
	 * methods = at.getClass().getMethods(); for (Method m : methods) { if
	 * (m.isAnnotationPresent(TestCase.class)) { annotationCount++; } }
	 * System.out.println("Number Of Annotation : " + annotationCount);
	 * 
	 * }
	 */
}
