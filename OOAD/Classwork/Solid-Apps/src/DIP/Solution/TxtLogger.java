package DIP.Solution;

public class TxtLogger implements ILogType {

	public void log(String error) {
		System.out.println("Writing to text File");
		
		System.out.println(error);
	}

}
