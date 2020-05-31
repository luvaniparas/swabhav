package com.techlab.serialization.serializationTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlab.serialization.Serialization;

public class TestSerialization {
	public static void main(String args[]) {

		Serialization obj = new Serialization(101, "one");

		try {
			Serialization s1 = new Serialization(211, "user1");

			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();

			// closing the stream
			out.close();
			System.out.println("success Serialization ");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//DeSerialization
		try{  
			  //Creating stream to read the object  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
			  Serialization s=(Serialization)in.readObject();  
			  //printing the data of the serialized object  
			  System.out.println(s.id+" "+s.name);  
			  //closing the stream  
			  in.close();  
			  }catch(Exception e){System.out.println(e);}  

	}
}
