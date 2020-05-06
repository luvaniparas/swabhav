package DotComGame_app;

public class SimpleDotCom {
	int[] locs;
	int numOfHits = 0;
	public void setLocation(int location[]) {
		locs = location;
	}

	public String checkYourself(String g) {
		int guess = Integer.parseInt(g);
		String result = "miss";
		for (int cell : locs) {
			if(guess == cell) {
				result = "Hit" ;
				numOfHits++;
				break ;
			}
		}
		if(numOfHits == locs.length) {
			result = "kill";
		}
		System.out.println(result);
		return result ;
	}
}
