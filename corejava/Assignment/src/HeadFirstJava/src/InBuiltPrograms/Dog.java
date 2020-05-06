package InBuiltPrograms;

public class Dog {

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		d1.bark();
		d1.name = "tommy";

		Dog[] d = new Dog[3];
		d[0] = new Dog();
		d[1] = new Dog();
		d[2] = d1;

		d[0].name = "Fred";
		d[1].name = "marge";
		System.out.println("Second Dog name is " + d[2].name);

		int x = 0;
		while (x < d.length) {
			d[x].bark();
			x += 1;
		}
	}

	public void bark() {
 System.out.println(name + "Says Ruff !");
	}

	public void eat() {

	}

	public void chaseCat() {

	}
}
