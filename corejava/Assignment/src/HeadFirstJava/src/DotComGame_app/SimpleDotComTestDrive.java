package DotComGame_app;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDotCom dot = new SimpleDotCom();
		int location[] = {2,3,4};
		dot.setLocation(location);
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
	}

}
