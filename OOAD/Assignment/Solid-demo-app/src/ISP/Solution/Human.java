package ISP.Solution;

public class Human implements IWorkable,IFeedable {

	@Override
	public void eat() {
		System.out.println("Human Eating ");
	}

	@Override
	public void work() {
		System.out.println("Human Working ");
	}
	
	
	
}
