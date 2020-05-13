package theoryPracticse;

public class ConstructorChanningDemo {

	public ConstructorChanningDemo(int x , int y){
		this(10) ;
		System.out.println("Values : "+x+" : "+y);
	}
	
	public ConstructorChanningDemo(int x ){
		this();
		System.out.println("Values : "+x);
	}
	
	public ConstructorChanningDemo(){
		System.out.println("No Values :");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorChanningDemo(100,200);
	}

}
