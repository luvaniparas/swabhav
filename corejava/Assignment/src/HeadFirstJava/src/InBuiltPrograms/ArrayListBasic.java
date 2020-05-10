package InBuiltPrograms;

import java.util.ArrayList;

public class ArrayListBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mylist = new ArrayList<Integer>();
	
	 Integer one = new Integer(1);
	 mylist.add(one);
	 Integer two = new Integer(2);
	 mylist.add(two);
	 
	 int size = mylist.size();
	 System.out.println("Size is :"+size);
	 
	 boolean isIn = mylist.contains(one);
	 System.out.println("contains :"+isIn);
	 
	 int index = mylist.indexOf(two);
	 System.out.println("Index of Two :"+index);
	 
	 boolean empty = mylist.isEmpty();
	 System.out.println("mylist Is empty or not :"+empty);
	 
	 mylist.remove(two);
	 
	}

}
