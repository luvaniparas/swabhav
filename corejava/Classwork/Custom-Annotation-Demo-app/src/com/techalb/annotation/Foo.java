package com.techalb.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Foo {

	public void greet() {
		System.out.println("Hello");
	}

	@RequiredRefactor
	public void go() {
		System.out.println("Bye");
	}

	public void play() {
		System.out.println("Playing");
	}

	@RequiredRefactor
	public void dance() {
		System.out.println("Dancing");
	}

	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface RequiredRefactor {
	}

}
