package com.techlabs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.DateFormat.Field;
import java.lang.reflect.*;

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
		Field [] field= Class<Person>c.getClass().getDeclaredFields();
		
		for(Field f : field) {
			if(Modifier.isPrivate(f.getModifiers())) {
				System.out.println(f.getName());
			}
		}
	}
	
	public static void printPrivateFields(Class c) {
		Method[] method = c.getClass().getDeclaredMethods() ;
		
		for(Method m:method) {
			if(Modifier.isPrivate(m.getModifiers())) {
				System.out.println(m.getName());
			}
		}
	}
	
	public static void printMethodInfo(Class c) {
		Method[] methods = c.getMethods();

		for (Method m : methods) {
			System.out.println("Methods : " + m.getName());
		}
	}

	public static void printConstructorInfo(Class c) {
		Constructor[] constructors = c.getClass().getConstructors();

		for (Constructor<?> cc : constructors) {
			System.out.println("constructors : " + cc.getName());
		}
	}

	public static void printGetterInfo(Class c) {
		Method[] methods = c.getClass().getMethods();

		for (Method m : methods) {
			if (m.getName().contains("get")) {
				System.out.println("Getters : " + m.getName());
			}
		}
	}

	public static void printSetterInfo(Class c) {
		Method[] methods = c.getClass().getMethods();
		for (Method m : methods) {
			if (m.getName().contains("set")) {
				System.out.println("Setters : " + m.getName());
			}
		}
	}
}
