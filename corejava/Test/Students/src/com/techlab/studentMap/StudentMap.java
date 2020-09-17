package com.techlab.studentMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.techlab.studentMap.test.StudentMapTest;

public class StudentMap {
	
	static Scanner sc ;
	static HashMap<Integer,String> studentMap ;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		studentMap = new HashMap();
		
		//add
		getStudentInfo();
		
		//remove
		StudentMapTest.removeStudent(studentMap, 10);
		
		//update
		StudentMapTest.updateStudent(studentMap, 20, "Updated");
		
		//display
		readMap();
	}
	
	public static void getStudentInfo() {
		System.out.print("Enter name : ");
		String name = sc.next();
		
		System.out.print("Enter roll Number : ");
		int rollNumber = sc.nextInt();
		
		StudentMapTest.addStudent(studentMap,rollNumber,name);	
	}
	
	public static void readMap() {
		System.out.println("Reading map => ");
		
		for(Map.Entry m : studentMap.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	
}
