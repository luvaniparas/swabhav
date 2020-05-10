package PoolPuzzle;

class RowBoat extends Boat {
	public void rowTheBoat() {
		System.out.println("stroke natasha");
	}
}

class Boat {
	private int length;

	public void setLength(int len) {
		length = len;
	}

	public int getLength() {
		return length;
	}

	public void move() {
		System.out.print(" drift");
	}
}

public class TestBoats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boat b1 = new Boat();
		Sailboat b2 = new Sailboat();
		RowBoat b3 = new RowBoat();
		b2.setLength(32);
		b1.move();
		b3.move();
		b2.move();
	}

}

class Sailboat extends Boat {
	public void move() {
		System.out.print(" hoist Sail");
	}
}