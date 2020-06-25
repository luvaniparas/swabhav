package ISP.Solution;

public class Manager {

	private IWorkable worker;
	private IFeedable eat;

	public void setWorker(IWorkable worker) {
		this.worker = worker;
	}

	public void setEat(IFeedable eat) {
		this.eat = eat;
	}

	public void work() {
		System.out.println("Working : ");
		worker.work();
	}

	public void eat() {
		System.out.println("Eating : ");
		eat.eat();
	}
}
