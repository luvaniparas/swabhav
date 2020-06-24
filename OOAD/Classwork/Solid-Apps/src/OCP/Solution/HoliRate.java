package OCP.Solution;

public class HoliRate implements IFestivalRate {

	@Override
	public double getRate() {
		return 10.0;
	}

	@Override
	public String toString() {
		return "HoliRate [getRate()=" + getRate() + "]";
	}

}
