package OCP.Solution;

public class DiwaliRate implements IFestivalRate {

	@Override
	public double getRate() {
		return 15.0;
	}

	@Override
	public String toString() {
		return "DiwaliRate [getRate()=" + getRate() + "]";
	}

}
