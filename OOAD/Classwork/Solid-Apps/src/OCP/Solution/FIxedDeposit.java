package OCP.Solution;

//Open-Closed Modification Class

public class FIxedDeposit {

	private int accountNumber;
	private String AccountName;
	private double principle;
	private int years;
	private IFestivalRate ifestival;

	public FIxedDeposit(int accountNumber, String accountName, double principle, int years, IFestivalRate ifestival) {
		this.accountNumber = accountNumber;
		this.AccountName = accountName;
		this.principle = principle;
		this.years = years;
		this.ifestival = ifestival;

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return AccountName;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getYears() {
		return years;
	}

	public IFestivalRate getIfestival() {
		return ifestival;
	}

	@Override
	public String toString() {
		return "FIxedDeposit [accountNumber=" + accountNumber + ", AccountName=" + AccountName + ", principle="
				+ principle + ", years=" + years + ", ifestival=" + ifestival + "]";
	}

	public double calculateSimpleInterest() {
		years = years * 12;
		return (principle * years * ifestival.getRate()) / 100;
	}
}
