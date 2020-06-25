package ISP.Violation;

public class Manager {
	private IWorker worker;

	public IWorker getWorker() {
		return worker;
	}

	public void setWorker(IWorker worker) {
		this.worker = worker;
	}

	public void manage() {
		System.out.println("Working : ");
		worker.work();
		worker.eat();
	}
}
