package LSP.Solution;

public class Square implements IShapes {

	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int calculateArea() {
		return side * side;
	}

}
