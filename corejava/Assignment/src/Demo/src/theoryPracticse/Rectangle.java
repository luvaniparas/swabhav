package theoryPracticse;

public class Rectangle {

	private int x,y;
	private int width,height;
	
	public Rectangle(int x,int y) {
		this.x = x ;
		this.y = y ;
	}
	
	public Rectangle(int x, int y, int width, int height) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	    }
	
	public void display() {
		System.out.println("Value :"+x);
		System.out.println("Value :"+y);
		System.out.println("Value :"+width);
		System.out.println("Value :"+height);
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle (10,20);
		Rectangle r2 = new Rectangle (1,2,3,4);
		r1.display();
		r2.display();
	}
}
