package theoryPracticse;

import java.lang.reflect.Method;

class Test {
	public int i = 1;

	public int add() {
		return i + 1;
	}

	public Test() {
		int a = 10, b = 20;
		int c = a * b;
	}
}

class Test1 {

}

public class ReflectionDemo {

	public static void main(String[] args) {
		Test obj = new Test();
		// Creating class object from the object using
		// getclass method
		Class cls = obj.getClass();
		System.out.println("The name of class is " + cls.getName());

		Method[] methods = cls.getMethods();
	       for (Method method:methods) 
	            System.out.println(method.getName());
	}

}
