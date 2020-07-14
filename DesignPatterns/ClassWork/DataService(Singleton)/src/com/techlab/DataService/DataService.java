package com.techlab.DataService;

public class DataService {

	private static DataService bucket;

	private DataService() {
	}

	public static DataService getInstance() {
		if (bucket == null)
			bucket = new DataService();

		return bucket;
	}

	public void processData() {
		System.out.println(bucket.hashCode());
	}

	public static void main(String[] args) {
		
		DataService s1 = DataService.getInstance() ;
		DataService s2 = DataService.getInstance() ;	
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		s1.processData();
		s2.processData();
	}
}
