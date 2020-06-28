package DIP.Violation;

public class TaxCalculation {

	private LogType log;

	public TaxCalculation(LogType log) {
		this.log = log;
	}

	public LogType getLog() {
		return log;
	}

	public int calculate(int amount, int rate) {

		try {
			int r = amount / rate;
			return r;
		} catch (Exception e) {
			if (this.getLog() == LogType.TXT) {
				TxtLogger txtF = new TxtLogger();
				txtF.log(e.getMessage());
				return -1;
			}
			XmlLogger xm = new XmlLogger();
			xm.log(e.getMessage());
			return -1;
		}

	}

}
