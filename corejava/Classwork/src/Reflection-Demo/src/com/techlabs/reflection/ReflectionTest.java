package com.techlabs.reflection;

import java.lang.reflect.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.techlabs.person.Person;


public class ReflectionTest {

	public static void main(String[] args) {
		//Person obj = new Person("abc", 25, "Male", 6.6f, 50.0f, 16);
		Object obj = new Object();

		Class cls = obj.getClass();
		System.out.println("Class Name : " + cls.getName());
		printMethodInfo(cls);
		printConstructorInfo(cls);
		printGetterInfo(cls);
		printSetterInfo(cls);
		printPrivateMember(cls);
		printPrivateFields(cls);
	}

	public static void printPrivateMember(Class c) {
		Field[] fields = c.getClass().getFields() ;
		System.out.println("\nPrivate Fields -> ");
		for(Field f : fields) {
			if(Modifier.isPrivate(c.getModifiers())) {
				System.out.println(c.getName());
			}
		}
	}
	
	public static void printPrivateFields(Class c) {
		Method[] method = c.getClass().getDeclaredMethods() ;
		System.out.println("\nPrivate Methods -> ");
		for(Method m:method) {
			if(Modifier.isPrivate(m.getModifiers())) {
				System.out.println(m.getName());
			}
		}
	}
	
	public static void printMethodInfo(Class c) {
		Method[] methods = c.getMethods();
		System.out.println("\nMethods -> ");
		
		for (Method m : methods) {
			System.out.println(m.getName());
		}
	}

	public static void printConstructorInfo(Class c) {
		Constructor[] constructors = c.getClass().getConstructors();
		
		System.out.println("\nConstructor -> ");
		
		for (Constructor<?> cc : constructors) {
			System.out.println("constructors : " + cc.getName());
		}
	}

	public static void printGetterInfo(Class c) {
		Method[] methods = c.getClass().getMethods();

		System.out.println("\nGetters -> ");
		
		for (Method m : methods) {
			if (m.getName().contains("get")) {
				System.out.println(m.getName());
			}
		}
	}

	public static void printSetterInfo(Class c) {
		Method[] methods = c.getClass().getMethods();
		
		System.out.println("\n Setters -> ");
		
		for (Method m : methods) {
			if (m.getName().contains("set")) {
				System.out.println("Setters : " + m.getName());
			}
		}
	}
}
