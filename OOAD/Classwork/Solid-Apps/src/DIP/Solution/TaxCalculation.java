package DIP.Solution;

public class TaxCalculation {

	private ILogType log;

	public TaxCalculation(ILogType log) {
		this.log = log;
	}

	public ILogType getLog() {
		return log;
	}

	public int calculate(int amount, int rate) {

		try {
			int r = amount / rate;
			return r;
		} catch (Exception e) {
			this.log(e.getMessage()); 
			return -1;
		}

	}

}
