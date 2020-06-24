package OCP.Violation;

//Open-Closed Modification Class

public class FIxedDeposit {

	private int accountNumber;
	private String AccountName;
	private double principle;
	private int years;
	private FestivalType festival;
	private double rate;

	public FIxedDeposit(int accountNumber, String accountName, double principle, int years, FestivalType festival) {
		this.accountNumber = accountNumber;
		this.AccountName = accountName;
		this.principle = principle;
		this.years = years;
		this.festival = festival;

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

	public FestivalType getFestival() {
		return festival;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "FIxedDeposit [accountNumber=" + accountNumber + ", AccountName=" + AccountName + ", principle="
				+ principle + ", years=" + years + ", festival=" + festival + "]";
	}

	public void setRate() {
		if (festival == FestivalType.NORMAL) {
			setRate(5);
		} else {
			if (festival == FestivalType.HOLI) {
				setRate(10);
			} else {
				setRate(15);
			}
		}

	}

	public double calculateSimpleInterest() {
		setRate();
		years = years * 12 ;
		return (principle * rate * years) / 100;
	}
}
