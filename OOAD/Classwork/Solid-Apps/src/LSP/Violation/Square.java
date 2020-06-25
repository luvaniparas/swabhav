package LSP.Violation;

public class Square extends Rectangle {

	@Override
	public void setWidth(int side) {
		width = side;
		height = side ;
	}

	@Override
	public void setHeight(int side) {
		width = side;
		height = side;
	}

}
