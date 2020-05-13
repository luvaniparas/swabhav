package theoryPracticse;

public class BoxingUnboxingDemo {
	public static void main(String args[]) {
		// Boxing
		int a = 20;
		Integer iobj = Integer.valueOf(a);// converting int into Integer explicitly
		Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally
		System.out.println(" "+iobj+" "+j);
		
		
		double d=20.20;
		Double dd = Double.valueOf(d);
		Double e = dd ; 
		System.out.println(" "+dd+" "+e);
		
		
		Integer pobj=new Integer(3);    
		int p=pobj.intValue();//converting Integer to int explicitly  
		int q=pobj;//unboxing, now compiler will write a.intValue() internally  
		System.out.println(" "+pobj+" "+q);
		
		Float fobj = new Float(3.3f);
		float f=fobj.floatValue();
		Float ff = fobj ;
		System.out.println(" "+f+""+ff);
		
		
	}
}
