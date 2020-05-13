package theoryPracticse;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		// Wrapping
		byte b=1;
		Byte bObj = new Byte(b);
		
		short s=1;
		Short sObj = new Short(s);
		
		int i=1;
		Integer intObj = new Integer(i);
		
		long l =100;
		Long lObj = new Long(l); 
		
		double d=2.2;
		Double dObj = new Double(d);
		
		float f=1.0f;
		Float fObj = new Float(f);
		
		char c='c';
		Character cObj = new Character(c);
		
		boolean bvar=true;
		Boolean booleanObj = new Boolean(bvar);
		
		System.out.println("Values of Wrapper objects (printing as objects)"); 
        System.out.println("Byte object :  " + bObj); 
        System.out.println("Integer object :  " + intObj); 
        System.out.println("Float object :  " + fObj); 
        System.out.println("Double object :  " + dObj); 
        System.out.println("Character object :  " + cObj);
		System.out.println("Short Object :"+sObj);
		System.out.println("Long Object :"+lObj);
		System.out.println("Boolean Object :"+booleanObj);
		
		//UnWrapping
		int ii = intObj;
		char cc= cObj;
		float ff=fObj;
		double dd=dObj;
		byte bb=bObj;
		short ss=sObj;
		long ll= lObj;
		boolean boo =booleanObj;
	
		System.out.println("\nValues of UnWrapper objects (printing as Primitive DataTypes)"); 
        System.out.println("Byte object :  " + bb); 
        System.out.println("Integer object :  " + ii); 
        System.out.println("Float object :  " + ff); 
        System.out.println("Double object :  " + dd); 
        System.out.println("Character object :  " +cc);
		System.out.println("Short Object :"+ss);
		System.out.println("Long Object :"+ll);
		System.out.println("Boolean Object :"+boo);
		
	}

}
