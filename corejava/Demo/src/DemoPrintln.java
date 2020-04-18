 class PrintOverload {
	 public void println(boolean x) {
			System.out.println("Boolean Parameter " + x);
		}
	 public void println(char x) {
			System.out.println("Char Parameter " + x);
		}
	
	public void println(int x) {
		System.out.println("Integer Parameter " + x);
	}
	
	public void println(long x) {
		System.out.println("Long Parameter " + x);
	}
	
	public void println(float x) {
		System.out.println("Float Parameter " + x);
	}
	
	public void println(double x) {
		System.out.println("Double Parameter " + x);
	}
	
	public void println(char x[]) {
		System.out.println("Char Parameter " + x);
	}
	
	public void println(String x) {
		System.out.println("String Parameter " + x);
	}
	
}

public class DemoPrintln {

	public static void main(String[] args) {
		boolean x = true; 
/*		char x = 'x' ;
		int x = 1; 
		long x = 807 ;
		float x =3.14f ;
		double x = 2.5; 
		char x[] = {0} ; 
		String x = "Xstring" ;
*/		
		PrintOverload po = new PrintOverload (); 
		po.println(x);
	}

}
