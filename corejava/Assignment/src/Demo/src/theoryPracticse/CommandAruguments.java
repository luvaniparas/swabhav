package theoryPracticse;


public class CommandAruguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		a=Integer.parseInt(args[0]);
		System.out.println("Command Args one :"+a);
		b=Integer.parseInt(args[1]);
		System.out.println("Command args two :"+b);
		CommandAruguments obj = new CommandAruguments();
		obj.calculator(a,b);
		
	}
	
	public void calculator(int a,int b) {
	 int c= a+b;
	 System.out.println("Addition is :"+c);
	}
}
