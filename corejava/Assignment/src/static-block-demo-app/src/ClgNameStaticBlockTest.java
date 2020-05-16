class College {
	int year;
	String branch;
	static String clgName; 

	static {
		String clgName = "StepAheadJava";
	}

	College() {
		year = 1;
		branch = "Mech";
		clgName = "Sakec";
	}

	public void printInfo() {
		System.out.println("Year : " + year + " Branch : " + branch + " CollegeName : " + clgName);
	}

}

public class ClgNameStaticBlockTest {

	public static void main(String[] args) {
		
		College c1 = new College();
		c1.year = 1;
		c1.branch = "CS";
		//College.clgName = "StepAheadJava";

		College c2 = new College();
		c2.year = 2;
		c2.branch = "IT";
		//College.clgName = "StepAheadJava";

		c1.printInfo();
		c2.printInfo();

		College c3 = new College();
		c3.printInfo();
	}

}
