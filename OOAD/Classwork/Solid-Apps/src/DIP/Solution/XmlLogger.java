package DIP.Solution;

public class XmlLogger implements ILogType {

	public void log(String logError) {
		System.out.println("Printed Error to xml File");

		System.out.println(logError);
	}

}
