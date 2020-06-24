package OCP.Solution;

public class NormalRate implements IFestivalRate {

	@Override
	public double getRate() {
		return 5.0;
	}

	@Override
	public String toString() {
		return "NormalRate [getRate()=" + getRate() + "]";
	}

}
